package com.yorku.lab.pattern.state;

import java.time.LocalDateTime;

import com.yorku.lab.model.Reservation;

public interface ReservationState {

	void modify(Reservation reservation, LocalDateTime newStart, LocalDateTime newEnd);
    void cancel(Reservation reservation);
    void extend(Reservation reservation, LocalDateTime newEnd);
    void markArrived(Reservation reservation);
    void markNoShow(Reservation reservation);
    void complete(Reservation reservation);
	
}
