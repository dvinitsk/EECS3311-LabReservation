package com.yorku.lab.pattern.state;

import com.yorku.lab.enums.BookingStatus;

public class ReservationStateFactory {

    public static ReservationState fromStatus(BookingStatus status) {
        if (status == null) return new ConfirmedState();
        return switch (status) {
            case CONFIRMED -> new ConfirmedState();
            case MODIFIED -> new ModifiedState();
            case ACTIVE -> new ActiveState();
            case ARRIVED -> new ArrivedState();
            case EXTENDED -> new ExtendedState();
            case NO_SHOW -> new NoShowState();
            case CANCELLED -> new CancelledState();
            case COMPLETED -> new CompletedState();
        };
    }
}
