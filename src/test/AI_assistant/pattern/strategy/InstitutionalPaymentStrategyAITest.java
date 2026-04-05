package test.AI_assistant.pattern.strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentStatus;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.gateway.PaymentGateway;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.pattern.strategy.InstitutionalPaymentStrategy;

public class InstitutionalPaymentStrategyAITest {

    private InstitutionalPaymentStrategy strategy;

    @Before
    public void setUp() {
        strategy = new InstitutionalPaymentStrategy();
    }

    @Test
    public void testPayReturnsTransaction() {
        PaymentTransaction t = strategy.pay(50.0);
        assertNotNull(t);
    }

    @Test
    public void testTransactionIdNotNull() {
        PaymentTransaction t = strategy.pay(50.0);
        assertNotNull(t.getTransactionId());
    }

    @Test
    public void testNormalAmountPreserved() {
        PaymentTransaction t = strategy.pay(50.0);
        assertEquals(50.0, t.getAmount(), 0.01);
    }

    @Test
    public void testZeroAmountPreserved() {
        PaymentTransaction t = strategy.pay(0.0);
        assertEquals(0.0, t.getAmount(), 0.01);
    }

    @Test
    public void testLargeAmountPreserved() {
        PaymentTransaction t = strategy.pay(5000.75);
        assertEquals(5000.75, t.getAmount(), 0.01);
    }

    @Test
    public void testMethodIsInstitutional() {
        PaymentTransaction t = strategy.pay(10.0);
        assertEquals(PaymentMethod.INSTITUTIONAL, t.getMethod());
    }

    @Test
    public void testTypeIsFinalCharge() {
        PaymentTransaction t = strategy.pay(10.0);
        assertEquals(PaymentType.FINAL_CHARGE, t.getType());
    }

    @Test
    public void testStatusIsAuthorized() {
        PaymentTransaction t = strategy.pay(10.0);
        assertEquals(PaymentStatus.AUTHORIZED, t.getStatus());
    }

    @Test
    public void testReservationIdStartsNull() {
        PaymentTransaction t = strategy.pay(10.0);
        assertNull(t.getReservationId());
    }

    @Test
    public void testTwoTransactionsHaveDifferentIds() {
        PaymentTransaction t1 = strategy.pay(10.0);
        PaymentTransaction t2 = strategy.pay(10.0);
        assertNotEquals(t1.getTransactionId(), t2.getTransactionId());
    }

    @Test
    public void testImplementsPaymentGateway() {
        assertTrue(strategy instanceof PaymentGateway);
    }
}
