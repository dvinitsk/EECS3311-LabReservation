package com.yorku.lab.service;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.pattern.strategy.PricingStrategy;
import com.yorku.lab.pattern.strategy.PricingStrategyFactory;
import com.yorku.lab.repository.ReservationRepository;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * UC8: Enforce 20-minute arrival window and handle reservation completion.
 * - At start time, timer begins. If no arrival by 20 min -> No-Show, forfeit deposit.
 * - When end time passes and user arrived -> Complete, charge final fee (total - deposit).
 */
public class ArrivalMonitor {

    private static final int ARRIVAL_WINDOW_MINUTES = 20;

    private final ReservationRepository reservationRepository = new ReservationRepository();
    private final PaymentProcessor paymentProcessor = new PaymentProcessor();
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

    public void startMonitoring() {
        scheduler.scheduleAtFixedRate(this::checkArrivalWindows, 0, 1, TimeUnit.MINUTES);
        scheduler.scheduleAtFixedRate(this::checkCompletions, 0, 1, TimeUnit.MINUTES);
    }

    public void stopMonitoring() {
        scheduler.shutdown();
    }

    private void checkArrivalWindows() {
        LocalDateTime now = LocalDateTime.now();
        List<Reservation> all = reservationRepository.findAll();

        for (Reservation r : all) {
            if (r.getStatus() != BookingStatus.CONFIRMED && r.getStatus() != BookingStatus.MODIFIED) continue;

            LocalDateTime start = r.getStartTime();
            LocalDateTime deadline = start.plusMinutes(ARRIVAL_WINDOW_MINUTES);

            if (now.isAfter(deadline) && !r.isArrived()) {
                r.markNoShow();
                reservationRepository.save(r);
            }
        }
    }

    private void checkCompletions() {
        LocalDateTime now = LocalDateTime.now();
        List<Reservation> all = reservationRepository.findAll();

        for (Reservation r : all) {
            if (r.getStatus() != BookingStatus.ARRIVED && r.getStatus() != BookingStatus.EXTENDED) continue;
            if (!now.isAfter(r.getEndTime())) continue;

            // Calculate final charge: total fee - deposit - any extension fees already paid
            PricingStrategy pricing = PricingStrategyFactory.getStrategy(r.getUser().getType());
            double hours = Duration.between(r.getStartTime(), r.getEndTime()).toMinutes() / 60.0;
            double totalFee = pricing.calculateHourlyRate() * hours;
            double deposit = pricing.calculateDeposit(1);
            double extensionsPaid = r.getPayments().stream()
                .filter(p -> p.getType() == PaymentType.FINAL_CHARGE)
                .mapToDouble(PaymentTransaction::getAmount)
                .sum();
            double finalCharge = totalFee - deposit - extensionsPaid;

            if (finalCharge > 0) {
                // Use the same payment method as the deposit
                PaymentTransaction depositTx = r.getPayments().stream()
                    .filter(p -> p.getType() == PaymentType.DEPOSIT)
                    .findFirst().orElse(null);

                if (depositTx != null) {
                    com.yorku.lab.pattern.strategy.PaymentStrategy payStrategy =
                        getPaymentStrategy(depositTx.getMethod());
                    paymentProcessor.setPaymentStrategy(payStrategy);
                    PaymentTransaction tx = paymentProcessor.processPayment(finalCharge);
                    tx.setReservationId(r.getReservationId());
                    paymentProcessor.saveTransaction(tx);
                    r.addPayment(tx);
                }
            }

            r.complete();
            reservationRepository.save(r);
        }
    }

    private com.yorku.lab.pattern.strategy.PaymentStrategy getPaymentStrategy(com.yorku.lab.enums.PaymentMethod method) {
        return switch (method) {
            case CREDIT -> new com.yorku.lab.pattern.strategy.CreditPaymentStrategy();
            case DEBIT -> new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
            case INSTITUTIONAL -> new com.yorku.lab.pattern.strategy.InstitutionalPaymentStrategy();
            case GRANTS -> new com.yorku.lab.pattern.strategy.ResearchGrantPaymentStrategy();
        };
    }

    public void handleArrivalDetected(String reservationId) {
        reservationRepository.findById(reservationId).ifPresent(r -> {
            r.markArrived();
            reservationRepository.save(r);
        });
    }

    public void markNoShow(String reservationId) {
        reservationRepository.findById(reservationId).ifPresent(r -> {
            r.markNoShow();
            reservationRepository.save(r);
        });
    }

    public boolean isWithinArrivalWindow(Reservation reservation) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = reservation.getStartTime();
        LocalDateTime deadline = start.plusMinutes(ARRIVAL_WINDOW_MINUTES);
        return !now.isBefore(start) && now.isBefore(deadline);
    }
}
