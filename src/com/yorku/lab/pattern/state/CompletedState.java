package com.yorku.lab.pattern.state;

import com.yorku.lab.model.Reservation;
import java.time.LocalDateTime;

public class CompletedState implements ReservationState {

    @Override
    public void modify(Reservation reservation, LocalDateTime newStart, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot modify a completed reservation.");
    }

    @Override
    public void cancel(Reservation reservation) {
        throw new IllegalStateException("Cannot cancel a completed reservation.");
    }

    @Override
    public void extend(Reservation reservation, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot extend a completed reservation.");
    }

    @Override
    public void markArrived(Reservation reservation) {
        throw new IllegalStateException("Reservation is already completed.");
    }

    @Override
    public void markNoShow(Reservation reservation) {
        throw new IllegalStateException("Reservation is already completed.");
    }

    @Override
    public void complete(Reservation reservation) {
        // Already completed, no-op
    }
}
