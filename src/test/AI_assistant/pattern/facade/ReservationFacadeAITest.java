package test.AI_assistant.pattern.facade;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.facade.ReservationFacade;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.repository.UserRepository;

public class ReservationFacadeAITest {

    private ReservationFacade facade;
    private User user;

    @Before
    public void setUp() {
        facade = new ReservationFacade();
        user = new Student("F-AI-1", "Facade Student", new Credentials("facade@yorku.ca", "Pass123!"), "CERT");
        new UserRepository().save(user);
        new EquipmentRepository().save(new Equipment("F-EQ-1", "Microscope", "Lab A"));
    }

    @After
    public void tearDown() throws Exception {
        for (String file : new String[]{"data/users.csv", "data/equipment.csv", "data/reservations.csv", "data/payments.csv", "data/approval_requests.csv"}) {
            java.nio.file.Path path = java.nio.file.Paths.get(file);
            if (java.nio.file.Files.exists(path)) {
                java.nio.file.Files.delete(path);
            }
        }
    }

    @Test
    public void testBrowseEquipmentReturnsList() {
        assertNotNull(facade.browseEquipment());
    }

    @Test
    public void testFindAvailableEquipmentReturnsList() {
        assertNotNull(facade.findAvailableEquipment());
    }

    @Test
    public void testGetEquipmentFindsSavedEquipment() {
        Optional<Equipment> equipment = facade.getEquipment("F-EQ-1");
        assertTrue(equipment.isPresent());
    }

    @Test
    public void testGetHourlyRateForStudent() {
        assertEquals(10.0, facade.getHourlyRate(user), 0.01);
    }

    @Test
    public void testGetDepositAmountForStudent() {
        assertEquals(10.0, facade.getDepositAmount(user), 0.01);
    }

    @Test
    public void testGetPendingApprovalsReturnsList() {
        assertNotNull(facade.getPendingApprovals());
    }

    @Test
    public void testGetReservationReturnsEmptyForMissingId() {
        assertTrue(facade.getReservation("missing-id").isEmpty());
    }

    @Test
    public void testCancelBookingReturnsFalseForMissingId() {
        assertFalse(facade.cancelBooking("missing-id"));
    }

    @Test
    public void testFormatSlotContainsDate() {
        String formatted = ReservationFacade.formatSlot(LocalDateTime.of(2026, 4, 4, 14, 0));
        assertTrue(formatted.contains("2026-04-04"));
    }

    @Test
    public void testGetNextValidStartTimeHasZeroMinute() {
        assertEquals(0, facade.getNextValidStartTime().getMinute());
    }
}
