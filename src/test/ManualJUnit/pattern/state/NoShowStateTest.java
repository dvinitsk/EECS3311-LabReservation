package test.ManualJUnit.pattern.state;

import org.junit.Before;
import org.junit.Test;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Guest;
import com.yorku.lab.pattern.state.NoShowState;
import com.yorku.lab.enums.BookingStatus;
import java.time.LocalDateTime;

public class NoShowStateTest {
    private Reservation reservation;
    private NoShowState noShowState;
    private User user;
    private Equipment equipment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Before
    public void setUp() {
    	Credentials cred=new Credentials("diana@yorku.ca", "password303");
        user = new Guest("U6", "Diana Prince",cred,"Cert123");
        equipment = new Equipment("E6", "pH Meter", "Lab F");
        startTime = LocalDateTime.of(2026, 4, 11, 9, 0);
        endTime = LocalDateTime.of(2026, 4, 11, 11, 0);
        reservation = new Reservation("R8", user, equipment, startTime, endTime);
        noShowState = new NoShowState();
        reservation.setState(noShowState);
        reservation.setStatus(BookingStatus.NO_SHOW);
    }

    @Test(expected = IllegalStateException.class)
    public void testModifyThrowsException() {
        noShowState.modify(reservation, startTime, endTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelThrowsException() {
        noShowState.cancel(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testExtendThrowsException() {
        LocalDateTime newEnd = LocalDateTime.of(2026, 4, 11, 12, 0);
        noShowState.extend(reservation, newEnd);
    }

    @Test(expected = IllegalStateException.class)
    public void testMarkArrivedThrowsException() {
        noShowState.markArrived(reservation);
    }

    @Test
    public void testMarkNoShowIsNoop() {
        BookingStatus statusBefore = reservation.getStatus();
        noShowState.markNoShow(reservation);
        assert reservation.getStatus() == statusBefore;
    }

    @Test(expected = IllegalStateException.class)
    public void testCompleteThrowsException() {
        noShowState.complete(reservation);
    }

    @Test
    public void testNoShowStateStatusIsSet() {
        assert reservation.getStatus() == BookingStatus.NO_SHOW;
    }

    @Test
    public void testNoShowStatePreservesReservationId() {
        String originalId = reservation.getReservationId();
        noShowState.markNoShow(reservation);
        assert reservation.getReservationId().equals(originalId);
    }

    @Test
    public void testNoShowStatePreservesUser() {
        User originalUser = reservation.getUser();
        noShowState.markNoShow(reservation);
        assert reservation.getUser() == originalUser;
    }

    @Test
    public void testNoShowStatePreservesEquipment() {
        Equipment originalEquipment = reservation.getEquipment();
        noShowState.markNoShow(reservation);
        assert reservation.getEquipment() == originalEquipment;
    }
}
