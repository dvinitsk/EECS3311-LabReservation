package test.ManualJUnit.pattern.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yorku.lab.enums.UserType;
import com.yorku.lab.pattern.strategy.*;

public class PricingStrategyFactoryTest {

    @Test
    public void testStudentStrategyClass() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.STUDENT);
        assertTrue(strategy instanceof StudentPricingStrategy);
    }

    @Test
    public void testFacultyStrategyClass() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.FACULTY);
        assertTrue(strategy instanceof FacultyPricingStrategy);
    }

    @Test
    public void testResearcherStrategyClass() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.RESEARCHER);
        assertTrue(strategy instanceof ResearcherPricingStrategy);
    }

    @Test
    public void testGuestStrategyClass() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.GUEST);
        assertTrue(strategy instanceof GuestPricingStrategy);
    }

    @Test
    public void testStudentStrategyBehavior() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.STUDENT);
        assertEquals(10.0, strategy.calculateHourlyRate(), 0.01);
        assertEquals(10.0, strategy.calculateDeposit(1), 0.01);
        assertEquals(20.0, strategy.calculateTotalFee(2), 0.01);
    }

    @Test
    public void testFacultyStrategyBehavior() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.FACULTY);
        assertEquals(15.0, strategy.calculateHourlyRate(), 0.01);
        assertEquals(15.0, strategy.calculateDeposit(1), 0.01);
        assertEquals(30.0, strategy.calculateTotalFee(2), 0.01);
    }

    @Test
    public void testResearcherStrategyBehavior() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.RESEARCHER);
        assertEquals(20.0, strategy.calculateHourlyRate(), 0.01);
        assertEquals(20.0, strategy.calculateDeposit(1), 0.01);
        assertEquals(40.0, strategy.calculateTotalFee(2.0), 0.01);
    }

    @Test
    public void testGuestStrategyBehavior() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.GUEST);
        assertEquals(30.0, strategy.calculateHourlyRate(), 0.01);
        assertEquals(30.0, strategy.calculateDeposit(1), 0.01);
        assertEquals(60.0, strategy.calculateTotalFee(2.0), 0.01);
    }

    @Test
    public void testManagerThrowsException() {
        try {
            PricingStrategyFactory.getStrategy(UserType.MANAGER);
            fail("Manager should not have a pricing strategy.");
        } catch (IllegalArgumentException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testLabCoordinatorThrowsException() {
        try {
            PricingStrategyFactory.getStrategy(UserType.LABCOORDINATOR);
            fail("Lab coordinator should not have a pricing strategy.");
        } catch (IllegalArgumentException expected) {
            assertNotNull(expected);
        }
    }
}
