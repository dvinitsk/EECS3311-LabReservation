package test.ManualJUnit.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentStatus;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.repository.PaymentRepository;

public class PaymentRepositoryTest {

	private PaymentRepository repository;

	@Before
	public void setUp() {
		deleteFile("data/payments.csv");
		repository = new PaymentRepository();
	}

	@After
	public void tearDown() {
		deleteFile("data/payments.csv");
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

	@Test
	public void testFindAllEmptyInitially() {
		assertEquals(0, repository.findAll().size());
	}

	@Test
	public void testSaveAndFindById() {
		PaymentTransaction payment = new PaymentTransaction("PAY-001", 50.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT);
		repository.save(payment);

		assertTrue(repository.findById("PAY-001").isPresent());
		assertEquals(50.0, repository.findById("PAY-001").get().getAmount(), 0.001);
	}

	@Test
	public void testFindByIdNotFound() {
		assertFalse(repository.findById("NONEXISTENT").isPresent());
	}

	@Test
	public void testSaveMultiplePayments() {
		repository.save(new PaymentTransaction("PAY-001", 50.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT));
		repository.save(new PaymentTransaction("PAY-002", 75.0, PaymentType.DEPOSIT, PaymentMethod.DEBIT));

		assertEquals(2, repository.findAll().size());
	}

	@Test
	public void testSaveUpdatesExisting() {
		PaymentTransaction payment = new PaymentTransaction("PAY-001", 50.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT);
		repository.save(payment);

		payment.setStatus(PaymentStatus.REFUNDED);
		repository.save(payment);

		assertEquals(1, repository.findAll().size());
		assertEquals(PaymentStatus.REFUNDED, repository.findById("PAY-001").get().getStatus());
	}

	@Test
	public void testPaymentWithReservationId() {
		PaymentTransaction payment = new PaymentTransaction("PAY-001", 50.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-001");
		repository.save(payment);

		assertEquals("RES-001", repository.findById("PAY-001").get().getReservationId());
	}

	@Test
	public void testFindByReservationIds() {
		repository.save(new PaymentTransaction("PAY-001", 50.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-001"));
		repository.save(new PaymentTransaction("PAY-002", 75.0, PaymentType.DEPOSIT, PaymentMethod.DEBIT, "RES-002"));
		repository.save(new PaymentTransaction("PAY-003", 30.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-003"));

		List<PaymentTransaction> results = repository.findByReservationIds(Set.of("RES-001", "RES-003"));
		assertEquals(2, results.size());
	}

	@Test
	public void testFindByReservationIdsNoMatch() {
		repository.save(new PaymentTransaction("PAY-001", 50.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-001"));

		List<PaymentTransaction> results = repository.findByReservationIds(Set.of("RES-999"));
		assertEquals(0, results.size());
	}

	@Test
	public void testPaymentTypePersisted() {
		PaymentTransaction payment = new PaymentTransaction("PAY-001", 50.0, PaymentType.REFUND, PaymentMethod.CREDIT);
		repository.save(payment);

		assertEquals(PaymentType.REFUND, repository.findById("PAY-001").get().getType());
	}

	@Test
	public void testPaymentMethodPersisted() {
		PaymentTransaction payment = new PaymentTransaction("PAY-001", 50.0, PaymentType.DEPOSIT, PaymentMethod.INSTITUTIONAL);
		repository.save(payment);

		assertEquals(PaymentMethod.INSTITUTIONAL, repository.findById("PAY-001").get().getMethod());
	}
}
