package com.yorku.lab.pattern.state;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.model.Reservation;
import java.time.LocalDateTime;

public class ArrivedState implements ReservationState {

    @Override
    public void modify(Reservation reservation, LocalDateTime newStart, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot modify a reservation that is already in use.");
    }

    @Override
    public void cancel(Reservation reservation) {
        throw new IllegalStateException("Cannot cancel a reservation that is already in use.");
    }

    @Override
    public void extend(Reservation reservation, LocalDateTime newEnd) {
        reservation.setEndTime(newEnd);
        reservation.setStatus(BookingStatus.EXTENDED);
        reservation.setState(new ExtendedState());
    }

    @Override
    public void markArrived(Reservation reservation) {
        // Already arrived, no-op
    }

    @Override
    public void markNoShow(Reservation reservation) {
        throw new IllegalStateException("User has already arrived.");
    }

    @Override
    public void complete(Reservation reservation) {
        reservation.setStatus(BookingStatus.COMPLETED);
        reservation.setState(new CompletedState());
    }
}
