package test.ManualJUnit.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.*;
import com.yorku.lab.model.PaymentTransaction;

public class PaymentTransactionTest {

	private PaymentTransaction payment;
	
	@Before
	public void setUp() {
		payment = new PaymentTransaction("PAY001", 100.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT);
	}
	
	@Test
	public void testPaymentTransactionCreation() {
		assertEquals("PAY001", payment.getTransactionId());
		assertEquals(100.0, payment.getAmount(), 0.01);
		assertEquals(PaymentType.DEPOSIT, payment.getType());
		assertEquals(PaymentMethod.CREDIT, payment.getMethod());
		assertEquals(PaymentStatus.AUTHORIZED, payment.getStatus());
	}
	
	@Test
	public void testPaymentTransactionWithReservationId() {
		PaymentTransaction payment2 = new PaymentTransaction("PAY002", 50.0, 
			PaymentType.FINAL_CHARGE, PaymentMethod.DEBIT, "RES001");
		assertEquals("PAY002", payment2.getTransactionId());
		assertEquals(50.0, payment2.getAmount(), 0.01);
		assertEquals(PaymentType.FINAL_CHARGE, payment2.getType());
		assertEquals(PaymentMethod.DEBIT, payment2.getMethod());
		assertEquals("RES001", payment2.getReservationId());
		assertEquals(PaymentStatus.AUTHORIZED, payment2.getStatus());
	}
	
	@Test
	public void testSetPaymentType() {
		assertEquals(PaymentType.DEPOSIT, payment.getType());
		payment.setType(PaymentType.REFUND);
		assertEquals(PaymentType.REFUND, payment.getType());
	}
	
	@Test
	public void testSetPaymentStatus() {
		assertEquals(PaymentStatus.AUTHORIZED, payment.getStatus());
		payment.setStatus(PaymentStatus.FAILED);
		assertEquals(PaymentStatus.FAILED, payment.getStatus());
	}
	
	@Test
	public void testSetPaymentStatusRefunded() {
		payment.setStatus(PaymentStatus.REFUNDED);
		assertEquals(PaymentStatus.REFUNDED, payment.getStatus());
	}
	
	@Test
	public void testSetReservationId() {
		PaymentTransaction payment2 = new PaymentTransaction("PAY003", 75.0, 
			PaymentType.DEPOSIT, PaymentMethod.INSTITUTIONAL);
		assertNull(payment2.getReservationId());
		payment2.setReservationId("RES002");
		assertEquals("RES002", payment2.getReservationId());
	}
	
	@Test
	public void testMultiplePaymentMethods() {
		PaymentTransaction creditPayment = new PaymentTransaction("PAY004", 100.0, 
			PaymentType.DEPOSIT, PaymentMethod.CREDIT);
		assertEquals(PaymentMethod.CREDIT, creditPayment.getMethod());
		
		PaymentTransaction debitPayment = new PaymentTransaction("PAY005", 100.0, 
			PaymentType.DEPOSIT, PaymentMethod.DEBIT);
		assertEquals(PaymentMethod.DEBIT, debitPayment.getMethod());
		
		PaymentTransaction grantsPayment = new PaymentTransaction("PAY006", 100.0, 
			PaymentType.DEPOSIT, PaymentMethod.GRANTS);
		assertEquals(PaymentMethod.GRANTS, grantsPayment.getMethod());
	}
	
	@Test
	public void testMultiplePaymentTypes() {
		PaymentTransaction depositPayment = new PaymentTransaction("PAY007", 50.0, 
			PaymentType.DEPOSIT, PaymentMethod.CREDIT);
		assertEquals(PaymentType.DEPOSIT, depositPayment.getType());
		
		PaymentTransaction finalChargePayment = new PaymentTransaction("PAY008", 100.0, 
			PaymentType.FINAL_CHARGE, PaymentMethod.DEBIT);
		assertEquals(PaymentType.FINAL_CHARGE, finalChargePayment.getType());
		
		PaymentTransaction refundPayment = new PaymentTransaction("PAY009", 25.0, 
			PaymentType.REFUND, PaymentMethod.CREDIT);
		assertEquals(PaymentType.REFUND, refundPayment.getType());
	}
	
	@Test
	public void testMultiplePaymentStatusChanges() {
		assertEquals(PaymentStatus.AUTHORIZED, payment.getStatus());
		payment.setStatus(PaymentStatus.FAILED);
		assertEquals(PaymentStatus.FAILED, payment.getStatus());
		payment.setStatus(PaymentStatus.REFUNDED);
		assertEquals(PaymentStatus.REFUNDED, payment.getStatus());
	}
	
	@Test
	public void testPaymentTransactionVariousAmounts() {
		PaymentTransaction smallPayment = new PaymentTransaction("PAY010", 10.50, 
			PaymentType.DEPOSIT, PaymentMethod.CREDIT);
		assertEquals(10.50, smallPayment.getAmount(), 0.01);
		
		PaymentTransaction largePayment = new PaymentTransaction("PAY011", 5000.99, 
			PaymentType.FINAL_CHARGE, PaymentMethod.INSTITUTIONAL);
		assertEquals(5000.99, largePayment.getAmount(), 0.01);
		
		PaymentTransaction zeroPayment = new PaymentTransaction("PAY012", 0.0, 
			PaymentType.REFUND, PaymentMethod.DEBIT);
		assertEquals(0.0, zeroPayment.getAmount(), 0.01);
	}

}
