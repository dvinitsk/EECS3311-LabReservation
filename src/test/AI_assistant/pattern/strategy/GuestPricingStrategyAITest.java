package test.AI_assistant.pattern.strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.pattern.strategy.GuestPricingStrategy;

public class GuestPricingStrategyAITest {

    private GuestPricingStrategy strategy;

    @Before
    public void setUp() {
        strategy = new GuestPricingStrategy();
    }

    @Test
    public void testHourlyRate() {
        assertEquals(30.0, strategy.calculateHourlyRate(), 0.01);
    }

    @Test
    public void testDepositForOneHour() {
        assertEquals(30.0, strategy.calculateDeposit(1), 0.01);
    }

    @Test
    public void testDepositForZeroHours() {
        assertEquals(30.0, strategy.calculateDeposit(0), 0.01);
    }

    @Test
    public void testDepositForManyHours() {
        assertEquals(30.0, strategy.calculateDeposit(8), 0.01);
    }

    @Test
    public void testTotalFeeForOneHour() {
        assertEquals(30.0, strategy.calculateTotalFee(1.0), 0.01);
    }

    @Test
    public void testTotalFeeForIntegerHours() {
        assertEquals(90.0, strategy.calculateTotalFee(3.0), 0.01);
    }

    @Test
    public void testTotalFeeForDecimalHours() {
        assertEquals(75.0, strategy.calculateTotalFee(2.5), 0.01);
    }

    @Test
    public void testTotalFeeForZeroHours() {
        assertEquals(0.0, strategy.calculateTotalFee(0.0), 0.01);
    }

    @Test
    public void testTotalFeeForNegativeHours() {
        assertEquals(-30.0, strategy.calculateTotalFee(-1.0), 0.01);
    }

    @Test
    public void testRepeatedCallsStayConsistent() {
        assertEquals(45.0, strategy.calculateTotalFee(1.5), 0.01);
        assertEquals(45.0, strategy.calculateTotalFee(1.5), 0.01);
    }
}
