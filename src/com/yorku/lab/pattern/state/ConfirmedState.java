package com.yorku.lab.pattern.state;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.model.Reservation;
import java.time.LocalDateTime;

public class ConfirmedState implements ReservationState {

    @Override
    public void modify(Reservation reservation, LocalDateTime newStart, LocalDateTime newEnd) {
        reservation.setStartTime(newStart);
        reservation.setEndTime(newEnd);
        reservation.setStatus(BookingStatus.MODIFIED);
        reservation.setState(new ModifiedState());
    }

    @Override
    public void cancel(Reservation reservation) {
        reservation.setStatus(BookingStatus.CANCELLED);
        reservation.setState(new CancelledState());
    }

    @Override
    public void extend(Reservation reservation, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot extend a reservation that has not started yet.");
    }

    @Override
    public void markArrived(Reservation reservation) {
        reservation.setArrived(true);
        reservation.setStatus(BookingStatus.ARRIVED);
        reservation.setState(new ArrivedState());
    }

    @Override
    public void markNoShow(Reservation reservation) {
        reservation.setStatus(BookingStatus.NO_SHOW);
        reservation.setState(new NoShowState());
    }

    @Override
    public void complete(Reservation reservation) {
        throw new IllegalStateException("Cannot complete a reservation that is only confirmed.");
    }
}
