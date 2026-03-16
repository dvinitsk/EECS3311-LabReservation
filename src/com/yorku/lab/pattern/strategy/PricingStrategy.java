package com.yorku.lab.pattern.strategy;

public interface PricingStrategy {
	double calculateHourlyRate();
    double calculateDeposit();
    double calculateTotalFee(double hours);
}
