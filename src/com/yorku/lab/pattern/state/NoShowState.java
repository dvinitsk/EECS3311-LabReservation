package com.yorku.lab.pattern.state;

import com.yorku.lab.model.Reservation;
import java.time.LocalDateTime;

public class NoShowState implements ReservationState {

    @Override
    public void modify(Reservation reservation, LocalDateTime newStart, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot modify a no-show reservation.");
    }

    @Override
    public void cancel(Reservation reservation) {
        throw new IllegalStateException("Reservation already marked as no-show.");
    }

    @Override
    public void extend(Reservation reservation, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot extend a no-show reservation.");
    }

    @Override
    public void markArrived(Reservation reservation) {
        throw new IllegalStateException("Arrival window has already passed.");
    }

    @Override
    public void markNoShow(Reservation reservation) {
        // Already no-show, no-op
    }

    @Override
    public void complete(Reservation reservation) {
        throw new IllegalStateException("Cannot complete a no-show reservation.");
    }
}
