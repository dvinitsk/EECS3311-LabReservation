package com.yorku.lab.model;

import com.yorku.lab.enums.*;

public class PaymentTransaction {

	private String transactionId;
    private double amount;
    private PaymentType type;
    private PaymentMethod method;
    private PaymentStatus status;
	
    public PaymentTransaction(String transactionId, double amount,PaymentType type, PaymentMethod method) {
    	this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
        this.method = method;
        this.status = PaymentStatus.AUTHORIZED;
    }
    
    public String getTransactionId() { return transactionId; }
    public double getAmount() { return amount; }
    public PaymentType getType() { return type; }
    public PaymentMethod getMethod() { return method; }
    public PaymentStatus getStatus() { return status; }
    public void setStatus(PaymentStatus status) { this.status = status; }
    
}
