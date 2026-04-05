package test.AI_assistant.pattern.strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentStatus;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.pattern.strategy.CreditPaymentStrategy;

public class CreditPaymentStrategyAITest {

    private CreditPaymentStrategy strategy;

    @Before
    public void setUp() {
        strategy = new CreditPaymentStrategy();
    }

    @Test
    public void testPaymentCreatesTransaction() {
        PaymentTransaction t = strategy.pay(25.0);
        assertNotNull(t);
    }

    @Test
    public void testTransactionUsesCreditMethod() {
        PaymentTransaction t = strategy.pay(25.0);
        assertEquals(PaymentMethod.CREDIT, t.getMethod());
    }

    @Test
    public void testTransactionStartsAuthorized() {
        PaymentTransaction t = strategy.pay(25.0);
        assertEquals(PaymentStatus.AUTHORIZED, t.getStatus());
    }

    @Test
    public void testTransactionTypeIsFinalCharge() {
        PaymentTransaction t = strategy.pay(25.0);
        assertEquals(PaymentType.FINAL_CHARGE, t.getType());
    }

    @Test
    public void testTransactionAmountIsPreserved() {
        PaymentTransaction t = strategy.pay(25.0);
        assertEquals(25.0, t.getAmount(), 0.01);
    }

    @Test
    public void testTransactionIdNotNull() {
        PaymentTransaction t = strategy.pay(25.0);
        assertNotNull(t.getTransactionId());
    }

    @Test
    public void testReservationIdStartsNull() {
        PaymentTransaction t = strategy.pay(25.0);
        assertNull(t.getReservationId());
    }

    @Test
    public void testZeroAmountIsAllowed() {
        PaymentTransaction t = strategy.pay(0.0);
        assertEquals(0.0, t.getAmount(), 0.01);
    }

    @Test
    public void testLargeAmountIsAllowed() {
        PaymentTransaction t = strategy.pay(5000.75);
        assertEquals(5000.75, t.getAmount(), 0.01);
    }

    @Test
    public void testTransactionIdsDifferAcrossCalls() {
        PaymentTransaction t1 = strategy.pay(25.0);
        PaymentTransaction t2 = strategy.pay(25.0);
        assertNotEquals(t1.getTransactionId(), t2.getTransactionId());
    }
}
