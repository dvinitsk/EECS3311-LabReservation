package test.AI_assistant.pattern.state;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.pattern.state.*;

public class ReservationStateFactoryAITest {

    @Test
    public void testNullStatusReturnsConfirmedState() {
        assertTrue(ReservationStateFactory.fromStatus(null) instanceof ConfirmedState);
    }

    @Test
    public void testConfirmedStatusReturnsConfirmedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.CONFIRMED) instanceof ConfirmedState);
    }

    @Test
    public void testModifiedStatusReturnsModifiedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.MODIFIED) instanceof ModifiedState);
    }

    @Test
    public void testActiveStatusReturnsActiveState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.ACTIVE) instanceof ActiveState);
    }

    @Test
    public void testArrivedStatusReturnsArrivedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.ARRIVED) instanceof ArrivedState);
    }

    @Test
    public void testExtendedStatusReturnsExtendedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.EXTENDED) instanceof ExtendedState);
    }

    @Test
    public void testNoShowStatusReturnsNoShowState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.NO_SHOW) instanceof NoShowState);
    }

    @Test
    public void testCancelledStatusReturnsCancelledState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.CANCELLED) instanceof CancelledState);
    }

    @Test
    public void testCompletedStatusReturnsCompletedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.COMPLETED) instanceof CompletedState);
    }

    @Test
    public void testFactoryReturnsNewInstances() {
        ReservationState first = ReservationStateFactory.fromStatus(BookingStatus.CONFIRMED);
        ReservationState second = ReservationStateFactory.fromStatus(BookingStatus.CONFIRMED);
        assertNotSame(first, second);
    }
}
