package com.yorku.lab.pattern.facade;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.service.*;
import com.yorku.lab.service.RegistrationService.RegistrationResult;

import java.time.LocalDateTime;
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

    // --- Registration (UC1, UC2, UC3) ---
    public RegistrationResult register(String email, String password, String fullName, com.yorku.lab.enums.UserType userType, String idOrCertificationNumber) {
        return registrationService.register(email, password, fullName, userType, idOrCertificationNumber);
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
        Optional<Reservation> opt = bookingService.createReservation(user, equipmentId, start, end);
        if (opt.isEmpty()) {
            return new ReserveResult(false, null, "Slot not available");
        }
        Reservation r = opt.get();
        double deposit = bookingService.calculateDeposit(user);
        var payResult = paymentProcessor.processDeposit(r, deposit, paymentMethod,user);
        if (!payResult.success()) {
            bookingService.cancelReservation(r.getReservationId());
            return new ReserveResult(false, null, "Payment failed: " + payResult.message());
        }
        return new ReserveResult(true, r, "Reservation confirmed");
    }

    // --- Modify/Cancel (UC6) ---
    public ModifyResult modifyReservation(String reservationId, LocalDateTime newStart, LocalDateTime newEnd) {
        Optional<Reservation> opt = bookingService.modifyReservation(reservationId, newStart, newEnd);
        return opt.isPresent()
            ? new ModifyResult(true, opt.get(), null)
            : new ModifyResult(false, null, "Slot not available");
    }

    public boolean cancelReservation(String reservationId) {
        return bookingService.cancelReservation(reservationId);
    }

    // --- Extend (UC7) ---
    public ExtendResult extendReservation(String reservationId, LocalDateTime newEnd, PaymentMethod paymentMethod, User currentUser) {
        Optional<Reservation> opt = bookingService.getReservation(reservationId);
        if (opt.isEmpty()) return new ExtendResult(false, null, "Reservation not found");

        Reservation r = opt.get();
        Optional<Reservation> extended = bookingService.extendReservation(reservationId, newEnd);
        if (extended.isEmpty()) return new ExtendResult(false, null, "Extension slot not available");

        double extraHours = java.time.Duration.between(r.getEndTime(), newEnd).toMinutes() / 60.0;
        double fee = bookingService.calculateHourlyRate(r.getUser()) * extraHours;
        var payResult = paymentProcessor.processExtensionFee(extended.get(), fee, paymentMethod,currentUser);
        if (!payResult.success()) {
            // Revert extension - would need to implement
            return new ExtendResult(false, null, "Payment failed");
        }
        return new ExtendResult(true, extended.get(), null);
    }
    
    public void addBalance(User currentUser, double amount) {
		balanceService.addFunds(currentUser, amount);
	}

    // --- User reservations ---
    public List<Reservation> getUserReservations(String userId) {
        return bookingService.getReservationsByUser(userId);
    }

    public Optional<Reservation> getReservation(String reservationId) {
        return bookingService.getReservation(reservationId);
    }

    // --- Arrival (UC8) ---
    public void markArrived(String reservationId) {
        arrivalMonitor.markArrived(reservationId);
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

    // --- Result records ---
    public record ReserveResult(boolean success, Reservation reservation, String message) {}
    public record ModifyResult(boolean success, Reservation reservation, String message) {}
    public record ExtendResult(boolean success, Reservation reservation, String message) {}
	
}
