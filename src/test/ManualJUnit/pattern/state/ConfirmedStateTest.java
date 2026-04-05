package test.ManualJUnit.pattern.state;

import org.junit.Before;
import org.junit.Test;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Faculty;
import com.yorku.lab.pattern.state.ConfirmedState;
import com.yorku.lab.pattern.state.ModifiedState;
import com.yorku.lab.pattern.state.CancelledState;
import com.yorku.lab.pattern.state.ArrivedState;
import com.yorku.lab.pattern.state.NoShowState;
import com.yorku.lab.enums.BookingStatus;
import java.time.LocalDateTime;

public class ConfirmedStateTest {
    private Reservation reservation;
    private ConfirmedState confirmedState;
    private User user;
    private Equipment equipment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Before
    public void setUp() {
    	Credentials cred=new Credentials("diana@yorku.ca", "password303");
        user = new Faculty("U6", "Diana Prince",cred,"Cert123");
        equipment = new Equipment("E6", "pH Meter", "Lab F");
        startTime = LocalDateTime.of(2026, 4, 8, 13, 0);
        endTime = LocalDateTime.of(2026, 4, 8, 15, 0);
        reservation = new Reservation("R5", user, equipment, startTime, endTime);
        confirmedState = new ConfirmedState();
        reservation.setState(confirmedState);
        reservation.setStatus(BookingStatus.CONFIRMED);
    }

    @Test
    public void testModifySetsNewStartTime() {
        LocalDateTime newStart = LocalDateTime.of(2026, 4, 8, 14, 0);
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 8, 16, 0);
        confirmedState.modify(reservation, newStart, newEnd);
        assert reservation.getStartTime().equals(newStart);
    }

    @Test
    public void testModifySetsNewEndTime() {
        LocalDateTime newStart = LocalDateTime.of(2026, 4, 8, 14, 0);
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 8, 16, 0);
        confirmedState.modify(reservation, newStart, newEnd);
        assert reservation.getEndTime().equals(newEnd);
    }

    @Test
    public void testModifySetsStatusToModified() {
        LocalDateTime newStart = LocalDateTime.of(2026, 4, 8, 14, 0);
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 8, 16, 0);
        confirmedState.modify(reservation, newStart, newEnd);
        assert reservation.getStatus() == BookingStatus.MODIFIED;
    }

    @Test
    public void testModifyChangesStateToModifiedState() {
        LocalDateTime newStart = LocalDateTime.of(2026, 4, 8, 14, 0);
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 8, 16, 0);
        confirmedState.modify(reservation, newStart, newEnd);
        assert reservation.getCurrentState() instanceof ModifiedState;
    }

    @Test
    public void testCancelSetsStatusToCancelled() {
        confirmedState.cancel(reservation);
        assert reservation.getStatus() == BookingStatus.CANCELLED;
    }

    @Test
    public void testCancelChangesStateToCancelledState() {
        confirmedState.cancel(reservation);
        assert reservation.getCurrentState() instanceof CancelledState;
    }

    @Test(expected = IllegalStateException.class)
    public void testExtendThrowsException() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 8, 17, 0);
        confirmedState.extend(reservation, newEnd);
    }

    @Test
    public void testMarkArrivedSetsArrivedToTrue() {
        confirmedState.markArrived(reservation);
        assert reservation.isArrived() == true;
    }

    @Test
    public void testMarkArrivedSetsStatusToArrived() {
        confirmedState.markArrived(reservation);
        assert reservation.getStatus() == BookingStatus.ARRIVED;
    }

    @Test
    public void testMarkArrivedChangesStateToArrivedState() {
        confirmedState.markArrived(reservation);
        assert reservation.getCurrentState() instanceof ArrivedState;
    }

    @Test
    public void testMarkNoShowSetsStatusToNoShow() {
        confirmedState.markNoShow(reservation);
        assert reservation.getStatus() == BookingStatus.NO_SHOW;
    }

    @Test
    public void testMarkNoShowChangesStateToNoShowState() {
        confirmedState.markNoShow(reservation);
        assert reservation.getCurrentState() instanceof NoShowState;
    }

    @Test(expected = IllegalStateException.class)
    public void testCompleteThrowsException() {
        confirmedState.complete(reservation);
    }
}
