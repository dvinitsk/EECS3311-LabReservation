package com.yorku.lab.service;

import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.model.Reservation;

import java.util.List;


/**
 * Service layer for balance and payment history.
 * Aggregates reservations (via BookingService) and payments (via PaymentProcessor)
 * to provide user-facing balance and payment history.
 */
public class BalanceService {

    private final BookingService bookingService;
    private final PaymentProcessor paymentProcessor;

    public BalanceService() {
        this.bookingService = new BookingService();
        this.paymentProcessor = new PaymentProcessor();
    }

    public BalanceService(BookingService bookingService, PaymentProcessor paymentProcessor) {
        this.bookingService = bookingService;
        this.paymentProcessor = paymentProcessor;
    }

    /** Total amount paid by user (deposits + extension fees across all reservations). */
    public double getTotalPaidByUser(String userId) {
        List<String> reservationIds = bookingService.getReservationsByUser(userId).stream()
            .map(Reservation::getReservationId)
            .toList();
        return paymentProcessor.getPaymentsForReservations(reservationIds).stream()
            .mapToDouble(PaymentTransaction::getAmount)
            .sum();
    }

    /** All payment transactions for user's reservations (from persistence). */
    public List<PaymentTransaction> getPaymentsForUser(String userId) {
        List<String> reservationIds = bookingService.getReservationsByUser(userId).stream()
            .map(Reservation::getReservationId)
            .toList();
        return paymentProcessor.getPaymentsForReservations(reservationIds);
    }
}
