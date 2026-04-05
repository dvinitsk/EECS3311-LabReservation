package test.ManualJUnit.pattern.state;

import org.junit.Before;
import org.junit.Test;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Researcher;
import com.yorku.lab.pattern.state.ArrivedState;
import com.yorku.lab.pattern.state.ExtendedState;
import com.yorku.lab.pattern.state.CompletedState;
import com.yorku.lab.enums.BookingStatus;
import java.time.LocalDateTime;

public class ArrivedStateTest {
    private Reservation reservation;
    private ArrivedState arrivedState;
    private User user;
    private Equipment equipment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Before
    public void setUp() {
    	Credentials cred=new Credentials("diana@yorku.ca", "password303");
        user = new Researcher("U6", "Diana Prince",cred,"Cert123");
        equipment = new Equipment("E6", "pH Meter", "Lab F");
        startTime = LocalDateTime.of(2026, 4, 5, 14, 0);
        endTime = LocalDateTime.of(2026, 4, 5, 16, 0);
        reservation = new Reservation("R2", user, equipment, startTime, endTime);
        arrivedState = new ArrivedState();
        reservation.setState(arrivedState);
        reservation.setStatus(BookingStatus.ARRIVED);
        reservation.setArrived(true);
    }

    @Test(expected = IllegalStateException.class)
    public void testModifyThrowsException() {
        arrivedState.modify(reservation, startTime, endTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelThrowsException() {
        arrivedState.cancel(reservation);
    }

    @Test
    public void testExtendSetsNewEndTime() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 5, 17, 0);
        arrivedState.extend(reservation, newEnd);
        assert reservation.getEndTime().equals(newEnd);
    }

    @Test
    public void testExtendSetsStatusToExtended() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 5, 17, 0);
        arrivedState.extend(reservation, newEnd);
        assert reservation.getStatus() == BookingStatus.EXTENDED;
    }

    @Test
    public void testExtendChangesStateToExtendedState() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 5, 17, 0);
        arrivedState.extend(reservation, newEnd);
        assert reservation.getCurrentState() instanceof ExtendedState;
    }

    @Test
    public void testMarkArrivedIsNoop() {
        reservation.setArrived(false);
        arrivedState.markArrived(reservation);
        assert reservation.getStatus() == BookingStatus.ARRIVED;
    }

    @Test(expected = IllegalStateException.class)
    public void testMarkNoShowThrowsException() {
        arrivedState.markNoShow(reservation);
    }

    @Test
    public void testCompleteSetsStatusToCompleted() {
        arrivedState.complete(reservation);
        assert reservation.getStatus() == BookingStatus.COMPLETED;
    }

    @Test
    public void testCompleteChangesStateToCompletedState() {
        arrivedState.complete(reservation);
        assert reservation.getCurrentState() instanceof CompletedState;
    }

    @Test
    public void testArrivedStateInitializesCorrectly() {
        assert reservation.isArrived() == true;
        assert reservation.getStatus() == BookingStatus.ARRIVED;
    }

    @Test
    public void testExtendPreservesArrivedStatus() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 5, 18, 0);
        boolean wasArrived = reservation.isArrived();
        arrivedState.extend(reservation, newEnd);
        assert reservation.isArrived() == wasArrived;
    }
}
