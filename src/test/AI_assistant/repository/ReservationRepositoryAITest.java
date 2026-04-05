package test.AI_assistant.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.state.CancelledState;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.repository.ReservationRepository;
import com.yorku.lab.repository.UserRepository;

public class ReservationRepositoryAITest {

    private ReservationRepository repository;
    private UserRepository userRepository;
    private EquipmentRepository equipmentRepository;
    private User user;
    private Equipment equipment;

    @Before
    public void setUp() {
        userRepository = new UserRepository();
        equipmentRepository = new EquipmentRepository();
        repository = new ReservationRepository(userRepository, equipmentRepository);

        user = new Student("RR-U1", "Reservation User", new Credentials("reservation@yorku.ca", "Pass123!"), "CERT");
        equipment = new Equipment("RR-E1", "Microscope", "Lab A");
        userRepository.save(user);
        equipmentRepository.save(equipment);
    }

    @After
    public void tearDown() throws Exception {
        deleteIfExists("data/reservations.csv");
        deleteIfExists("data/users.csv");
        deleteIfExists("data/equipment.csv");
    }

    private void deleteIfExists(String file) throws Exception {
        Path path = Paths.get(file);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    private Reservation makeReservation(String id) {
        return new Reservation(id, user, equipment, LocalDateTime.of(2026, 4, 10, 10, 0), LocalDateTime.of(2026, 4, 10, 12, 0));
    }

    @Test
    public void testSaveAndFindById() {
        repository.save(makeReservation("RES-A1"));
        assertTrue(repository.findById("RES-A1").isPresent());
    }

    @Test
    public void testFindByIdMissingReturnsEmpty() {
        assertTrue(repository.findById("missing").isEmpty());
    }

    @Test
    public void testFindByUserReturnsSavedReservation() {
        repository.save(makeReservation("RES-A2"));
        assertEquals(1, repository.findByUser(user.getUserId()).size());
    }

    @Test
    public void testFindByEquipmentReturnsSavedReservation() {
        repository.save(makeReservation("RES-A3"));
        assertEquals(1, repository.findByEquipment(equipment.getEquipmentId()).size());
    }

    @Test
    public void testDeleteRemovesReservation() {
        repository.save(makeReservation("RES-A4"));
        repository.delete("RES-A4");
        assertTrue(repository.findById("RES-A4").isEmpty());
    }

    @Test
    public void testArrivedFlagIsPreserved() {
        Reservation reservation = makeReservation("RES-A5");
        reservation.setArrived(true);
        repository.save(reservation);
        assertTrue(repository.findById("RES-A5").get().isArrived());
    }

    @Test
    public void testCancelledStatusIsPreserved() {
        Reservation reservation = makeReservation("RES-A6");
        reservation.cancel();
        repository.save(reservation);
        assertEquals(BookingStatus.CANCELLED, repository.findById("RES-A6").get().getStatus());
    }

    @Test
    public void testCancelledStateIsRestored() {
        Reservation reservation = makeReservation("RES-A7");
        reservation.cancel();
        repository.save(reservation);
        assertTrue(repository.findById("RES-A7").get().getCurrentState() instanceof CancelledState);
    }

    @Test
    public void testSaveUpdatesExistingReservation() {
        Reservation reservation = makeReservation("RES-A8");
        repository.save(reservation);
        reservation.setEndTime(LocalDateTime.of(2026, 4, 10, 13, 0));
        repository.save(reservation);
        assertEquals(LocalDateTime.of(2026, 4, 10, 13, 0), repository.findById("RES-A8").get().getEndTime());
    }

    @Test
    public void testFindAllReturnsMultipleReservations() {
        repository.save(makeReservation("RES-A9"));
        repository.save(makeReservation("RES-A10"));
        assertEquals(2, repository.findAll().size());
    }
}
