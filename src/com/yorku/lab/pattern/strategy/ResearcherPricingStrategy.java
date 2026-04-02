package com.yorku.lab.pattern.strategy;

public class ResearcherPricingStrategy implements PricingStrategy {
    private static final double HOURLY_RATE = 20.0;

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
