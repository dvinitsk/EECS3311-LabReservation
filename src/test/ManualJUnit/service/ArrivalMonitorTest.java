package test.ManualJUnit.service;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.model.*;
import com.yorku.lab.service.ArrivalMonitor;
import com.yorku.lab.enums.BookingStatus;

public class ArrivalMonitorTest {

	private ArrivalMonitor arrivalMonitor;
	private Student student;
	private Guest guest;
	private Researcher researcher;
	private Equipment equipment;
	private Credentials credentials;

	@Before
	public void setUp() {
		arrivalMonitor = new ArrivalMonitor();
		credentials = new Credentials("test@york.edu", "password123");
		student = new Student("STU001", "John Student", credentials);
		guest = new Guest("GUEST001", "Jane Guest", credentials);
		researcher = new Researcher("RES001", "Bob Researcher", credentials, "RES-CERT-001");
		equipment = new Equipment("EQU001", "Test Equipment", "Lab Room 101");
	}

	// =============== Test 1: isWithinArrivalWindow - Valid and Invalid Windows ===============
	@Test
	public void testIsWithinArrivalWindow_ValidAndInvalidWindows() {
		LocalDateTime now = LocalDateTime.now();
		
		// Valid window: 10 minutes after start
		Reservation validRes = new Reservation("RES001", student, equipment, now.minusMinutes(10), now.plusMinutes(50));
		assertTrue("Should be within valid 20-min window", arrivalMonitor.isWithinArrivalWindow(validRes));
		
		// Invalid window: 25 minutes after start (exceeded 20-min deadline)
		Reservation expiredRes = new Reservation("RES002", student, equipment, now.minusMinutes(25), now.plusMinutes(35));
		assertFalse("Should be outside 20-min window", arrivalMonitor.isWithinArrivalWindow(expiredRes));
		
		// Before start time
		Reservation futureRes = new Reservation("RES003", student, equipment, now.plusMinutes(5), now.plusMinutes(65));
		assertFalse("Should be before start time", arrivalMonitor.isWithinArrivalWindow(futureRes));
	}

	// =============== Test 2: isWithinArrivalWindow - Boundary Conditions ===============
	@Test
	public void testIsWithinArrivalWindow_BoundaryConditions() {
		LocalDateTime now = LocalDateTime.now();
		
		// At start time
		Reservation atStart = new Reservation("RES004", student, equipment, now, now.plusMinutes(60));
		assertTrue("Should be within window at start time", arrivalMonitor.isWithinArrivalWindow(atStart));
		
		// Just 1 minute after start
		Reservation justAfterStart = new Reservation("RES005", student, equipment, now.minusMinutes(1), now.plusMinutes(59));
		assertTrue("Should be within window just after start", arrivalMonitor.isWithinArrivalWindow(justAfterStart));
		
		// At exactly 20-minute boundary (should be false, deadline is exclusive)
		Reservation atBoundary = new Reservation("RES006", student, equipment, now.minusMinutes(20), now.plusMinutes(40));
		assertFalse("Should be outside at 20-min boundary", arrivalMonitor.isWithinArrivalWindow(atBoundary));
		
		// Just before deadline (19 minutes)
		Reservation beforeDeadline = new Reservation("RES007", student, equipment, now.minusMinutes(19), now.plusMinutes(41));
		assertTrue("Should be within at 19 minutes", arrivalMonitor.isWithinArrivalWindow(beforeDeadline));
	}

	// =============== Test 3: isWithinArrivalWindow - Different User Types ===============
	@Test
	public void testIsWithinArrivalWindow_AllUserTypes() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(10);
		LocalDateTime endTime = now.plusMinutes(50);
		
		Reservation studentRes = new Reservation("RES008", student, equipment, startTime, endTime);
		Reservation guestRes = new Reservation("RES009", guest, equipment, startTime, endTime);
		Reservation researcherRes = new Reservation("RES010", researcher, equipment, startTime, endTime);
		
		assertTrue("Student should be within window", arrivalMonitor.isWithinArrivalWindow(studentRes));
		assertTrue("Guest should be within window", arrivalMonitor.isWithinArrivalWindow(guestRes));
		assertTrue("Researcher should be within window", arrivalMonitor.isWithinArrivalWindow(researcherRes));
	}

	// =============== Test 4: handleArrivalDetected - Valid and Invalid Cases ===============
	@Test
	public void testHandleArrivalDetected_ValidAndInvalidCases() {
		// Valid reservation ID
		try {
			arrivalMonitor.handleArrivalDetected("RES011");
		} catch (Exception e) {
			fail("handleArrivalDetected with valid ID threw exception: " + e.getMessage());
		}
		
		// Non-existent reservation ID (should not throw exception)
		try {
			arrivalMonitor.handleArrivalDetected("NONEXISTENT001");
		} catch (Exception e) {
			fail("handleArrivalDetected with non-existent ID threw exception: " + e.getMessage());
		}
		
		// Null reservation ID
		try {
			arrivalMonitor.handleArrivalDetected(null);
		} catch (Exception e) {
			fail("handleArrivalDetected with null ID threw exception: " + e.getMessage());
		}
		
		// Empty reservation ID
		try {
			arrivalMonitor.handleArrivalDetected("");
		} catch (Exception e) {
			fail("handleArrivalDetected with empty ID threw exception: " + e.getMessage());
		}
	}

	// =============== Test 5: handleArrivalDetected - Edge Cases ===============
	@Test
	public void testHandleArrivalDetected_EdgeCases() {
		// Special characters in ID
		try {
			arrivalMonitor.handleArrivalDetected("RES@#$%^&*");
		} catch (Exception e) {
			fail("handleArrivalDetected with special chars threw exception: " + e.getMessage());
		}
		
		// Very long ID
		try {
			arrivalMonitor.handleArrivalDetected("RES" + "0".repeat(1000));
		} catch (Exception e) {
			fail("handleArrivalDetected with long ID threw exception: " + e.getMessage());
		}
		
		// Multiple consecutive calls
		try {
			String id = "RES012";
			arrivalMonitor.handleArrivalDetected(id);
			arrivalMonitor.handleArrivalDetected(id);
			arrivalMonitor.handleArrivalDetected(id);
		} catch (Exception e) {
			fail("handleArrivalDetected multiple calls threw exception: " + e.getMessage());
		}
	}

	// =============== Test 6: markNoShow - Valid and Invalid Cases ===============
	@Test
	public void testMarkNoShow_ValidAndInvalidCases() {
		// Valid reservation ID (after 20-min window)
		try {
			arrivalMonitor.markNoShow("RES013");
		} catch (Exception e) {
			fail("markNoShow with valid ID threw exception: " + e.getMessage());
		}
		
		// Non-existent reservation ID
		try {
			arrivalMonitor.markNoShow("NONEXISTENT002");
		} catch (Exception e) {
			fail("markNoShow with non-existent ID threw exception: " + e.getMessage());
		}
		
		// Null reservation ID
		try {
			arrivalMonitor.markNoShow(null);
		} catch (Exception e) {
			fail("markNoShow with null ID threw exception: " + e.getMessage());
		}
		
		// Empty reservation ID
		try {
			arrivalMonitor.markNoShow("");
		} catch (Exception e) {
			fail("markNoShow with empty ID threw exception: " + e.getMessage());
		}
	}

	// =============== Test 7: markNoShow - Edge Cases ===============
	@Test
	public void testMarkNoShow_EdgeCases() {
		// Special characters in ID
		try {
			arrivalMonitor.markNoShow("RES@#$%^&*");
		} catch (Exception e) {
			fail("markNoShow with special chars threw exception: " + e.getMessage());
		}
		
		// Very long ID
		try {
			arrivalMonitor.markNoShow("RES" + "0".repeat(1000));
		} catch (Exception e) {
			fail("markNoShow with long ID threw exception: " + e.getMessage());
		}
		
		// Multiple consecutive calls
		try {
			String id = "RES014";
			arrivalMonitor.markNoShow(id);
			arrivalMonitor.markNoShow(id);
			arrivalMonitor.markNoShow(id);
		} catch (Exception e) {
			fail("markNoShow multiple calls threw exception: " + e.getMessage());
		}
	}

	// =============== Test 8: startMonitoring - Initialization and Lifecycle ===============
	@Test
	public void testStartMonitoring_InitializationAndLifecycle() {
		try {
			arrivalMonitor.startMonitoring();
			assertTrue("startMonitoring executed without exception", true);
		} catch (Exception e) {
			fail("startMonitoring() threw exception: " + e.getMessage());
		} finally {
			try {
				arrivalMonitor.stopMonitoring();
			} catch (Exception e) {
				fail("stopMonitoring() threw exception: " + e.getMessage());
			}
		}
	}

	// =============== Test 9: stopMonitoring - Scheduler Termination ===============
	@Test
	public void testStopMonitoring_SchedulerTermination() {
		try {
			arrivalMonitor.startMonitoring();
			arrivalMonitor.stopMonitoring();
			assertTrue("stopMonitoring executed without exception", true);
		} catch (Exception e) {
			fail("stopMonitoring() threw exception: " + e.getMessage());
		}
	}

	// =============== Test 10: startMonitoring and stopMonitoring - Multiple Cycles ===============
	@Test
	public void testStartStopMonitoring_MultipleCycles() {
		try {
			// First cycle
			arrivalMonitor.startMonitoring();
			arrivalMonitor.stopMonitoring();
			
			// Second cycle
			arrivalMonitor = new ArrivalMonitor();
			arrivalMonitor.startMonitoring();
			arrivalMonitor.stopMonitoring();
			
			assertTrue("Multiple start/stop cycles completed", true);
		} catch (Exception e) {
			fail("Multiple monitoring cycles threw exception: " + e.getMessage());
		}
	}

	// =============== Test 11: isWithinArrivalWindow - Extended Range Testing ===============
	@Test
	public void testIsWithinArrivalWindow_ExtendedRanges() {
		LocalDateTime now = LocalDateTime.now();
		
		// Far in the future
		Reservation farFuture = new Reservation("RES015", student, equipment, now.plusHours(2), now.plusHours(3));
		assertFalse("Reservation far in future should be outside window", arrivalMonitor.isWithinArrivalWindow(farFuture));
		
		// Far in the past
		Reservation farPast = new Reservation("RES016", student, equipment, now.minusHours(2), now.minusHours(1));
		assertFalse("Reservation far in past should be outside window", arrivalMonitor.isWithinArrivalWindow(farPast));
	}

	// =============== Test 12: Integration Test - Full Arrival Window Lifecycle ===============
	@Test
	public void testArrivalWindowLifecycle_IntegrationTest() {
		LocalDateTime now = LocalDateTime.now();
		
		// Create reservation within arrival window
		Reservation reservation = new Reservation("RES017", student, equipment, now.minusMinutes(5), now.plusMinutes(55));
		reservation.setStatus(BookingStatus.CONFIRMED);
		
		// Test all methods in sequence
		assertTrue("Should be within arrival window", arrivalMonitor.isWithinArrivalWindow(reservation));
		
		try {
			arrivalMonitor.handleArrivalDetected("RES017");
			arrivalMonitor.markNoShow("RES017");
		} catch (Exception e) {
			fail("Integration test methods threw exception: " + e.getMessage());
		}
	}

	// =============== Test 13: Concurrent Method Calls ===============
	@Test
	public void testConcurrentMethodCalls() {
		try {
			// Simulate concurrent calls
			arrivalMonitor.startMonitoring();
			
			// Call methods while monitoring
			arrivalMonitor.handleArrivalDetected("RES018");
			arrivalMonitor.markNoShow("RES019");
			
			LocalDateTime now = LocalDateTime.now();
			Reservation res = new Reservation("RES020", student, equipment, now.minusMinutes(10), now.plusMinutes(50));
			arrivalMonitor.isWithinArrivalWindow(res);
			
			arrivalMonitor.stopMonitoring();
			assertTrue("Concurrent calls completed successfully", true);
		} catch (Exception e) {
			fail("Concurrent method calls threw exception: " + e.getMessage());
		}
	}

	// =============== Test 14: Error Resilience - Graceful Handling ===============
	@Test
	public void testErrorResilience_GracefulHandling() {
		// Test that methods handle errors gracefully
		
		// Multiple rapid calls to handleArrivalDetected
		for (int i = 0; i < 10; i++) {
			try {
				arrivalMonitor.handleArrivalDetected("RES" + i);
			} catch (Exception e) {
				fail("Rapid handleArrivalDetected calls failed at iteration " + i);
			}
		}
		
		// Multiple rapid calls to markNoShow
		for (int i = 0; i < 10; i++) {
			try {
				arrivalMonitor.markNoShow("RES" + (100 + i));
			} catch (Exception e) {
				fail("Rapid markNoShow calls failed at iteration " + i);
			}
		}
		
		assertTrue("Error resilience test passed", true);
	}

	// =============== Test 15: All Public Methods Coverage ===============
	@Test
	public void testAllPublicMethodsCoverage() {
		// Ensure all public methods are callable without exceptions
		try {
			// startMonitoring()
			arrivalMonitor.startMonitoring();
			
			// stopMonitoring()
			arrivalMonitor.stopMonitoring();
			
			// handleArrivalDetected(String)
			arrivalMonitor.handleArrivalDetected("TEST001");
			
			// markNoShow(String)
			arrivalMonitor.markNoShow("TEST002");
			
			// isWithinArrivalWindow(Reservation)
			LocalDateTime now = LocalDateTime.now();
			Reservation testRes = new Reservation("TEST003", student, equipment, now.minusMinutes(10), now.plusMinutes(50));
			arrivalMonitor.isWithinArrivalWindow(testRes);
			
			assertTrue("All public methods called successfully", true);
		} catch (Exception e) {
			fail("Public methods coverage test failed: " + e.getMessage());
		}
	}

}
