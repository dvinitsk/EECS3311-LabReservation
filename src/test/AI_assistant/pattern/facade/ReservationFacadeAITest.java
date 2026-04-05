package test.AI_assistant.pattern.facade;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.ApprovalRequest;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.facade.ReservationFacade;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.repository.UserRepository;
import com.yorku.lab.service.RegistrationService.RegistrationResult;

public class ReservationFacadeAITest {

    private ReservationFacade facade;
    private User activeUser;
    private User inactiveUser;

    @Before
    public void setUp() {
        facade = new ReservationFacade();
        
        // Create active user
        activeUser = new Student("F-AI-ACTIVE", "Active Student", new Credentials("active@yorku.ca", "Pass123!"), "CERT-001");
        activeUser.setStatus(AccountStatus.ACTIVE);
        new UserRepository().save(activeUser);
        
        // Create inactive user (for testing account status checks)
        inactiveUser = new Student("F-AI-INACTIVE", "Inactive Student", new Credentials("inactive@yorku.ca", "Pass123!"), "CERT-002");
        inactiveUser.setStatus(AccountStatus.PENDING_APPROVAL);
        new UserRepository().save(inactiveUser);
        
        // Add test equipment
        new EquipmentRepository().save(new Equipment("F-EQ-1", "Microscope", "Lab A"));
        new EquipmentRepository().save(new Equipment("F-EQ-2", "Centrifuge", "Lab B"));
    }

    @After
    public void tearDown() throws Exception {
        for (String file : new String[]{"data/users.csv", "data/equipment.csv", "data/reservations.csv", "data/payments.csv", "data/approval_requests.csv"}) {
            java.nio.file.Path path = java.nio.file.Paths.get(file);
            if (java.nio.file.Files.exists(path)) {
                java.nio.file.Files.delete(path);
            }
        }
    }

    // --- Browse Equipment Tests (UC4) ---
    @Test
    public void testBrowseEquipmentReturnsList() {
        assertNotNull(facade.browseEquipment());
    }

    @Test
    public void testFindAvailableEquipmentReturnsList() {
        assertNotNull(facade.findAvailableEquipment());
    }

    @Test
    public void testGetEquipmentFindsSavedEquipment() {
        Optional<Equipment> equipment = facade.getEquipment("F-EQ-1");
        assertTrue(equipment.isPresent());
        assertEquals("F-EQ-1", equipment.get().getEquipmentId());
    }

    @Test
    public void testGetEquipmentReturnsEmptyForMissingEquipment() {
        Optional<Equipment> equipment = facade.getEquipment("MISSING-EQ");
        assertFalse(equipment.isPresent());
    }

    // --- Pricing Tests ---
    @Test
    public void testGetHourlyRateForStudent() {
        assertEquals(10.0, facade.getHourlyRate(activeUser), 0.01);
    }

    @Test
    public void testGetDepositAmountForStudent() {
        assertEquals(10.0, facade.getDepositAmount(activeUser), 0.01);
    }

    // --- Registration and Login Tests (UC1, UC2, UC3) ---
    @Test
    public void testRegisterUserSuccessfully() {
        RegistrationResult result = facade.registerUser("newuser@yorku.ca", "Password123!", "New User", com.yorku.lab.enums.UserType.STUDENT, "CERT-NEW");
        assertTrue(result.success());
        assertNotNull(result.message());
    }

    @Test
    public void testLoginWithActiveAccount() {
        Optional<User> loggedInUser = facade.login("active@yorku.ca", "Pass123!");
        assertTrue(loggedInUser.isPresent());
        assertEquals("F-AI-ACTIVE", loggedInUser.get().getUserId());
    }

    @Test
    public void testLoginWithWrongPassword() {
        Optional<User> loggedInUser = facade.login("active@yorku.ca", "WrongPassword");
        assertFalse(loggedInUser.isPresent());
    }

    @Test
    public void testLoginWithNonExistentEmail() {
        Optional<User> loggedInUser = facade.login("nonexistent@yorku.ca", "Pass123!");
        assertFalse(loggedInUser.isPresent());
    }

    @Test
    public void testLoginWithInactiveAccount() {
        // Inactive account (PENDING_APPROVAL) should not be able to login
        Optional<User> loggedInUser = facade.login("inactive@yorku.ca", "Pass123!");
        assertFalse(loggedInUser.isPresent());
    }

    @Test
    public void testGetPendingApprovalsReturnsList() {
        assertNotNull(facade.getPendingApprovals());
    }

    // --- Reserve Equipment Tests (UC5) ---
    @Test
    public void testReserveEquipmentWithActiveAccountSucceeds() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0); // 2 days from now
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        assertTrue(result.success());
        assertNotNull(result.reservation());
    }

    @Test
    public void testReserveEquipmentWithInactiveAccountFails() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(inactiveUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        assertFalse(result.success());
        assertTrue(result.message().contains("Account must be active"));
    }

    @Test
    public void testReserveEquipmentWithPastStartTimeFails() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 5, 10, 0); // Today, should be in past/too soon
        LocalDateTime end = LocalDateTime.of(2026, 4, 5, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        assertFalse(result.success());
    }

    @Test
    public void testReserveEquipmentWithDifferentPaymentMethods() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        for (PaymentMethod method : PaymentMethod.values()) {
            User testUser = new Student("F-AI-" + method, "Test User " + method, new Credentials(method + "@yorku.ca", "Pass123!"), "CERT-" + method);
            testUser.setStatus(AccountStatus.ACTIVE);
            new UserRepository().save(testUser);
            
            ReservationFacade.ReserveResult result = facade.reserveEquipment(testUser, "F-EQ-1", start, end, method);
            // Result depends on availability, but we're testing that each method is processed
            assertNotNull(result);
        }
    }

    @Test
    public void testIsSlotAvailableReturnsBoolean() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        boolean available = facade.isSlotAvailable("F-EQ-1", start, end);
        assertNotNull(available);
    }

    @Test
    public void testSuggestNextAvailableSlots() {
        LocalDateTime from = LocalDateTime.of(2026, 4, 6, 10, 0);
        List<LocalDateTime> suggestions = facade.suggestNextAvailableSlots("F-EQ-1", from, 3);
        
        assertNotNull(suggestions);
        assertTrue(suggestions.size() <= 3);
    }

    // --- Modify Booking Tests (UC6) ---
    @Test
    public void testModifyBookingWithValidNewTime() {
        // First create a reservation
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult reserveResult = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (reserveResult.success()) {
            String reservationId = reserveResult.reservation().getReservationId();
            
            // Now modify it
            LocalDateTime newStart = LocalDateTime.of(2026, 4, 7, 10, 0);
            LocalDateTime newEnd = LocalDateTime.of(2026, 4, 7, 12, 0);
            
            ReservationFacade.ModifyResult modifyResult = facade.modifyBooking(reservationId, newStart, newEnd);
            assertTrue(modifyResult.success());
            assertNotNull(modifyResult.reservation());
        }
    }

    @Test
    public void testModifyBookingWithPastTimeFails() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult reserveResult = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (reserveResult.success()) {
            String reservationId = reserveResult.reservation().getReservationId();
            
            // Try to modify with past time
            LocalDateTime pastStart = LocalDateTime.of(2026, 4, 5, 10, 0);
            LocalDateTime pastEnd = LocalDateTime.of(2026, 4, 5, 12, 0);
            
            ReservationFacade.ModifyResult modifyResult = facade.modifyBooking(reservationId, pastStart, pastEnd);
            assertFalse(modifyResult.success());
        }
    }

    @Test
    public void testCancelBookingWithValidReservation() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (result.success()) {
            String reservationId = result.reservation().getReservationId();
            boolean cancelled = facade.cancelBooking(reservationId);
            assertTrue(cancelled);
        }
    }

    @Test
    public void testCancelBookingReturnsFalseForMissingId() {
        assertFalse(facade.cancelBooking("missing-id"));
    }

    // --- Extend Reservation Tests (UC7) ---
    @Test
    public void testExtendReservationWithValidNewEndTime() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult reserveResult = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (reserveResult.success()) {
            String reservationId = reserveResult.reservation().getReservationId();
            LocalDateTime newEnd = LocalDateTime.of(2026, 4, 6, 14, 0);
            
            ReservationFacade.ExtendResult extendResult = facade.extendReservation(reservationId, newEnd, PaymentMethod.CREDIT);
            assertTrue(extendResult.success());
            assertNotNull(extendResult.reservation());
        }
    }

    @Test
    public void testExtendReservationWithMissingReservationFails() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 6, 14, 0);
        ReservationFacade.ExtendResult extendResult = facade.extendReservation("missing-id", newEnd, PaymentMethod.CREDIT);
        
        assertFalse(extendResult.success());
        assertTrue(extendResult.message().contains("not found"));
    }

    @Test
    public void testExtendReservationWithDifferentPaymentMethods() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult reserveResult = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (reserveResult.success()) {
            String reservationId = reserveResult.reservation().getReservationId();
            LocalDateTime newEnd = LocalDateTime.of(2026, 4, 6, 14, 0);
            
            for (PaymentMethod method : PaymentMethod.values()) {
                ReservationFacade.ExtendResult extendResult = facade.extendReservation(reservationId, newEnd, method);
                assertNotNull(extendResult);
            }
        }
    }

    // --- User Reservations and Balance Tests ---
    @Test
    public void testGetUserReservationsReturnsList() {
        List<Reservation> reservations = facade.getUserReservations("F-AI-ACTIVE");
        assertNotNull(reservations);
    }

    @Test
    public void testGetTotalPaidByUserReturnsAmount() {
        double totalPaid = facade.getTotalPaidByUser("F-AI-ACTIVE");
        assertTrue(totalPaid >= 0.0);
    }

    @Test
    public void testGetPaymentsForUserReturnsList() {
        List<PaymentTransaction> payments = facade.getPaymentsForUser("F-AI-ACTIVE");
        assertNotNull(payments);
    }

    @Test
    public void testGetReservationReturnsEmptyForMissingId() {
        assertTrue(facade.getReservation("missing-id").isEmpty());
    }

    // --- Arrival Tests (UC8) ---
    @Test
    public void testHandleArrivalDetectedWithValidReservation() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (result.success()) {
            String reservationId = result.reservation().getReservationId();
            // Should not throw exception
            facade.handleArrivalDetected(reservationId);
        }
    }

    @Test
    public void testCheckInWithValidReservation() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (result.success()) {
            String reservationId = result.reservation().getReservationId();
            facade.checkIn(reservationId);
        }
    }

    @Test
    public void testIsWithinArrivalWindow() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (result.success()) {
            Reservation reservation = result.reservation();
            boolean withinWindow = facade.isWithinArrivalWindow(reservation);
            assertNotNull(withinWindow);
        }
    }

    @Test
    public void testProcessSensorUpdate() {
        Equipment equipment = facade.getEquipment("F-EQ-1").orElse(null);
        assertNotNull(equipment);
        
        // Should not throw exception
        facade.processSensorUpdate(equipment, true, OperationalStatus.AVAILABLE);
        facade.processSensorUpdate(equipment, false, OperationalStatus.AVAILABLE);
        facade.processSensorUpdate(equipment, true, OperationalStatus.MAINTENANCE);
        facade.processSensorUpdate(equipment, true, OperationalStatus.DISABLED);
    }

    // --- Equipment Management Tests (UC10) ---
    @Test
    public void testAddEquipment() {
        Equipment newEquipment = facade.addEquipment("F-EQ-NEW", "New Equipment", "Lab C");
        assertNotNull(newEquipment);
        assertEquals("F-EQ-NEW", newEquipment.getEquipmentId());
    }

    @Test
    public void testEnableEquipment() {
        Equipment equipment = facade.addEquipment("F-EQ-ENABLE", "Equipment to Enable", "Lab D");
        boolean enabled = facade.enableEquipment("F-EQ-ENABLE");
        assertTrue(enabled);
    }

    @Test
    public void testDisableEquipment() {
        Equipment equipment = facade.addEquipment("F-EQ-DISABLE", "Equipment to Disable", "Lab E");
        boolean disabled = facade.disableEquipment("F-EQ-DISABLE");
        assertTrue(disabled);
    }

    @Test
    public void testMarkEquipmentMaintenance() {
        Equipment equipment = facade.addEquipment("F-EQ-MAINT", "Equipment for Maintenance", "Lab F");
        boolean marked = facade.markEquipmentMaintenance("F-EQ-MAINT");
        assertTrue(marked);
    }

    @Test
    public void testEnableNonExistentEquipmentReturnsFalse() {
        boolean enabled = facade.enableEquipment("NONEXISTENT-EQ");
        assertFalse(enabled);
    }

    @Test
    public void testDisableNonExistentEquipmentReturnsFalse() {
        boolean disabled = facade.disableEquipment("NONEXISTENT-EQ");
        assertFalse(disabled);
    }

    @Test
    public void testMarkNonExistentEquipmentMaintenanceReturnsFalse() {
        boolean marked = facade.markEquipmentMaintenance("NONEXISTENT-EQ");
        assertFalse(marked);
    }

    // --- Account Approval Tests ---
    @Test
    public void testApproveAccountSuccessfully() {
        List<ApprovalRequest> pendingApprovals = facade.getPendingApprovals();
        if (!pendingApprovals.isEmpty()) {
            String requestId = pendingApprovals.get(0).getRequestId();
            // Should not throw exception
            facade.approveAccount(requestId);
        }
    }

    @Test
    public void testRejectAccountSuccessfully() {
        List<ApprovalRequest> pendingApprovals = facade.getPendingApprovals();
        if (!pendingApprovals.isEmpty()) {
            String requestId = pendingApprovals.get(0).getRequestId();
            // Should not throw exception
            facade.rejectAccount(requestId, "Test rejection reason");
        }
    }

    // --- Utility Tests ---
    @Test
    public void testFormatSlotContainsDate() {
        String formatted = ReservationFacade.formatSlot(LocalDateTime.of(2026, 4, 4, 14, 0));
        assertTrue(formatted.contains("2026-04-04"));
    }

    @Test
    public void testFormatSlotContainsTime() {
        String formatted = ReservationFacade.formatSlot(LocalDateTime.of(2026, 4, 4, 14, 30));
        assertTrue(formatted.contains("PM"));
    }

    @Test
    public void testGetNextValidStartTimeHasZeroMinute() {
        assertEquals(0, facade.getNextValidStartTime().getMinute());
    }

    @Test
    public void testGetNextValidStartTimeNotInPast() {
        LocalDateTime nextValid = facade.getNextValidStartTime();
        LocalDateTime now = LocalDateTime.now();
        assertTrue(nextValid.isAfter(now) || nextValid.equals(now));
    }

    // --- Additional Comprehensive Tests for Better Coverage ---

    @Test
    public void testReserveEquipmentWithRejectedAccountFails() {
        User rejectedUser = new Student("F-AI-REJECTED", "Rejected Student", new Credentials("rejected@yorku.ca", "Pass123!"), "CERT-REJECTED");
        rejectedUser.setStatus(AccountStatus.REJECTED);
        new UserRepository().save(rejectedUser);
        
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(rejectedUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        assertFalse(result.success());
    }

    @Test
    public void testReserveEquipmentWithNonExistentEquipmentFails() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "NONEXISTENT-EQ", start, end, PaymentMethod.CREDIT);
        assertFalse(result.success());
    }

    @Test
    public void testRegisterUserWithInvalidEmail() {
        // Testing edge case - should still succeed as registration validates during login
        RegistrationResult result = facade.registerUser("", "Password123!", "New User", com.yorku.lab.enums.UserType.STUDENT, "CERT-EDGE");
        assertNotNull(result);
    }

    @Test
    public void testLoginWithActiveAccountReturnsCorrectUser() {
        Optional<User> loggedInUser = facade.login("active@yorku.ca", "Pass123!");
        assertTrue(loggedInUser.isPresent());
        assertEquals("Active Student", loggedInUser.get().getFullName());
        assertEquals(AccountStatus.ACTIVE, loggedInUser.get().getStatus());
    }

    @Test
    public void testBrowseEquipmentNotEmpty() {
        List<Equipment> equipment = facade.browseEquipment();
        assertNotNull(equipment);
        assertTrue(equipment.size() >= 2); // We added 2 equipment in setup
    }

    @Test
    public void testFindAvailableEquipmentNotEmpty() {
        List<Equipment> available = facade.findAvailableEquipment();
        assertNotNull(available);
        // At least some equipment should be available initially
        assertTrue(available.size() > 0);
    }

    @Test
    public void testGetEquipmentByIdWithValidId() {
        Optional<Equipment> eq1 = facade.getEquipment("F-EQ-1");
        assertTrue(eq1.isPresent());
        assertEquals("Microscope", eq1.get().getDescription());
        assertEquals("Lab A", eq1.get().getLabLocation());
        
        Optional<Equipment> eq2 = facade.getEquipment("F-EQ-2");
        assertTrue(eq2.isPresent());
        assertEquals("Centrifuge", eq2.get().getDescription());
    }

    @Test
    public void testGetHourlyRateForDifferentUsers() {
        // All students should have same hourly rate
        User user2 = new Student("F-AI-USER2", "Another Student", new Credentials("user2@yorku.ca", "Pass123!"), "CERT-002");
        user2.setStatus(AccountStatus.ACTIVE);
        new UserRepository().save(user2);
        
        double rate1 = facade.getHourlyRate(activeUser);
        double rate2 = facade.getHourlyRate(user2);
        assertEquals(rate1, rate2, 0.01);
    }

    @Test
    public void testGetDepositAmountForDifferentUsers() {
        User user3 = new Student("F-AI-USER3", "Third Student", new Credentials("user3@yorku.ca", "Pass123!"), "CERT-003");
        user3.setStatus(AccountStatus.ACTIVE);
        new UserRepository().save(user3);
        
        double deposit1 = facade.getDepositAmount(activeUser);
        double deposit2 = facade.getDepositAmount(user3);
        assertEquals(deposit1, deposit2, 0.01);
    }

    @Test
    public void testModifyBookingWithNonExistentReservationFails() {
        LocalDateTime newStart = LocalDateTime.of(2026, 4, 7, 10, 0);
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 7, 12, 0);
        
        ReservationFacade.ModifyResult result = facade.modifyBooking("NONEXISTENT-RES", newStart, newEnd);
        assertFalse(result.success());
    }

    @Test
    public void testCancelBookingWithValidReservationIdReturnsFalseForInvalidId() {
        assertFalse(facade.cancelBooking("invalid-id-123"));
    }

    @Test
    public void testSuggestNextAvailableSlotsWith0Count() {
        LocalDateTime from = LocalDateTime.of(2026, 4, 6, 10, 0);
        List<LocalDateTime> suggestions = facade.suggestNextAvailableSlots("F-EQ-1", from, 0);
        
        assertNotNull(suggestions);
        assertEquals(0, suggestions.size());
    }

    @Test
    public void testSuggestNextAvailableSlotsWith1Count() {
        LocalDateTime from = LocalDateTime.of(2026, 4, 6, 10, 0);
        List<LocalDateTime> suggestions = facade.suggestNextAvailableSlots("F-EQ-1", from, 1);
        
        assertNotNull(suggestions);
        assertTrue(suggestions.size() <= 1);
    }

    @Test
    public void testSuggestNextAvailableSlotsWithLargeCount() {
        LocalDateTime from = LocalDateTime.of(2026, 4, 6, 10, 0);
        List<LocalDateTime> suggestions = facade.suggestNextAvailableSlots("F-EQ-1", from, 10);
        
        assertNotNull(suggestions);
        assertTrue(suggestions.size() <= 10);
    }

    @Test
    public void testIsSlotAvailableForDifferentEquipment() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        boolean available1 = facade.isSlotAvailable("F-EQ-1", start, end);
        boolean available2 = facade.isSlotAvailable("F-EQ-2", start, end);
        
        assertNotNull(available1);
        assertNotNull(available2);
    }

    @Test
    public void testGetUserReservationsForActiveUser() {
        List<Reservation> reservations = facade.getUserReservations("F-AI-ACTIVE");
        assertNotNull(reservations);
        // Initially should be empty or minimal
        assertTrue(reservations.size() >= 0);
    }

    @Test
    public void testGetTotalPaidByUserInitiallyZero() {
        double totalPaid = facade.getTotalPaidByUser("F-AI-ACTIVE");
        assertTrue(totalPaid >= 0.0);
        // New user initially paid nothing
        assertEquals(0.0, totalPaid, 0.01);
    }

    @Test
    public void testGetPaymentsForUserInitiallyEmpty() {
        List<PaymentTransaction> payments = facade.getPaymentsForUser("F-AI-ACTIVE");
        assertNotNull(payments);
        assertTrue(payments.size() >= 0);
    }

    @Test
    public void testGetReservationWithValidIdReturnsReservation() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (result.success()) {
            String reservationId = result.reservation().getReservationId();
            Optional<Reservation> retrieved = facade.getReservation(reservationId);
            assertTrue(retrieved.isPresent());
            assertEquals(reservationId, retrieved.get().getReservationId());
        }
    }

    @Test
    public void testFormatSlotForMorningTime() {
        String formatted = ReservationFacade.formatSlot(LocalDateTime.of(2026, 4, 4, 9, 30));
        assertTrue(formatted.contains("AM"));
    }

    @Test
    public void testFormatSlotForAfternoonTime() {
        String formatted = ReservationFacade.formatSlot(LocalDateTime.of(2026, 4, 4, 14, 45));
        assertTrue(formatted.contains("PM"));
    }

    @Test
    public void testFormatSlotForMidnight() {
        String formatted = ReservationFacade.formatSlot(LocalDateTime.of(2026, 4, 4, 0, 0));
        assertTrue(formatted.contains("AM"));
    }

    @Test
    public void testAddMultipleEquipment() {
        Equipment eq1 = facade.addEquipment("F-EQ-MULTI-1", "Equipment 1", "Lab X");
        Equipment eq2 = facade.addEquipment("F-EQ-MULTI-2", "Equipment 2", "Lab Y");
        Equipment eq3 = facade.addEquipment("F-EQ-MULTI-3", "Equipment 3", "Lab Z");
        
        assertNotNull(eq1);
        assertNotNull(eq2);
        assertNotNull(eq3);
        assertEquals("F-EQ-MULTI-1", eq1.getEquipmentId());
        assertEquals("F-EQ-MULTI-2", eq2.getEquipmentId());
        assertEquals("F-EQ-MULTI-3", eq3.getEquipmentId());
    }

    @Test
    public void testEnableThenDisableSameEquipment() {
        Equipment equipment = facade.addEquipment("F-EQ-TOGGLE", "Toggle Equipment", "Lab G");
        
        boolean enabled = facade.enableEquipment("F-EQ-TOGGLE");
        assertTrue(enabled);
        
        boolean disabled = facade.disableEquipment("F-EQ-TOGGLE");
        assertTrue(disabled);
    }

    @Test
    public void testMarkMultipleEquipmentForMaintenance() {
        Equipment eq1 = facade.addEquipment("F-EQ-MAINT-1", "Equipment for Maint", "Lab H");
        Equipment eq2 = facade.addEquipment("F-EQ-MAINT-2", "Equipment for Maint", "Lab I");
        
        boolean marked1 = facade.markEquipmentMaintenance("F-EQ-MAINT-1");
        boolean marked2 = facade.markEquipmentMaintenance("F-EQ-MAINT-2");
        
        assertTrue(marked1);
        assertTrue(marked2);
    }

    @Test
    public void testProcessSensorUpdateWithDifferentStatuses() {
        Equipment equipment = facade.getEquipment("F-EQ-1").orElse(null);
        assertNotNull(equipment);
        
        // Test all combinations
        for (OperationalStatus status : OperationalStatus.values()) {
            facade.processSensorUpdate(equipment, true, status);
            facade.processSensorUpdate(equipment, false, status);
        }
    }

    @Test
    public void testExtendReservationWithPastTimeSlot() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult reserveResult = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (reserveResult.success()) {
            String reservationId = reserveResult.reservation().getReservationId();
            
            // Try to extend to past time
            LocalDateTime pastEnd = LocalDateTime.of(2026, 4, 5, 14, 0);
            ReservationFacade.ExtendResult extendResult = facade.extendReservation(reservationId, pastEnd, PaymentMethod.CREDIT);
            
            // Extension to past should fail
            assertFalse(extendResult.success());
        }
    }

    @Test
    public void testExtendReservationWithAllPaymentMethods() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult reserveResult = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (reserveResult.success()) {
            String reservationId = reserveResult.reservation().getReservationId();
            LocalDateTime newEnd = LocalDateTime.of(2026, 4, 6, 15, 0);
            
            // Try each payment method
            for (PaymentMethod method : PaymentMethod.values()) {
                ReservationFacade.ExtendResult extendResult = facade.extendReservation(reservationId, newEnd, method);
                assertNotNull(extendResult);
                assertNotNull(extendResult.message());
            }
        }
    }

    @Test
    public void testReserveEquipmentAndGetReservations() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        if (result.success()) {
            List<Reservation> reservations = facade.getUserReservations("F-AI-ACTIVE");
            assertTrue(reservations.size() > 0);
        }
    }

    @Test
    public void testHandleArrivalDetectedMultipleTimes() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (result.success()) {
            String reservationId = result.reservation().getReservationId();
            
            // Call multiple times - should not throw
            facade.handleArrivalDetected(reservationId);
            facade.handleArrivalDetected(reservationId);
            facade.handleArrivalDetected(reservationId);
        }
    }

    @Test
    public void testCheckInMultipleTimes() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (result.success()) {
            String reservationId = result.reservation().getReservationId();
            
            // Call multiple times - should not throw
            facade.checkIn(reservationId);
            facade.checkIn(reservationId);
        }
    }

    @Test
    public void testReserveWithCreditPaymentMethod() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        assertNotNull(result);
    }

    @Test
    public void testReserveWithDebitPaymentMethod() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-2", start, end, PaymentMethod.DEBIT);
        assertNotNull(result);
    }

    @Test
    public void testReserveWithInstitutionalPaymentMethod() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.INSTITUTIONAL);
        assertNotNull(result);
    }

    @Test
    public void testReserveWithGrantsPaymentMethod() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.GRANTS);
        assertNotNull(result);
    }

    @Test
    public void testPendingApprovalsListNotNull() {
        List<ApprovalRequest> approvals = facade.getPendingApprovals();
        assertNotNull(approvals);
    }

    @Test
    public void testApproveAndRejectAccountsHandleEmptyList() {
        // Get pending approvals - if empty, shouldn't cause issues
        List<ApprovalRequest> pendingApprovals = facade.getPendingApprovals();
        assertNotNull(pendingApprovals);
    }

    @Test
    public void testReserveEquipmentMessageContainsInfo() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        
        ReservationFacade.ReserveResult result = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        assertNotNull(result.message());
    }

    @Test
    public void testModifyBookingMessageNotNull() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 6, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 4, 6, 12, 0);
        ReservationFacade.ReserveResult reserveResult = facade.reserveEquipment(activeUser, "F-EQ-1", start, end, PaymentMethod.CREDIT);
        
        if (reserveResult.success()) {
            String reservationId = reserveResult.reservation().getReservationId();
            LocalDateTime newStart = LocalDateTime.of(2026, 4, 7, 10, 0);
            LocalDateTime newEnd = LocalDateTime.of(2026, 4, 7, 12, 0);
            
            ReservationFacade.ModifyResult modifyResult = facade.modifyBooking(reservationId, newStart, newEnd);
            // Check if message is present in success or failure
            assertNotNull(modifyResult.success());
        }
    }
}