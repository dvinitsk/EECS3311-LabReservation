package com.yorku.lab.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.pattern.state.ConfirmedState;
import com.yorku.lab.pattern.state.ReservationState;

public class Reservation {

	private User user;
	private Equipment equipment;
	private String reservationId;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private BookingStatus status;
	private boolean arrived;
	private ReservationState currentState;
	private List<PaymentTransaction> payments;
	
	public Reservation(String reservationId, User user, Equipment equipment,LocalDateTime startTime, LocalDateTime endTime) {
		this.reservationId = reservationId;
        this.user = user;
        this.equipment = equipment;
        this.startTime = startTime;
        this.endTime = endTime;
        this.arrived = false;
        this.payments = new ArrayList<>();
        this.currentState = new ConfirmedState();
        this.status = BookingStatus.CONFIRMED;
	}
	
	public void modify(LocalDateTime newStart, LocalDateTime newEnd) {
        currentState.modify(this, newStart, newEnd);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public void extend(LocalDateTime newEnd) {
        currentState.extend(this, newEnd);
    }

    public void markArrived() {
        currentState.markArrived(this);
    }

    public void markNoShow() {
        currentState.markNoShow(this);
    }

    public void complete() {
        currentState.complete(this);
    }

    public void setState(ReservationState state) {
        this.currentState = state;
    }

    public void addPayment(PaymentTransaction transaction) {
        this.payments.add(transaction);
    }
    
    //Getters and Setters
    public String getReservationId() { return reservationId; }
    public User getUser() { return user; }
    public Equipment getEquipment() { return equipment; }
    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }
    public BookingStatus getStatus() { return status; }
    public void setStatus(BookingStatus status) { this.status = status; }
    public boolean isArrived() { return arrived; }
    public void setArrived(boolean arrived) { this.arrived = arrived; }
    public List<PaymentTransaction> getPayments() { return payments; }
    public ReservationState getCurrentState() { return currentState; }
	
}
