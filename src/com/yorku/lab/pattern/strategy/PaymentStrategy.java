package com.yorku.lab.pattern.strategy;
import com.yorku.lab.model.PaymentTransaction;

public interface PaymentStrategy {
    public PaymentTransaction pay(double amount);
}
