package com.yorku.lab.model;

import com.yorku.lab.enums.*;

public class PaymentTransaction {

	private String transactionId;
    private double amount;
    private PaymentType type;
    private PaymentMethod method;
    private PaymentStatus status;
    private String reservationId;

    public PaymentTransaction(String transactionId, double amount, PaymentType type, PaymentMethod method) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
        this.method = method;
        this.status = PaymentStatus.AUTHORIZED;
    }

    public PaymentTransaction(String transactionId, double amount, PaymentType type, PaymentMethod method, String reservationId) {
        this(transactionId, amount, type, method);
        this.reservationId = reservationId;
    }

    public String getTransactionId() { return transactionId; }
    public double getAmount() { return amount; }
    public PaymentType getType() { return type; }
    public void setType(PaymentType type) { this.type = type; }
    public PaymentMethod getMethod() { return method; }
    public PaymentStatus getStatus() { return status; }
    public void setStatus(PaymentStatus status) { this.status = status; }
    public String getReservationId() { return reservationId; }
    public void setReservationId(String reservationId) { this.reservationId = reservationId; }
}
