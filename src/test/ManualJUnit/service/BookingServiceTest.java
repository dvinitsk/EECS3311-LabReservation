package test.ManualJUnit.service;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.repository.ReservationRepository;
import com.yorku.lab.repository.UserRepository;
import com.yorku.lab.service.BookingService;

public class BookingServiceTest {

	private BookingService bookingService;
	private EquipmentRepository equipmentRepository;
	private ReservationRepository reservationRepository;
	private UserRepository userRepository;
	private User testUser;
	private Equipment testEquipment;

	@Before
	public void setUp() throws Exception {
		equipmentRepository = new EquipmentRepository();
		reservationRepository = new ReservationRepository();
		userRepository = new UserRepository();
		bookingService = new BookingService(reservationRepository, equipmentRepository, userRepository);
		
		Credentials credentials = new Credentials("student@york.ca", "password123");
		testUser = new Student("S001", "John Doe", credentials, "STU123");
		userRepository.save(testUser);
		
		testEquipment = new Equipment("EQ-001", "Microscope", "Lab A");
		testEquipment.setOperationalStatus(OperationalStatus.AVAILABLE);
		equipmentRepository.save(testEquipment);
	}

	@After
	public void tearDown() throws Exception {
		java.nio.file.Path path = java.nio.file.Paths.get("data/reservations.csv");
		if (java.nio.file.Files.exists(path)) {
			java.nio.file.Files.delete(path);
		}
	}

	@Test
	public void testCreateReservationSucceeds() {
		LocalDateTime start = LocalDateTime.now().plusDays(30);
		LocalDateTime end = start.plusHours(3);
		Optional<Reservation> reservation = bookingService.createReservation(testUser, "EQ-001", start, end);
		assertTrue(reservation.isPresent());
		assertEquals(testUser, reservation.get().getUser());
		assertEquals(start, reservation.get().getStartTime());
		assertEquals(end, reservation.get().getEndTime());
	}

	@Test
	public void testCreateReservationFailsWithUnavailableEquipment() {
		testEquipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
		equipmentRepository.save(testEquipment);
		
		LocalDateTime start = LocalDateTime.now().plusDays(30);
		LocalDateTime end = start.plusHours(2);
		Optional<Reservation> reservation = bookingService.createReservation(testUser, "EQ-001", start, end);
		assertFalse(reservation.isPresent());
	}

	@Test
	public void testCreateReservationFailsWithConflictingSlot() {
		LocalDateTime start1 = LocalDateTime.now().plusDays(30);
		LocalDateTime end1 = start1.plusHours(2);
		Optional<Reservation> res1 = bookingService.createReservation(testUser, "EQ-001", start1, end1);
		assertTrue(res1.isPresent());
		
		LocalDateTime start2 = start1.plusMinutes(30);
		LocalDateTime end2 = start2.plusHours(1);
		Optional<Reservation> reservation = bookingService.createReservation(testUser, "EQ-001", start2, end2);
		assertFalse(reservation.isPresent());
	}

	@Test
	public void testIsSlotAvailableReturnsTrueWhenEmpty() {
		LocalDateTime start = LocalDateTime.now().plusDays(35);
		LocalDateTime end = start.plusHours(2);
		boolean available = bookingService.isSlotAvailable("EQ-001", start, end, null);
		assertTrue(available);
	}

	@Test
	public void testIsSlotAvailableReturnsFalseWhenConflicting() {
		LocalDateTime start1 = LocalDateTime.now().plusDays(30);
		LocalDateTime end1 = start1.plusHours(2);
		bookingService.createReservation(testUser, "EQ-001", start1, end1);
		
		LocalDateTime start2 = start1.plusMinutes(30);
		LocalDateTime end2 = start2.plusHours(1);
		boolean available = bookingService.isSlotAvailable("EQ-001", start2, end2, null);
		assertFalse(available);
	}

	@Test
	public void testModifyBookingChangesStartAndEndTime() {
		LocalDateTime start = LocalDateTime.now().plusDays(30);
		LocalDateTime end = start.plusHours(2);
		Optional<Reservation> created = bookingService.createReservation(testUser, "EQ-001", start, end);
		assertTrue(created.isPresent());
		
		String reservationId = created.get().getReservationId();
		LocalDateTime newStart = start.plusDays(5);
		LocalDateTime newEnd = newStart.plusHours(2);
		Optional<Reservation> modified = bookingService.modifyBooking(reservationId, newStart, newEnd);
		assertTrue(modified.isPresent());
		assertEquals(newStart, modified.get().getStartTime());
		assertEquals(newEnd, modified.get().getEndTime());
	}

	@Test
	public void testModifyBookingFailsWithConflictingSlot() {
		LocalDateTime start1 = LocalDateTime.now().plusDays(30);
		LocalDateTime end1 = start1.plusHours(2);
		Optional<Reservation> res1 = bookingService.createReservation(testUser, "EQ-001", start1, end1);
		assertTrue(res1.isPresent());
		
		Credentials cred2 = new Credentials("user2@york.ca", "pass");
		User user2 = new Student("S002", "Jane Doe", cred2, "STU456");
		userRepository.save(user2);
		
		LocalDateTime start2 = start1.plusHours(3);
		LocalDateTime end2 = start2.plusHours(2);
		Optional<Reservation> res2 = bookingService.createReservation(user2, "EQ-001", start2, end2);
		assertTrue(res2.isPresent());
		
		LocalDateTime conflictStart = start1.plusMinutes(30);
		LocalDateTime conflictEnd = start2.plusMinutes(30);
		Optional<Reservation> modified = bookingService.modifyBooking(res2.get().getReservationId(), conflictStart, conflictEnd);
		assertFalse(modified.isPresent());
	}

	@Test
	public void testCancelBookingReturnsTrue() {
		LocalDateTime start = LocalDateTime.now().plusDays(30);
		LocalDateTime end = start.plusHours(2);
		Optional<Reservation> created = bookingService.createReservation(testUser, "EQ-001", start, end);
		assertTrue(created.isPresent());
		
		String reservationId = created.get().getReservationId();
		boolean cancelled = bookingService.cancelBooking(reservationId);
		assertTrue(cancelled);
	}

	@Test
	public void testCancelBookingReturnsFalseWithInvalidId() {
		boolean cancelled = bookingService.cancelBooking("INVALID_ID");
		assertFalse(cancelled);
	}

	@Test
	public void testExtendReservationFailsWithConflictingSlot() {
		LocalDateTime start1 = LocalDateTime.now().plusDays(30);
		LocalDateTime end1 = start1.plusHours(2);
		Optional<Reservation> res1 = bookingService.createReservation(testUser, "EQ-001", start1, end1);
		assertTrue(res1.isPresent());
		
		Credentials cred2 = new Credentials("user2@york.ca", "pass");
		User user2 = new Student("S002", "Jane Doe", cred2, "STU456");
		userRepository.save(user2);
		
		LocalDateTime start2 = end1.plusHours(1);
		LocalDateTime end2 = start2.plusHours(1);
		Optional<Reservation> res2 = bookingService.createReservation(user2, "EQ-001", start2, end2);
		assertTrue(res2.isPresent());
		
		LocalDateTime extendedEnd = end2.plusMinutes(30);
		Optional<Reservation> extended = bookingService.extendReservation(res1.get().getReservationId(), extendedEnd);
		assertFalse(extended.isPresent());
	}

	@Test
	public void testSuggestNextAvailableSlotsReturnsRequestedCount() {
		LocalDateTime from = LocalDateTime.now().plusDays(30);
		List<LocalDateTime> suggestions = bookingService.suggestNextAvailableSlots("EQ-001", from, 5);
		assertEquals(5, suggestions.size());
	}

}
