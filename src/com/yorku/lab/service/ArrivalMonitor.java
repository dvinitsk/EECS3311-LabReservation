package com.yorku.lab.service;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.repository.ReservationRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * UC8: Enforce 20-minute arrival window. At start time, timer begins.
 * If sensor indicates usage before 20 min -> Arrived.
 * If no arrival by 20 min -> No-Show, forfeit deposit.
 */
public class ArrivalMonitor {

    private static final int ARRIVAL_WINDOW_MINUTES = 20;

    private final ReservationRepository reservationRepository = new ReservationRepository();
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

    public void startMonitoring() {
        scheduler.scheduleAtFixedRate(this::checkArrivalWindows, 0, 1, TimeUnit.MINUTES);
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
