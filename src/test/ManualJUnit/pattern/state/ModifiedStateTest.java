package test.ManualJUnit.pattern.state;

import org.junit.Before;
import org.junit.Test;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.pattern.state.ModifiedState;
import com.yorku.lab.pattern.state.CancelledState;
import com.yorku.lab.pattern.state.ArrivedState;
import com.yorku.lab.pattern.state.NoShowState;
import com.yorku.lab.enums.BookingStatus;
import java.time.LocalDateTime;

public class ModifiedStateTest {
    private Reservation reservation;
    private ModifiedState modifiedState;
    private User user;
    private Equipment equipment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Before
    public void setUp() {
    	Credentials cred=new Credentials("diana@yorku.ca", "password303");
        user = new Student("U6", "Diana Prince",cred,"Cert123");
        equipment = new Equipment("E6", "pH Meter", "Lab F");
        startTime = LocalDateTime.of(2026, 4, 10, 11, 0);
        endTime = LocalDateTime.of(2026, 4, 10, 13, 0);
        reservation = new Reservation("R7", user, equipment, startTime, endTime);
        modifiedState = new ModifiedState();
        reservation.setState(modifiedState);
        reservation.setStatus(BookingStatus.MODIFIED);
    }

    @Test
    public void testModifySetsNewStartTime() {
        LocalDateTime newStart = LocalDateTime.of(2026, 4, 10, 12, 0);
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 10, 14, 0);
        modifiedState.modify(reservation, newStart, newEnd);
        assert reservation.getStartTime().equals(newStart);
    }

    @Test
    public void testModifySetsNewEndTime() {
        LocalDateTime newStart = LocalDateTime.of(2026, 4, 10, 12, 0);
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 10, 14, 0);
        modifiedState.modify(reservation, newStart, newEnd);
        assert reservation.getEndTime().equals(newEnd);
    }

    @Test
    public void testModifyMaintainsModifiedStatus() {
        LocalDateTime newStart = LocalDateTime.of(2026, 4, 10, 12, 0);
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 10, 14, 0);
        modifiedState.modify(reservation, newStart, newEnd);
        assert reservation.getStatus() == BookingStatus.MODIFIED;
    }

    @Test
    public void testCancelSetsStatusToCancelled() {
        modifiedState.cancel(reservation);
        assert reservation.getStatus() == BookingStatus.CANCELLED;
    }

    @Test
    public void testCancelChangesStateToCancelledState() {
        modifiedState.cancel(reservation);
        assert reservation.getCurrentState() instanceof CancelledState;
    }

    @Test(expected = IllegalStateException.class)
    public void testExtendThrowsException() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 10, 15, 0);
        modifiedState.extend(reservation, newEnd);
    }

    @Test
    public void testMarkArrivedSetsArrivedToTrue() {
        modifiedState.markArrived(reservation);
        assert reservation.isArrived() == true;
    }

    @Test
    public void testMarkArrivedSetsStatusToArrived() {
        modifiedState.markArrived(reservation);
        assert reservation.getStatus() == BookingStatus.ARRIVED;
    }

    @Test
    public void testMarkArrivedChangesStateToArrivedState() {
        modifiedState.markArrived(reservation);
        assert reservation.getCurrentState() instanceof ArrivedState;
    }

    @Test
    public void testMarkNoShowSetsStatusToNoShow() {
        modifiedState.markNoShow(reservation);
        assert reservation.getStatus() == BookingStatus.NO_SHOW;
    }

    @Test
    public void testMarkNoShowChangesStateToNoShowState() {
        modifiedState.markNoShow(reservation);
        assert reservation.getCurrentState() instanceof NoShowState;
    }

    @Test(expected = IllegalStateException.class)
    public void testCompleteThrowsException() {
        modifiedState.complete(reservation);
    }
}
