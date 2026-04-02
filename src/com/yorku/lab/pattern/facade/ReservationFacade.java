package com.yorku.lab.pattern.facade;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.service.*;
import com.yorku.lab.service.RegistrationService.RegistrationResult;
import com.yorku.lab.pattern.observer.SensorSystem;
import com.yorku.lab.pattern.strategy.*;
import com.yorku.lab.enums.OperationalStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

/**
 * Facade: simplified entry point between GUI and reservation subsystem.
 * Coordinates availability checking, pricing, payment, booking, modification, cancellation, extension.
 */
public class ReservationFacade {

    private final RegistrationService registrationService = new RegistrationService();
    private final BookingService bookingService = new BookingService();
    private final PaymentProcessor paymentProcessor = new PaymentProcessor();
    private final EquipmentManagementService equipmentManagementService = new EquipmentManagementService();
    private final ArrivalMonitor arrivalMonitor = new ArrivalMonitor();
    private final BalanceService balanceService = new BalanceService();
    private final SensorSystem sensorSystem = new SensorSystem();

    /** Start the background monitor for 20-min arrival window (UC8). Call at app launch. */
    public void startArrivalMonitor() {
        arrivalMonitor.startMonitoring();
    }

    // --- Registration (UC1, UC2, UC3) ---
    public RegistrationResult registerUser(String email, String password, String fullName, com.yorku.lab.enums.UserType userType, String idOrCertificationNumber) {
        return registrationService.registerUser(email, password, fullName, userType, idOrCertificationNumber);
    }

    public Optional<User> login(String email, String password) {
        return registrationService.findByEmail(email)
            .filter(u -> u.getCredentials().verifyPassword(password))
            .filter(u -> u.getStatus() == com.yorku.lab.enums.AccountStatus.ACTIVE);
    }

    public List<com.yorku.lab.model.ApprovalRequest> getPendingApprovals() {
        return registrationService.getPendingApprovals();
    }

    public void approveAccount(String requestId) {
        registrationService.approveAccount(requestId);
    }

    public void rejectAccount(String requestId, String reason) {
        registrationService.rejectAccount(requestId, reason);
    }

    // --- Browse Equipment (UC4) ---
    public List<Equipment> browseEquipment() {
        return bookingService.browseEquipment();
    }

    public List<Equipment> findAvailableEquipment() {
        return bookingService.findAvailableEquipment();
    }

    public Optional<Equipment> getEquipment(String equipmentId) {
        return bookingService.getEquipment(equipmentId);
    }

    // --- Reserve Equipment (UC5) ---
    public boolean isSlotAvailable(String equipmentId, LocalDateTime start, LocalDateTime end) {
        return bookingService.isSlotAvailable(equipmentId, start, end, null);
    }

    public List<LocalDateTime> suggestNextAvailableSlots(String equipmentId, LocalDateTime from, int count) {
        return bookingService.suggestNextAvailableSlots(equipmentId, from, count);
    }

    public double getDepositAmount(User user) {
        return bookingService.calculateDeposit(user);
    }

    public double getHourlyRate(User user) {
        return bookingService.calculateHourlyRate(user);
    }

    public ReserveResult reserveEquipment(User user, String equipmentId, LocalDateTime start, LocalDateTime end, PaymentMethod paymentMethod) {
        if (user.getStatus() != com.yorku.lab.enums.AccountStatus.ACTIVE) {
            return new ReserveResult(false, null, "Account must be active to reserve");
        }
        LocalDateTime now = LocalDateTime.now();
        if (!now.isBefore(start.plusMinutes(20))) {
            LocalDateTime next = nextValidStartTime();
            return new ReserveResult(false, null,
                "Start time has passed (20-min arrival window expired). Next available: " + formatSlot(next));
        }
        Optional<Reservation> opt = bookingService.createReservation(user, equipmentId, start, end);
        if (opt.isEmpty()) {
            return new ReserveResult(false, null, "Slot not available");
        }
        Reservation r = opt.get();
        double deposit = bookingService.calculateDeposit(user);

        // Strategy pattern: map PaymentMethod to PaymentStrategy, then processPayment
        paymentProcessor.setPaymentStrategy(getPaymentStrategy(paymentMethod));
        PaymentTransaction tx = paymentProcessor.processPayment(deposit);
        tx.setReservationId(r.getReservationId());
        paymentProcessor.saveTransaction(tx);
        r.addPayment(tx);

        return new ReserveResult(true, r, "Reservation confirmed");
    }

    // --- Modify/Cancel (UC6) ---
    public ModifyResult modifyBooking(String reservationId, LocalDateTime newStart, LocalDateTime newEnd) {
        LocalDateTime now = LocalDateTime.now();
        if (!now.isBefore(newStart.plusMinutes(20))) {
            LocalDateTime next = nextValidStartTime();
            return new ModifyResult(false, null,
                "Start time has passed. Next available: " + formatSlot(next));
        }
        Optional<Reservation> opt = bookingService.modifyBooking(reservationId, newStart, newEnd);
        return opt.isPresent()
            ? new ModifyResult(true, opt.get(), null)
            : new ModifyResult(false, null, "Slot not available");
    }

    public boolean cancelBooking(String reservationId) {
        return bookingService.cancelBooking(reservationId);
    }

    // --- Extend (UC7) ---
    public ExtendResult extendReservation(String reservationId, LocalDateTime newEnd, PaymentMethod paymentMethod) {
        Optional<Reservation> opt = bookingService.getReservation(reservationId);
        if (opt.isEmpty()) return new ExtendResult(false, null, "Reservation not found");

        Reservation r = opt.get();
        Optional<Reservation> extended = bookingService.extendReservation(reservationId, newEnd);
        if (extended.isEmpty()) return new ExtendResult(false, null, "Extension slot not available");

        double extraHours = java.time.Duration.between(r.getEndTime(), newEnd).toMinutes() / 60.0;
        double fee = bookingService.calculateHourlyRate(r.getUser()) * extraHours;

        // Strategy pattern: map PaymentMethod to PaymentStrategy, then processPayment
        paymentProcessor.setPaymentStrategy(getPaymentStrategy(paymentMethod));
        PaymentTransaction tx = paymentProcessor.processPayment(fee);
        tx.setReservationId(reservationId);
        paymentProcessor.saveTransaction(tx);
        extended.get().addPayment(tx);

        return new ExtendResult(true, extended.get(), null);
    }

    // --- User reservations ---
    public List<Reservation> getUserReservations(String userId) {
        return bookingService.getReservationsByUser(userId);
    }

    /** Total amount paid by user (delegates to BalanceService). */
    public double getTotalPaidByUser(String userId) {
        return balanceService.getTotalPaidByUser(userId);
    }

    /** All payment transactions for user's reservations (delegates to BalanceService). */
    public List<com.yorku.lab.model.PaymentTransaction> getPaymentsForUser(String userId) {
        return balanceService.getPaymentsForUser(userId);
    }

    public Optional<Reservation> getReservation(String reservationId) {
        return bookingService.getReservation(reservationId);
    }

    // --- Arrival (UC8) ---
    public void handleArrivalDetected(String reservationId) {
        arrivalMonitor.handleArrivalDetected(reservationId);
    }

    /** Whether the reservation is within the 20-min arrival window (start to start+20). */
    public boolean isWithinArrivalWindow(Reservation r) {
        return arrivalMonitor.isWithinArrivalWindow(r);
    }

    // --- Equipment Management (UC10) ---
    public Equipment addEquipment(String equipmentId, String description, String labLocation) {
        return equipmentManagementService.addEquipment(equipmentId, description, labLocation);
    }

    public boolean enableEquipment(String equipmentId) {
        return equipmentManagementService.enableEquipment(equipmentId).isPresent();
    }

    public boolean disableEquipment(String equipmentId) {
        return equipmentManagementService.disableEquipment(equipmentId).isPresent();
    }

    public boolean markEquipmentMaintenance(String equipmentId) {
        return equipmentManagementService.markMaintenance(equipmentId).isPresent();
    }

    /** Maps a PaymentMethod enum to the corresponding PaymentStrategy implementation. */
    private PaymentStrategy getPaymentStrategy(PaymentMethod method) {
        return switch (method) {
            case CREDIT -> new CreditPaymentStrategy();
            case DEBIT -> new DebitPaymentStrategy();
            case INSTITUTIONAL -> new InstitutionalPaymentStrategy();
            case GRANTS -> new ResearchGrantPaymentStrategy();
        };
    }

    /** Earliest start time that still allows arrival within 20 minutes of start. */
    public LocalDateTime getNextValidStartTime() {
        return nextValidStartTime();
    }

    private static LocalDateTime nextValidStartTime() {
        LocalDateTime now = LocalDateTime.now();
        int min = now.getMinute();
        return min < 20
            ? now.withMinute(0).withSecond(0).withNano(0)
            : now.plusHours(1).withMinute(0).withSecond(0).withNano(0);
    }

    /** Format date and time in 12hr AM/PM for user-facing messages. */
    public static String formatSlot(LocalDateTime dt) {
        return dt.toLocalDate() + " " + dt.format(DateTimeFormatter.ofPattern("h:mm a"));
    }

    public void checkIn(String reservationId) {
        arrivalMonitor.handleArrivalDetected(reservationId);
    }

    public void processSensorUpdate(Equipment equipment, boolean inUse, OperationalStatus status) {
        sensorSystem.sendUpdate(equipment, inUse, status);
    }

    // --- Result records ---
    public record ReserveResult(boolean success, Reservation reservation, String message) {}
    public record ModifyResult(boolean success, Reservation reservation, String message) {}
    public record ExtendResult(boolean success, Reservation reservation, String message) {}
}
