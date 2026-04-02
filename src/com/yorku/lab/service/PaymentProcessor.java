package com.yorku.lab.service;

import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.pattern.strategy.PaymentStrategy;
import com.yorku.lab.repository.PaymentRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Handles UC5 (Process payment for deposit), UC7 (Process payment for extension).
 * Uses the Strategy pattern: set a PaymentStrategy, then call processPayment().
 */
public class PaymentProcessor {

    private final PaymentRepository paymentRepository = new PaymentRepository();
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public PaymentTransaction processPayment(double amount) {
        return paymentStrategy.pay(amount);
    }

    public void saveTransaction(PaymentTransaction tx) {
        paymentRepository.save(tx);
    }

    public Optional<PaymentTransaction> getTransaction(String transactionId) {
        return paymentRepository.findById(transactionId);
    }

    public List<PaymentTransaction> getPaymentsForReservations(List<String> reservationIds) {
        return paymentRepository.findByReservationIds(Set.copyOf(reservationIds));
    }
}
