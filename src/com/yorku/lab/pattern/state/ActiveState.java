package com.yorku.lab.pattern.state;

import java.time.LocalDateTime;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.model.Reservation;

public class ActiveState implements ReservationState {

	@Override
    public void modify(Reservation reservation, LocalDateTime newStart, LocalDateTime newEnd) {
        throw new IllegalStateException("Cannot modify a reservation that is already active.");
    }

    @Override
    public void cancel(Reservation reservation) {
        throw new IllegalStateException("Cannot cancel a reservation that is already active.");
    }

    @Override
    public void extend(Reservation reservation, LocalDateTime newEnd) {
        reservation.setEndTime(newEnd);
        reservation.setStatus(BookingStatus.EXTENDED);
        reservation.setState(new ExtendedState());
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
