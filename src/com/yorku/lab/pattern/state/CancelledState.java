package com.yorku.lab.pattern.state;

import com.yorku.lab.model.Reservation;
import java.time.LocalDateTime;

public class CancelledState implements ReservationState {

    @Override
    public void modify(Reservation reservation, LocalDateTime newStart, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot modify a cancelled reservation.");
    }

    @Override
    public void cancel(Reservation reservation) {
        // Already cancelled, no-op
    }

    @Override
    public void extend(Reservation reservation, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot extend a cancelled reservation.");
    }

    @Override
    public void markArrived(Reservation reservation) {
        throw new IllegalStateException("Cannot mark arrival on a cancelled reservation.");
    }

    @Override
    public void markNoShow(Reservation reservation) {
        throw new IllegalStateException("Cannot mark no-show on a cancelled reservation.");
    }

    @Override
    public void complete(Reservation reservation) {
        throw new IllegalStateException("Cannot complete a cancelled reservation.");
    }
    
}
