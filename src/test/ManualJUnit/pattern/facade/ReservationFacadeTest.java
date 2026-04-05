package test.ManualJUnit.pattern.facade;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.facade.ReservationFacade;

public class ReservationFacadeTest {

	private ReservationFacade facade;

	@Before
	public void setUp() {
		facade = new ReservationFacade();
	}

	@Test
	public void testBrowseEquipmentNotNull() {
		List<Equipment> equipment = facade.browseEquipment();
		assertNotNull(equipment);
	}

	@Test
	public void testFindAvailableEquipmentNotNull() {
		List<Equipment> available = facade.findAvailableEquipment();
		assertNotNull(available);
	}

	@Test
	public void testLoginInvalidCredentialsEmpty() {
		Optional<User> user = facade.login("invalid@test.com", "wrongpass");
		assertFalse(user.isPresent());
	}

	@Test
	public void testGetPendingApprovalsNotNull() {
		List<com.yorku.lab.model.ApprovalRequest> pending = facade.getPendingApprovals();
		assertNotNull(pending);
	}

	@Test
	public void testGetDepositAmountNonNegative() {
		facade.registerUser("student1@test.com", "pass123", "Test Student", UserType.STUDENT, "999999");
		Optional<User> user = facade.login("student1@test.com", "pass123");
		if (user.isPresent()) {
			double deposit = facade.getDepositAmount(user.get());
			assertTrue(deposit >= 0);
		}
	}

	@Test
	public void testGetHourlyRatePositive() {
		facade.registerUser("faculty1@test.com", "pass123", "Test Faculty", UserType.FACULTY, "888888");
		Optional<User> user = facade.login("faculty1@test.com", "pass123");
		if (user.isPresent()) {
			double rate = facade.getHourlyRate(user.get());
			assertTrue(rate > 0);
		}
	}

	@Test
	public void testGetUserReservationsNotNull() {
		List<Reservation> reservations = facade.getUserReservations("testuser1");
		assertNotNull(reservations);
	}

	@Test
	public void testGetTotalPaidByUserNonNegative() {
		double total = facade.getTotalPaidByUser("testuser2");
		assertTrue(total >= 0);
	}

	@Test
	public void testGetPaymentsForUserNotNull() {
		List<com.yorku.lab.model.PaymentTransaction> payments = facade.getPaymentsForUser("testuser3");
		assertNotNull(payments);
	}

	@Test
	public void testFormatSlotNotNull() {
		LocalDateTime dt = LocalDateTime.of(2026, 4, 5, 14, 30);
		String formatted = ReservationFacade.formatSlot(dt);
		assertNotNull(formatted);
	}

}
