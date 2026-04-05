package test.ManualJUnit.service;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.model.*;
import com.yorku.lab.service.ArrivalMonitor;
import com.yorku.lab.enums.BookingStatus;

public class ArrivalMonitorTest {

	private ArrivalMonitor arrivalMonitor;
	private Student student;
	private Guest guest;
	private Researcher researcher;
	private Equipment equipment;
	private Credentials credentials;

	@Before
	public void setUp() {
		arrivalMonitor = new ArrivalMonitor();
		credentials = new Credentials("test@york.edu", "password123");
		student = new Student("STU001", "John Student", credentials);
		guest = new Guest("GUEST001", "Jane Guest", credentials);
		researcher = new Researcher("RES001", "Bob Researcher", credentials, "RES-CERT-001");
		equipment = new Equipment("EQU001", "Test Equipment", "Lab Room 101");
	}

	@Test
	public void testIsWithinArrivalWindow_ValidWindow() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(10);
		LocalDateTime endTime = now.plusMinutes(50);
		
		Reservation reservation = new Reservation("RES001", student, equipment, startTime, endTime);
		
		assertTrue(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

	@Test
	public void testIsWithinArrivalWindow_ExpiredWindow() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(25);
		LocalDateTime endTime = now.plusMinutes(35);
		
		Reservation reservation = new Reservation("RES002", student, equipment, startTime, endTime);
		
		assertFalse(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

	@Test
	public void testHandleArrivalDetected_MarkArrived() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(5);
		LocalDateTime endTime = now.plusMinutes(55);
		
		Reservation reservation = new Reservation("RES003", student, equipment, startTime, endTime);
		reservation.setStatus(BookingStatus.CONFIRMED);
		
		assertFalse(reservation.isArrived());
		
		arrivalMonitor.handleArrivalDetected("RES003");
		
	}

	@Test
	public void testMarkNoShow_AfterArrivalWindowExpires() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(25);
		LocalDateTime endTime = now.plusMinutes(35);
		
		Reservation reservation = new Reservation("RES004", student, equipment, startTime, endTime);
		reservation.setStatus(BookingStatus.CONFIRMED);
		
		assertFalse(reservation.isArrived());
		
		arrivalMonitor.markNoShow("RES004");
	}

	@Test
	public void testIsWithinArrivalWindow_AtStartTime() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now;
		LocalDateTime endTime = now.plusMinutes(60);
		
		Reservation reservation = new Reservation("RES005", student, equipment, startTime, endTime);
		
		assertTrue(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

	@Test
	public void testIsWithinArrivalWindow_BeforeStartTime() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.plusMinutes(5);
		LocalDateTime endTime = now.plusMinutes(65);
		
		Reservation reservation = new Reservation("RES006", student, equipment, startTime, endTime);
		
		assertFalse(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

	@Test
	public void testIsWithinArrivalWindow_Boundary20Minutes() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(20);
		LocalDateTime endTime = now.plusMinutes(40);
		
		Reservation reservation = new Reservation("RES007", student, equipment, startTime, endTime);
		
		assertFalse(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

	@Test
	public void testIsWithinArrivalWindow_Just19MinutesElapsed() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(19);
		LocalDateTime endTime = now.plusMinutes(41);
		
		Reservation reservation = new Reservation("RES008", student, equipment, startTime, endTime);
		
		assertTrue(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

	@Test
	public void testIsWithinArrivalWindow_21MinutesElapsed() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(21);
		LocalDateTime endTime = now.plusMinutes(39);
		
		Reservation reservation = new Reservation("RES009", student, equipment, startTime, endTime);
		
		assertFalse(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

	@Test
	public void testIsWithinArrivalWindow_WithGuestUser() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(10);
		LocalDateTime endTime = now.plusMinutes(50);
		
		Reservation reservation = new Reservation("RES010", guest, equipment, startTime, endTime);
		
		assertTrue(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

	@Test
	public void testIsWithinArrivalWindow_WithStudentUser() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(15);
		LocalDateTime endTime = now.plusMinutes(45);
		
		Reservation reservation = new Reservation("RES011", student, equipment, startTime, endTime);
		
		assertTrue(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

	@Test
	public void testIsWithinArrivalWindow_WithResearcherUser() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = now.minusMinutes(5);
		LocalDateTime endTime = now.plusMinutes(55);
		
		Reservation reservation = new Reservation("RES012", researcher, equipment, startTime, endTime);
		
		assertTrue(arrivalMonitor.isWithinArrivalWindow(reservation));
	}

}
