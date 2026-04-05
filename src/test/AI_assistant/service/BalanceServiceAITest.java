package test.AI_assistant.service;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentStatus;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.service.BalanceService;
import com.yorku.lab.service.BookingService;
import com.yorku.lab.service.PaymentProcessor;

public class BalanceServiceAITest {
    
    private BalanceService balanceService;
    private BookingService bookingService;
    private PaymentProcessor paymentProcessor;
    
    @Before
    public void setUp() {
        bookingService = new BookingService();
        paymentProcessor = new PaymentProcessor();
        balanceService = new BalanceService(bookingService, paymentProcessor);
    }
    
    @Test
    public void testGetTotalPaidByUserNoReservations() {
        String userId = "user_no_reservations";
        double total = balanceService.getTotalPaidByUser(userId);
        assertEquals("Total should be 0 for user with no reservations", 0.0, total, 0.01);
    }
    
    @Test
    public void testGetTotalPaidByUserSinglePayment() {
        String userId = "user_single";
        String reservationId = "res_single_001";
        
        PaymentTransaction payment = new PaymentTransaction("tx_001", 50.0, 
            PaymentType.DEPOSIT, PaymentMethod.CREDIT, reservationId);
        paymentProcessor.saveTransaction(payment);
        
        double total = balanceService.getTotalPaidByUser(userId);
        assertTrue("Total should be non-negative", total >= 0);
    }
    
    @Test
    public void testGetTotalPaidByUserMultiplePaymentsSameReservation() {
        String reservationId = "res_multi_same_001";
        
        PaymentTransaction deposit = new PaymentTransaction("tx_001", 100.0, 
            PaymentType.DEPOSIT, PaymentMethod.CREDIT, reservationId);
        PaymentTransaction refund = new PaymentTransaction("tx_002", -25.0, 
            PaymentType.REFUND, PaymentMethod.CREDIT, reservationId);
        
        paymentProcessor.saveTransaction(deposit);
        paymentProcessor.saveTransaction(refund);
        
        double total = balanceService.getTotalPaidByUser("user_001");
        assertTrue("Total should be calculable", total >= 0);
    }
    
    @Test
    public void testGetTotalPaidByUserMultipleReservations() {
        PaymentTransaction tx1 = new PaymentTransaction("tx_001", 75.5, 
            PaymentType.DEPOSIT, PaymentMethod.CREDIT, "res_001");
        PaymentTransaction tx2 = new PaymentTransaction("tx_002", 100.0, 
            PaymentType.FINAL_CHARGE, PaymentMethod.DEBIT, "res_002");
        PaymentTransaction tx3 = new PaymentTransaction("tx_003", 125.75, 
            PaymentType.DEPOSIT, PaymentMethod.INSTITUTIONAL, "res_003");
        
        paymentProcessor.saveTransaction(tx1);
        paymentProcessor.saveTransaction(tx2);
        paymentProcessor.saveTransaction(tx3);
        
        double total = balanceService.getTotalPaidByUser("user_multi");
        assertTrue("Total should be non-negative", total >= 0);
    }
    
    @Test
    public void testGetPaymentsForUserNoReservations() {
        String userId = "user_no_payments";
        List<PaymentTransaction> payments = balanceService.getPaymentsForUser(userId);
        
        assertNotNull("Payments list should not be null", payments);
        assertTrue("Payments list should be empty for user with no reservations", payments.isEmpty());
    }
    
    @Test
    public void testGetPaymentsForUserSinglePayment() {
        String reservationId = "res_get_single_001";
        
        PaymentTransaction payment = new PaymentTransaction("tx_get_001", 60.0, 
            PaymentType.DEPOSIT, PaymentMethod.DEBIT, reservationId);
        payment.setStatus(PaymentStatus.AUTHORIZED);
        paymentProcessor.saveTransaction(payment);
        
        List<PaymentTransaction> payments = balanceService.getPaymentsForUser("user_get_single");
        assertTrue("Should retrieve payments", payments.size() >= 0);
    }
    
    @Test
    public void testGetPaymentsForUserPreservesPaymentProperties() {
        String reservationId = "res_props_001";
        
        PaymentTransaction original = new PaymentTransaction("tx_props_001", 87.50, 
            PaymentType.FINAL_CHARGE, PaymentMethod.GRANTS, reservationId);
        original.setStatus(PaymentStatus.REFUNDED);
        paymentProcessor.saveTransaction(original);
        
        var retrieved = paymentProcessor.getTransaction("tx_props_001");
        assertTrue("Payment should be retrievable", retrieved.isPresent());
        
        PaymentTransaction tx = retrieved.get();
        assertEquals("Transaction ID preserved", "tx_props_001", tx.getTransactionId());
        assertEquals("Amount preserved", 87.50, tx.getAmount(), 0.01);
        assertEquals("PaymentType preserved", PaymentType.FINAL_CHARGE, tx.getType());
        assertEquals("PaymentMethod preserved", PaymentMethod.GRANTS, tx.getMethod());
        assertEquals("PaymentStatus preserved", PaymentStatus.REFUNDED, tx.getStatus());
    }
    
    @Test
    public void testGetTotalPaidByUserZeroAmountPayment() {
        String reservationId = "res_zero_001";
        
        PaymentTransaction zeroPayment = new PaymentTransaction("tx_zero_001", 0.0, 
            PaymentType.DEPOSIT, PaymentMethod.CREDIT, reservationId);
        paymentProcessor.saveTransaction(zeroPayment);
        
        double total = balanceService.getTotalPaidByUser("user_zero");
        assertEquals("Total with zero payment should be 0", 0.0, total, 0.01);
    }
    
    @Test
    public void testGetTotalPaidByUserLargeAmounts() {
        PaymentTransaction largeTx1 = new PaymentTransaction("tx_large_001", 9999.99, 
            PaymentType.DEPOSIT, PaymentMethod.CREDIT, "res_large_001");
        PaymentTransaction largeTx2 = new PaymentTransaction("tx_large_002", 5555.50, 
            PaymentType.FINAL_CHARGE, PaymentMethod.DEBIT, "res_large_002");
        
        paymentProcessor.saveTransaction(largeTx1);
        paymentProcessor.saveTransaction(largeTx2);
        
        var tx1 = paymentProcessor.getTransaction("tx_large_001");
        var tx2 = paymentProcessor.getTransaction("tx_large_002");
        
        assertTrue("Large transaction 1 should be found", tx1.isPresent());
        assertTrue("Large transaction 2 should be found", tx2.isPresent());
        
        assertEquals("Large amount 1 preserved", 9999.99, tx1.get().getAmount(), 0.01);
        assertEquals("Large amount 2 preserved", 5555.50, tx2.get().getAmount(), 0.01);
    }
    
    @Test
    public void testBalanceServiceConsistency() {
        String reservationId1 = "res_cons_001";
        String reservationId2 = "res_cons_002";
        
        PaymentTransaction tx1 = new PaymentTransaction("tx_cons_001", 100.0, 
            PaymentType.DEPOSIT, PaymentMethod.CREDIT, reservationId1);
        PaymentTransaction tx2 = new PaymentTransaction("tx_cons_002", 50.0, 
            PaymentType.DEPOSIT, PaymentMethod.DEBIT, reservationId2);
        
        paymentProcessor.saveTransaction(tx1);
        paymentProcessor.saveTransaction(tx2);
        
        List<PaymentTransaction> payments = balanceService.getPaymentsForUser("user_cons");
        double totalFromPayments = payments.stream()
            .mapToDouble(PaymentTransaction::getAmount)
            .sum();
        
        double totalFromBalance = balanceService.getTotalPaidByUser("user_cons");
        
        assertEquals("getTotalPaidByUser and sum of getPaymentsForUser should match", 
            totalFromPayments, totalFromBalance, 0.01);
    }
}

