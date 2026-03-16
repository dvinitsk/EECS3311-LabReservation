package com.yorku.lab.pattern.strategy;

import com.yorku.lab.enums.UserType;

public class PricingStrategyFactory {

    private PricingStrategyFactory() {}

    public static PricingStrategy getStrategy(UserType userType) {
        switch (userType) {
            case STUDENT:    return new StudentPricingStrategy();
            case FACULTY:    return new FacultyPricingStrategy();
            case RESEARCHER: return new ResearcherPricingStrategy();
            case GUEST:      return new GuestPricingStrategy();
            default:
                throw new IllegalArgumentException("No pricing strategy for user type: " + userType);
        }
    }
}
