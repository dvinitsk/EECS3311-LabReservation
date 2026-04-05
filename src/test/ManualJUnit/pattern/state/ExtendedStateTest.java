package test.ManualJUnit.pattern.state;

import org.junit.Before;
import org.junit.Test;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Researcher;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.pattern.state.ExtendedState;
import com.yorku.lab.pattern.state.ArrivedState;
import com.yorku.lab.pattern.state.NoShowState;
import com.yorku.lab.pattern.state.CompletedState;
import com.yorku.lab.enums.BookingStatus;
import java.time.LocalDateTime;

public class ExtendedStateTest {
    private Reservation reservation;
    private ExtendedState extendedState;
    private User user;
    private Equipment equipment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Before
    public void setUp() {
    	Credentials cred=new Credentials("diana@yorku.ca", "password303");
        user = new Researcher("U6", "Diana Prince",cred,"Cert123");
        equipment = new Equipment("E6", "pH Meter", "Lab F");
        startTime = LocalDateTime.of(2026, 4, 9, 10, 0);
        endTime = LocalDateTime.of(2026, 4, 9, 12, 0);
        reservation = new Reservation("R6", user, equipment, startTime, endTime);
        extendedState = new ExtendedState();
        reservation.setState(extendedState);
        reservation.setStatus(BookingStatus.EXTENDED);
    }

    @Test(expected = IllegalStateException.class)
    public void testModifyThrowsException() {
        extendedState.modify(reservation, startTime, endTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelThrowsException() {
        extendedState.cancel(reservation);
    }

    @Test
    public void testExtendSetsNewEndTime() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 9, 14, 0);
        extendedState.extend(reservation, newEnd);
        assert reservation.getEndTime().equals(newEnd);
    }

    @Test
    public void testExtendMaintainsExtendedStatus() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 9, 14, 0);
        extendedState.extend(reservation, newEnd);
        assert reservation.getStatus() == BookingStatus.EXTENDED;
    }

    @Test
    public void testExtendPreservesState() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 9, 14, 0);
        extendedState.extend(reservation, newEnd);
        assert reservation.getCurrentState() instanceof ExtendedState;
    }

    @Test
    public void testMarkArrivedSetsArrivedToTrue() {
        extendedState.markArrived(reservation);
        assert reservation.isArrived() == true;
    }

    @Test
    public void testMarkArrivedSetsStatusToArrived() {
        extendedState.markArrived(reservation);
        assert reservation.getStatus() == BookingStatus.ARRIVED;
    }

    @Test
    public void testMarkArrivedChangesStateToArrivedState() {
        extendedState.markArrived(reservation);
        assert reservation.getCurrentState() instanceof ArrivedState;
    }

    @Test
    public void testMarkNoShowSetsStatusToNoShow() {
        extendedState.markNoShow(reservation);
        assert reservation.getStatus() == BookingStatus.NO_SHOW;
    }

    @Test
    public void testMarkNoShowChangesStateToNoShowState() {
        extendedState.markNoShow(reservation);
        assert reservation.getCurrentState() instanceof NoShowState;
    }

    @Test
    public void testCompleteSetsStatusToCompleted() {
        extendedState.complete(reservation);
        assert reservation.getStatus() == BookingStatus.COMPLETED;
    }

    @Test
    public void testCompleteChangesStateToCompletedState() {
        extendedState.complete(reservation);
        assert reservation.getCurrentState() instanceof CompletedState;
    }
}
