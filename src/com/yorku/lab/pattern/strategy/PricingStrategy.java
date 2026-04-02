package com.yorku.lab.pattern.strategy;

public interface PricingStrategy {
	double calculateHourlyRate();
    double calculateDeposit(int hours);
    double calculateTotalFee(double hours);
}
