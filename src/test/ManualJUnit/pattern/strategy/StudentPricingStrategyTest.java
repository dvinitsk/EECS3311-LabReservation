package test.ManualJUnit.pattern.strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.pattern.strategy.StudentPricingStrategy;

public class StudentPricingStrategyTest {

    private StudentPricingStrategy strategy;

    @Before
    public void setUp() {
        strategy = new StudentPricingStrategy();
    }

    @Test
    public void testHourlyRate() {
        assertEquals(10.0, strategy.calculateHourlyRate(), 0.01);
    }

    @Test
    public void testDepositForOneHour() {
        assertEquals(10.0, strategy.calculateDeposit(1), 0.01);
    }

    @Test
    public void testDepositForZeroHours() {
        assertEquals(10.0, strategy.calculateDeposit(0), 0.01);
    }

    @Test
    public void testDepositForManyHours() {
        assertEquals(10.0, strategy.calculateDeposit(8), 0.01);
    }

    @Test
    public void testTotalFeeForOneHour() {
        assertEquals(10.0, strategy.calculateTotalFee(1.0), 0.01);
    }

    @Test
    public void testTotalFeeForIntegerHours() {
        assertEquals(30.0, strategy.calculateTotalFee(3.0), 0.01);
    }

    @Test
    public void testTotalFeeForDecimalHours() {
        assertEquals(25.0, strategy.calculateTotalFee(2.5), 0.01);
    }

    @Test
    public void testTotalFeeForZeroHours() {
        assertEquals(0.0, strategy.calculateTotalFee(0.0), 0.01);
    }

    @Test
    public void testTotalFeeForFourHours() {
        assertEquals(40.0, strategy.calculateTotalFee(4.0), 0.01);
    }

    @Test
    public void testRepeatedCallsStayConsistent() {
        assertEquals(15.0, strategy.calculateTotalFee(1.5), 0.01);
        assertEquals(15.0, strategy.calculateTotalFee(1.5), 0.01);
    }
}
