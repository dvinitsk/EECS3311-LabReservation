package test.ManualJUnit.pattern.state;

import org.junit.Test;
import com.yorku.lab.pattern.state.ReservationState;
import com.yorku.lab.pattern.state.ReservationStateFactory;
import com.yorku.lab.pattern.state.ConfirmedState;
import com.yorku.lab.pattern.state.ModifiedState;
import com.yorku.lab.pattern.state.ActiveState;
import com.yorku.lab.pattern.state.ArrivedState;
import com.yorku.lab.pattern.state.ExtendedState;
import com.yorku.lab.pattern.state.NoShowState;
import com.yorku.lab.pattern.state.CancelledState;
import com.yorku.lab.pattern.state.CompletedState;
import com.yorku.lab.enums.BookingStatus;

public class ReservationStateFactoryTest {

    @Test
    public void testFromStatusReturnsConfirmedStateForConfirmed() {
        ReservationState state = ReservationStateFactory.fromStatus(BookingStatus.CONFIRMED);
        assert state instanceof ConfirmedState;
    }

    @Test
    public void testFromStatusReturnsModifiedStateForModified() {
        ReservationState state = ReservationStateFactory.fromStatus(BookingStatus.MODIFIED);
        assert state instanceof ModifiedState;
    }

    @Test
    public void testFromStatusReturnsActiveStateForActive() {
        ReservationState state = ReservationStateFactory.fromStatus(BookingStatus.ACTIVE);
        assert state instanceof ActiveState;
    }

    @Test
    public void testFromStatusReturnsArrivedStateForArrived() {
        ReservationState state = ReservationStateFactory.fromStatus(BookingStatus.ARRIVED);
        assert state instanceof ArrivedState;
    }

    @Test
    public void testFromStatusReturnsExtendedStateForExtended() {
        ReservationState state = ReservationStateFactory.fromStatus(BookingStatus.EXTENDED);
        assert state instanceof ExtendedState;
    }

    @Test
    public void testFromStatusReturnsNoShowStateForNoShow() {
        ReservationState state = ReservationStateFactory.fromStatus(BookingStatus.NO_SHOW);
        assert state instanceof NoShowState;
    }

    @Test
    public void testFromStatusReturnsCancelledStateForCancelled() {
        ReservationState state = ReservationStateFactory.fromStatus(BookingStatus.CANCELLED);
        assert state instanceof CancelledState;
    }

    @Test
    public void testFromStatusReturnsCompletedStateForCompleted() {
        ReservationState state = ReservationStateFactory.fromStatus(BookingStatus.COMPLETED);
        assert state instanceof CompletedState;
    }

    @Test
    public void testFromStatusReturnsConfirmedStateForNull() {
        ReservationState state = ReservationStateFactory.fromStatus(null);
        assert state instanceof ConfirmedState;
    }

    @Test
    public void testFromStatusNeverReturnsNull() {
        for (BookingStatus status : BookingStatus.values()) {
            ReservationState state = ReservationStateFactory.fromStatus(status);
            assert state != null;
        }
    }
}
