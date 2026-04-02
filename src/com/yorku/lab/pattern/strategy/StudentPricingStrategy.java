package com.yorku.lab.pattern.strategy;

public class StudentPricingStrategy implements PricingStrategy {
    private static final double HOURLY_RATE = 10.0;

    @Override
    public double calculateHourlyRate() {
        return HOURLY_RATE;
    }

    @Override
    public double calculateDeposit(int hours) {
        return HOURLY_RATE;
    }

    @Override
    public double calculateTotalFee(double hours) {
        return HOURLY_RATE * hours;
    }
}
