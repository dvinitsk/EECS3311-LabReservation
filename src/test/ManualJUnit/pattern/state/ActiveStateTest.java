package test.ManualJUnit.pattern.state;

import org.junit.Before;
import org.junit.Test;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Faculty;
import com.yorku.lab.pattern.state.ActiveState;
import com.yorku.lab.pattern.state.ExtendedState;
import com.yorku.lab.pattern.state.ArrivedState;
import com.yorku.lab.pattern.state.NoShowState;
import com.yorku.lab.pattern.state.CompletedState;
import com.yorku.lab.enums.BookingStatus;
import java.time.LocalDateTime;

public class ActiveStateTest {
    private Reservation reservation;
    private ActiveState activeState;
    private User user;
    private Equipment equipment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Before
    public void setUp() {
    	Credentials cred=new Credentials("diana@yorku.ca", "password303");
        user = new Faculty("U6", "Diana Prince",cred,"Cert123");
        equipment = new Equipment("E6", "pH Meter", "Lab F");
        startTime = LocalDateTime.of(2026, 4, 5, 10, 0);
        endTime = LocalDateTime.of(2026, 4, 5, 12, 0);
        reservation = new Reservation("R1", user, equipment, startTime, endTime);
        activeState = new ActiveState();
        reservation.setState(activeState);
        reservation.setStatus(BookingStatus.ACTIVE);
    }

    @Test(expected = IllegalStateException.class)
    public void testModifyThrowsException() {
        activeState.modify(reservation, startTime, endTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelThrowsException() {
        activeState.cancel(reservation);
    }

    @Test
    public void testExtendSetsNewEndTime() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 5, 14, 0);
        activeState.extend(reservation, newEnd);
        assert reservation.getEndTime().equals(newEnd);
    }

    @Test
    public void testExtendSetsStatusToExtended() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 5, 14, 0);
        activeState.extend(reservation, newEnd);
        assert reservation.getStatus() == BookingStatus.EXTENDED;
    }

    @Test
    public void testExtendChangesStateToExtendedState() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 5, 14, 0);
        activeState.extend(reservation, newEnd);
        assert reservation.getCurrentState() instanceof ExtendedState;
    }

    @Test
    public void testMarkArrivedSetsArrivedToTrue() {
        activeState.markArrived(reservation);
        assert reservation.isArrived() == true;
    }

    @Test
    public void testMarkArrivedSetsStatusToArrived() {
        activeState.markArrived(reservation);
        assert reservation.getStatus() == BookingStatus.ARRIVED;
    }

    @Test
    public void testMarkArrivedChangesStateToArrivedState() {
        activeState.markArrived(reservation);
        assert reservation.getCurrentState() instanceof ArrivedState;
    }

    @Test
    public void testMarkNoShowSetsStatusToNoShow() {
        activeState.markNoShow(reservation);
        assert reservation.getStatus() == BookingStatus.NO_SHOW;
    }

    @Test
    public void testMarkNoShowChangesStateToNoShowState() {
        activeState.markNoShow(reservation);
        assert reservation.getCurrentState() instanceof NoShowState;
    }

    @Test
    public void testCompleteSetsStatusToCompleted() {
        activeState.complete(reservation);
        assert reservation.getStatus() == BookingStatus.COMPLETED;
    }

    @Test
    public void testCompleteChangesStateToCompletedState() {
        activeState.complete(reservation);
        assert reservation.getCurrentState() instanceof CompletedState;
    }
}
