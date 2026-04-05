package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.AI_assistant.AllAIAssistantTests;
import test.ManualJUnit.AllManualJUnitTests;

/**
 * Master test suite for the entire Lab Reservation System.
 * This suite aggregates all test suites, including both AI-generated tests
 * and manual JUnit tests, providing a comprehensive test run for the entire project.
 * 
 * Run this suite to execute:
 * - All AI-generated tests from the AI_assistant package
 * - All manual JUnit tests from the ManualJUnit package
 */
@RunWith(Suite.class)
@SuiteClasses({
    AllAIAssistantTests.class,
    AllManualJUnitTests.class
})
public class AllTests {
}
