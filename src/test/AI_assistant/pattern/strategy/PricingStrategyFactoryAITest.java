package test.AI_assistant.pattern.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yorku.lab.enums.UserType;
import com.yorku.lab.pattern.strategy.*;

public class PricingStrategyFactoryAITest {

    @Test
    public void testFactoryReturnsStudentStrategy() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.STUDENT);
        assertTrue(strategy instanceof StudentPricingStrategy);
    }

    @Test
    public void testFactoryReturnsFacultyStrategy() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.FACULTY);
        assertTrue(strategy instanceof FacultyPricingStrategy);
    }

    @Test
    public void testFactoryReturnsResearcherStrategy() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.RESEARCHER);
        assertTrue(strategy instanceof ResearcherPricingStrategy);
    }

    @Test
    public void testFactoryReturnsGuestStrategy() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.GUEST);
        assertTrue(strategy instanceof GuestPricingStrategy);
    }

    @Test
    public void testFactoryReturnedStudentRate() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.STUDENT);
        assertEquals(10.0, strategy.calculateHourlyRate(), 0.01);
    }

    @Test
    public void testFactoryReturnedFacultyRate() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.FACULTY);
        assertEquals(15.0, strategy.calculateHourlyRate(), 0.01);
    }

    @Test
    public void testFactoryReturnedResearcherRate() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.RESEARCHER);
        assertEquals(20.0, strategy.calculateHourlyRate(), 0.01);
    }

    @Test
    public void testFactoryReturnedGuestRate() {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(UserType.GUEST);
        assertEquals(30.0, strategy.calculateHourlyRate(), 0.01);
    }

    @Test
    public void testManagerExceptionMessageContainsUserType() {
        try {
            PricingStrategyFactory.getStrategy(UserType.MANAGER);
            fail("Expected manager lookup to fail.");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("MANAGER"));
        }
    }

    @Test
    public void testLabCoordinatorExceptionMessageContainsUserType() {
        try {
            PricingStrategyFactory.getStrategy(UserType.LABCOORDINATOR);
            fail("Expected lab coordinator lookup to fail.");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("LABCOORDINATOR"));
        }
    }
}
