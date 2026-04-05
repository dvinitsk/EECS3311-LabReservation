package test.ManualJUnit.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.*;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.repository.ReservationRepository;
import com.yorku.lab.repository.UserRepository;

public class ReservationRepositoryTest {

	private ReservationRepository repository;
	private UserRepository userRepository;
	private EquipmentRepository equipmentRepository;
	private User testUser;
	private Equipment testEquipment;

	@Before
	public void setUp() {
		deleteFile("data/users.csv");
		deleteFile("data/equipment.csv");
		deleteFile("data/reservations.csv");

		userRepository = new UserRepository();
		equipmentRepository = new EquipmentRepository();
		repository = new ReservationRepository(userRepository, equipmentRepository);

		testUser = new Student("S001", "John Doe", new Credentials("john@york.ca", "pass123"), "STU001");
		userRepository.save(testUser);

		testEquipment = new Equipment("EQ-001", "Microscope", "Lab A");
		testEquipment.setOperationalStatus(OperationalStatus.AVAILABLE);
		equipmentRepository.save(testEquipment);
	}

	@After
	public void tearDown() {
		deleteFile("data/reservations.csv");
		deleteFile("data/users.csv");
		deleteFile("data/equipment.csv");
	}

	private void deleteFile(String file) {
		try {
			Path path = Paths.get(file);
			if (Files.exists(path)) {
				Files.delete(path);
			}
		} catch (Exception e) {
			// ignore
		}
	}

	private Reservation makeReservation(String id) {
		LocalDateTime start = LocalDateTime.of(2026, 5, 1, 10, 0);
		LocalDateTime end = LocalDateTime.of(2026, 5, 1, 12, 0);
		return new Reservation(id, testUser, testEquipment, start, end);
	}

	@Test
	public void testFindAllEmptyInitially() {
		assertEquals(0, repository.findAll().size());
	}

	@Test
	public void testSaveAndFindById() {
		Reservation res = makeReservation("RES-001");
		repository.save(res);

		assertTrue(repository.findById("RES-001").isPresent());
		assertEquals("RES-001", repository.findById("RES-001").get().getReservationId());
	}

	@Test
	public void testFindByIdNotFound() {
		assertFalse(repository.findById("NONEXISTENT").isPresent());
	}

	@Test
	public void testSaveMultipleReservations() {
		repository.save(makeReservation("RES-001"));
		repository.save(makeReservation("RES-002"));

		assertEquals(2, repository.findAll().size());
	}

	@Test
	public void testSaveUpdatesExisting() {
		Reservation res = makeReservation("RES-001");
		repository.save(res);

		res.setStatus(BookingStatus.CANCELLED);
		repository.save(res);

		assertEquals(1, repository.findAll().size());
		assertEquals(BookingStatus.CANCELLED, repository.findById("RES-001").get().getStatus());
	}

	@Test
	public void testDeleteRemovesReservation() {
		repository.save(makeReservation("RES-001"));
		repository.delete("RES-001");

		assertFalse(repository.findById("RES-001").isPresent());
		assertEquals(0, repository.findAll().size());
	}

	@Test
	public void testDeleteNonexistentDoesNothing() {
		repository.save(makeReservation("RES-001"));
		repository.delete("NONEXISTENT");

		assertEquals(1, repository.findAll().size());
	}

	@Test
	public void testFindByUser() {
		repository.save(makeReservation("RES-001"));
		repository.save(makeReservation("RES-002"));

		List<Reservation> results = repository.findByUser("S001");
		assertEquals(2, results.size());
	}

	@Test
	public void testFindByUserNoResults() {
		repository.save(makeReservation("RES-001"));

		List<Reservation> results = repository.findByUser("UNKNOWN");
		assertEquals(0, results.size());
	}

	@Test
	public void testFindByEquipment() {
		repository.save(makeReservation("RES-001"));

		List<Reservation> results = repository.findByEquipment("EQ-001");
		assertEquals(1, results.size());
	}

	@Test
	public void testFindByEquipmentNoResults() {
		repository.save(makeReservation("RES-001"));

		List<Reservation> results = repository.findByEquipment("EQ-UNKNOWN");
		assertEquals(0, results.size());
	}

	@Test
	public void testArrivedStatusPersisted() {
		Reservation res = makeReservation("RES-001");
		res.setArrived(true);
		repository.save(res);

		assertTrue(repository.findById("RES-001").get().isArrived());
	}

	@Test
	public void testTimePersisted() {
		Reservation res = makeReservation("RES-001");
		repository.save(res);

		Reservation loaded = repository.findById("RES-001").get();
		assertEquals(LocalDateTime.of(2026, 5, 1, 10, 0), loaded.getStartTime());
		assertEquals(LocalDateTime.of(2026, 5, 1, 12, 0), loaded.getEndTime());
	}
}
