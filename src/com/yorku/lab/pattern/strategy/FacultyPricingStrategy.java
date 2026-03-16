package com.yorku.lab.pattern.strategy;

public class FacultyPricingStrategy implements PricingStrategy {
    private static final double HOURLY_RATE = 15.0;

    @Override
    public double calculateHourlyRate() {
        return HOURLY_RATE;
    }

    @Override
    public double calculateDeposit() {
        return HOURLY_RATE;
    }

    @Override
    public double calculateTotalFee(double hours) {
        return HOURLY_RATE * hours;
    }
}
