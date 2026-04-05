package test.ManualJUnit.pattern.state;

import org.junit.Before;
import org.junit.Test;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.pattern.state.CancelledState;
import com.yorku.lab.enums.BookingStatus;
import java.time.LocalDateTime;

public class CancelledStateTest {
    private Reservation reservation;
    private CancelledState cancelledState;
    private User user;
    private Equipment equipment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Before
    public void setUp() {
    	Credentials cred=new Credentials("diana@yorku.ca", "password303");
        user = new Student("U6", "Diana Prince",cred,"Cert123");
        equipment = new Equipment("E6", "pH Meter", "Lab F");
        startTime = LocalDateTime.of(2026, 4, 6, 9, 0);
        endTime = LocalDateTime.of(2026, 4, 6, 11, 0);
        reservation = new Reservation("R3", user, equipment, startTime, endTime);
        cancelledState = new CancelledState();
        reservation.setState(cancelledState);
        reservation.setStatus(BookingStatus.CANCELLED);
    }

    @Test(expected = IllegalStateException.class)
    public void testModifyThrowsException() {
        cancelledState.modify(reservation, startTime, endTime);
    }

    @Test
    public void testCancelIsNoop() {
        BookingStatus statusBefore = reservation.getStatus();
        cancelledState.cancel(reservation);
        assert reservation.getStatus() == statusBefore;
    }

    @Test(expected = IllegalStateException.class)
    public void testExtendThrowsException() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 6, 12, 0);
        cancelledState.extend(reservation, newEnd);
    }

    @Test(expected = IllegalStateException.class)
    public void testMarkArrivedThrowsException() {
        cancelledState.markArrived(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testMarkNoShowThrowsException() {
        cancelledState.markNoShow(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testCompleteThrowsException() {
        cancelledState.complete(reservation);
    }

    @Test
    public void testCancelledStateStatusIsSet() {
        assert reservation.getStatus() == BookingStatus.CANCELLED;
    }

    @Test
    public void testCancelledStatePreservesReservationId() {
        String originalId = reservation.getReservationId();
        cancelledState.cancel(reservation);
        assert reservation.getReservationId().equals(originalId);
    }

    @Test
    public void testCancelledStatePreservesUser() {
        User originalUser = reservation.getUser();
        cancelledState.cancel(reservation);
        assert reservation.getUser() == originalUser;
    }

    @Test
    public void testCancelledStatePreservesEquipment() {
        Equipment originalEquipment = reservation.getEquipment();
        cancelledState.cancel(reservation);
        assert reservation.getEquipment() == originalEquipment;
    }
}
