package test.ManualJUnit.pattern.state;

import org.junit.Before;
import org.junit.Test;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Guest;
import com.yorku.lab.pattern.state.CompletedState;
import com.yorku.lab.enums.BookingStatus;
import java.time.LocalDateTime;

public class CompletedStateTest {
    private Reservation reservation;
    private CompletedState completedState;
    private User user;
    private Equipment equipment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Before
    public void setUp() {
    	Credentials cred=new Credentials("diana@yorku.ca", "password303");
        user = new Guest("U6", "Diana Prince",cred,"Cert123");
        equipment = new Equipment("E6", "pH Meter", "Lab F");
        startTime = LocalDateTime.of(2026, 4, 7, 8, 0);
        endTime = LocalDateTime.of(2026, 4, 7, 10, 0);
        reservation = new Reservation("R4", user, equipment, startTime, endTime);
        completedState = new CompletedState();
        reservation.setState(completedState);
        reservation.setStatus(BookingStatus.COMPLETED);
    }

    @Test(expected = IllegalStateException.class)
    public void testModifyThrowsException() {
        completedState.modify(reservation, startTime, endTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelThrowsException() {
        completedState.cancel(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testExtendThrowsException() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 7, 11, 0);
        completedState.extend(reservation, newEnd);
    }

    @Test(expected = IllegalStateException.class)
    public void testMarkArrivedThrowsException() {
        completedState.markArrived(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testMarkNoShowThrowsException() {
        completedState.markNoShow(reservation);
    }

    @Test
    public void testCompleteIsNoop() {
        BookingStatus statusBefore = reservation.getStatus();
        completedState.complete(reservation);
        assert reservation.getStatus() == statusBefore;
    }

    @Test
    public void testCompletedStateStatusIsSet() {
        assert reservation.getStatus() == BookingStatus.COMPLETED;
    }

    @Test
    public void testCompletedStatePreservesReservationId() {
        String originalId = reservation.getReservationId();
        completedState.complete(reservation);
        assert reservation.getReservationId().equals(originalId);
    }

    @Test
    public void testCompletedStatePreservesUser() {
        User originalUser = reservation.getUser();
        completedState.complete(reservation);
        assert reservation.getUser() == originalUser;
    }

    @Test
    public void testCompletedStatePreservesEquipment() {
        Equipment originalEquipment = reservation.getEquipment();
        completedState.complete(reservation);
        assert reservation.getEquipment() == originalEquipment;
    }
}
