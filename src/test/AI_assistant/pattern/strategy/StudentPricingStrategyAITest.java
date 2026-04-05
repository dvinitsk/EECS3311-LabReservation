package test.AI_assistant.pattern.strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.pattern.strategy.StudentPricingStrategy;

public class StudentPricingStrategyAITest {

    private StudentPricingStrategy strategy;

    @Before
    public void setUp() {
        strategy = new StudentPricingStrategy();
    }

    @Test
    public void testHourlyRateValue() {
        assertEquals(10.0, strategy.calculateHourlyRate(), 0.01);
    }

    @Test
    public void testDepositUsesCurrentFlatRate() {
        assertEquals(10.0, strategy.calculateDeposit(4), 0.01);
    }

    @Test
    public void testDepositForOneHour() {
        assertEquals(10.0, strategy.calculateDeposit(1), 0.01);
    }

    @Test
    public void testTotalFeeForTwoHours() {
        assertEquals(20.0, strategy.calculateTotalFee(2.0), 0.01);
    }

    @Test
    public void testTotalFeeForThreeHours() {
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
    public void testTotalFeeForNegativeHoursCurrentBehavior() {
        assertEquals(-10.0, strategy.calculateTotalFee(-1.0), 0.01);
    }

    @Test
    public void testRepeatedCallsStayConsistent() {
        assertEquals(25.0, strategy.calculateTotalFee(2.5), 0.01);
        assertEquals(25.0, strategy.calculateTotalFee(2.5), 0.01);
    }
}
