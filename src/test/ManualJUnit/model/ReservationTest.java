package test.ManualJUnit.model;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.model.*;

public class ReservationTest {

	private Student student;
	private Reservation reservation;
	LocalDateTime ldt;
	
	@Before
	public void test() {
		Credentials creds1 = new Credentials("student1@york.edu", "pass123");
		student = new Student("STU001", "John Doe", creds1);
		Equipment equipment = new Equipment("EQU001", "DES001", "LOC001");
		ldt = LocalDateTime.of(2026, 4, 2, 10, 30, 0);
		LocalDateTime ldtEnd = LocalDateTime.of(2026, 4, 2, 11, 30, 0);
		
		reservation = new Reservation("RES001", student, equipment, ldt, ldtEnd);
	}
	
	@Test
	public void testModify() {
		assertEquals(ldt, reservation.getStartTime());
		LocalDateTime ldt2 = LocalDateTime.of(2026, 4, 2, 3, 30, 0);
		LocalDateTime ldtEnd2 = LocalDateTime.of(2026, 4, 2, 4, 30, 0);
		reservation.modify(ldt2, ldtEnd2);
		assertEquals(ldt2, reservation.getStartTime());
		assertEquals(ldtEnd2, reservation.getEndTime());
		assertEquals(BookingStatus.MODIFIED,reservation.getStatus());
	}
	
	@Test
	public void testCancel() {
		assertEquals(BookingStatus.CONFIRMED, reservation.getStatus());
		reservation.cancel();
		assertEquals(BookingStatus.CANCELLED, reservation.getStatus());
	}
	
	@Test
	public void testCancelNonExistingReservation() {
		reservation.cancel();
		assertEquals(BookingStatus.CANCELLED, reservation.getStatus());
		reservation.cancel();
		assertEquals(BookingStatus.CANCELLED, reservation.getStatus());
	}
	
	@Test
	public void testArrived() {
		assertEquals(false, reservation.isArrived());
		reservation.markArrived();
		assertEquals(true, reservation.isArrived());
		assertEquals(BookingStatus.ARRIVED, reservation.getStatus());
	}
	
	@Test
	public void testNoShow() {
		assertEquals(false, reservation.isArrived());
		reservation.markNoShow();
		assertEquals(false, reservation.isArrived());
		assertEquals(BookingStatus.NO_SHOW, reservation.getStatus());
	}
	
	@Test
	public void testExtend() {
		reservation.markArrived();
		LocalDateTime originalEnd = reservation.getEndTime();
		LocalDateTime extendedEnd = LocalDateTime.of(2026, 4, 2, 12, 30, 0);
		reservation.extend(extendedEnd);
		assertEquals(extendedEnd, reservation.getEndTime());
		assertEquals(BookingStatus.EXTENDED, reservation.getStatus());
	}
	
	@Test
	public void testCompleted() {
		reservation.markArrived();
		reservation.complete();
		assertEquals(BookingStatus.COMPLETED, reservation.getStatus());
	}
	
	@Test
	public void testPayments() {
		assertEquals(0, reservation.getPayments().size());
		
		PaymentTransaction payment1 = new PaymentTransaction("PAY001", 50.0, 
			com.yorku.lab.enums.PaymentType.DEPOSIT, 
			com.yorku.lab.enums.PaymentMethod.CREDIT, "RES001");
		reservation.addPayment(payment1);
		assertEquals(1, reservation.getPayments().size());
		assertEquals(50.0, reservation.getPayments().get(0).getAmount(), 0.01);
		
		PaymentTransaction payment2 = new PaymentTransaction("PAY002", 30.0, 
			com.yorku.lab.enums.PaymentType.DEPOSIT, 
			com.yorku.lab.enums.PaymentMethod.DEBIT, "RES001");
		reservation.addPayment(payment2);
		assertEquals(2, reservation.getPayments().size());
		assertEquals(30.0, reservation.getPayments().get(1).getAmount(), 0.01);
	}
	
	@Test
	public void testMultipleModified() {
		LocalDateTime ldt2 = LocalDateTime.of(2026, 4, 2, 3, 30, 0);
		LocalDateTime ldtEnd2 = LocalDateTime.of(2026, 4, 2, 4, 30, 0);
		reservation.modify(ldt2, ldtEnd2);
		assertEquals(BookingStatus.MODIFIED, reservation.getStatus());
		
		LocalDateTime ldt3 = LocalDateTime.of(2026, 4, 2, 5, 30, 0);
		LocalDateTime ldtEnd3 = LocalDateTime.of(2026, 4, 2, 6, 30, 0);
		reservation.modify(ldt3, ldtEnd3);
		assertEquals(ldt3, reservation.getStartTime());
		assertEquals(ldtEnd3, reservation.getEndTime());
		assertEquals(BookingStatus.MODIFIED, reservation.getStatus());
	}
	
	@Test
	public void testMultipleExtend() {
		reservation.markArrived();
		LocalDateTime extendedEnd1 = LocalDateTime.of(2026, 4, 2, 12, 30, 0);
		reservation.extend(extendedEnd1);
		assertEquals(extendedEnd1, reservation.getEndTime());
		assertEquals(BookingStatus.EXTENDED, reservation.getStatus());
		
		LocalDateTime extendedEnd2 = LocalDateTime.of(2026, 4, 2, 13, 30, 0);
		reservation.extend(extendedEnd2);
		assertEquals(extendedEnd2, reservation.getEndTime());
		assertEquals(BookingStatus.EXTENDED, reservation.getStatus());
	}

}
