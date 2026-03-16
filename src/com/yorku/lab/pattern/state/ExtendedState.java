package com.yorku.lab.pattern.state;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.model.Reservation;
import java.time.LocalDateTime;

public class ExtendedState implements ReservationState {

    @Override
    public void modify(Reservation reservation, LocalDateTime newStart, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot modify an already extended reservation.");
    }

    @Override
    public void cancel(Reservation reservation) {
        throw new IllegalStateException("Cannot cancel an active extended reservation.");
    }

    @Override
    public void extend(Reservation reservation, LocalDateTime newEnd) {
        reservation.setEndTime(newEnd);
        reservation.setStatus(BookingStatus.EXTENDED);
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
        reservation.setStatus(BookingStatus.COMPLETED);
        reservation.setState(new CompletedState());
    }
}
