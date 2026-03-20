package com.yorku.lab.service;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentStatus;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.repository.PaymentRepository;
import com.yorku.lab.repository.ReservationRepository;

import java.util.Optional;
import java.util.UUID;

/**
 * Handles UC5 (Process payment for deposit), UC7 (Process payment for extension).
 */
public class PaymentProcessor {

    private final PaymentRepository paymentRepository = new PaymentRepository();
    private final ReservationRepository reservationRepository = new ReservationRepository();
    BalanceService balanceService = new BalanceService();

    public PaymentResult processDeposit(Reservation reservation, double amount, PaymentMethod method, User user) {
    	balanceService.deductFunds(user, amount);
        String transactionId = UUID.randomUUID().toString();
        PaymentTransaction tx = new PaymentTransaction(transactionId, amount, PaymentType.DEPOSIT, method, reservation.getReservationId());

        // Simulate payment authorization (in real system, call PaymentGateway)
        tx.setStatus(PaymentStatus.AUTHORIZED);
        paymentRepository.save(tx);
        reservation.addPayment(tx);
        reservationRepository.save(reservation);

        return new PaymentResult(true, transactionId, "Deposit authorized");
    }

    public PaymentResult processExtensionFee(Reservation reservation, double amount, PaymentMethod method, User user) {
    	balanceService.deductFunds(user, amount);
        String transactionId = UUID.randomUUID().toString();
        PaymentTransaction tx = new PaymentTransaction(transactionId, amount, PaymentType.FINAL_CHARGE, method, reservation.getReservationId());

        tx.setStatus(PaymentStatus.AUTHORIZED);
        paymentRepository.save(tx);
        reservation.addPayment(tx);
        reservationRepository.save(reservation);

        return new PaymentResult(true, transactionId, "Extension fee authorized");
    }

    public Optional<PaymentTransaction> getTransaction(String transactionId) {
        return paymentRepository.findById(transactionId);
    }

    public record PaymentResult(boolean success, String transactionId, String message) {}
}
