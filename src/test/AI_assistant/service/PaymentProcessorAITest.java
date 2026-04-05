package test.AI_assistant.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentStatus;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.pattern.strategy.PaymentStrategy;
import com.yorku.lab.service.PaymentProcessor;

public class PaymentProcessorAITest {

	private PaymentProcessor paymentProcessor;

	@Before
	public void setUp() throws Exception {
		paymentProcessor = new PaymentProcessor();
	}

	@After
	public void tearDown() throws Exception {
		java.nio.file.Path path = java.nio.file.Paths.get("data/payments.csv");
		if (java.nio.file.Files.exists(path)) {
			java.nio.file.Files.delete(path);
		}
	}

	@Test
	public void testSetPaymentStrategySucceeds() {
		assertNotNull(paymentProcessor);
		PaymentStrategy strategy = new PaymentStrategy() {
			@Override
			public PaymentTransaction pay(double amount) {
				return new PaymentTransaction("TX-001", amount, PaymentType.DEPOSIT, PaymentMethod.CREDIT);
			}
		};
		paymentProcessor.setPaymentStrategy(strategy);
	}

	@Test
	public void testProcessPaymentWithStrategySucceeds() {
		PaymentTransaction expectedTx = new PaymentTransaction("TX-001", 100.0,
			PaymentType.DEPOSIT, PaymentMethod.CREDIT);

		PaymentStrategy strategy = new PaymentStrategy() {
			@Override
			public PaymentTransaction pay(double amount) {
				return expectedTx;
			}
		};

		paymentProcessor.setPaymentStrategy(strategy);
		PaymentTransaction result = paymentProcessor.processPayment(100.0);

		assertNotNull(result);
		assertEquals("TX-001", result.getTransactionId());
		assertEquals(100.0, result.getAmount(), 0.01);
		assertEquals(PaymentType.DEPOSIT, result.getType());
		assertEquals(PaymentMethod.CREDIT, result.getMethod());
	}

	@Test
	public void testSaveTransactionSucceeds() {
		PaymentTransaction tx = new PaymentTransaction("TX-002", 50.0,
			PaymentType.DEPOSIT, PaymentMethod.DEBIT);
		paymentProcessor.saveTransaction(tx);

		Optional<PaymentTransaction> retrieved = paymentProcessor.getTransaction("TX-002");
		assertTrue(retrieved.isPresent());
		assertEquals("TX-002", retrieved.get().getTransactionId());
	}

	@Test
	public void testGetTransactionSucceeds() {
		PaymentTransaction tx = new PaymentTransaction("TX-003", 75.0,
			PaymentType.FINAL_CHARGE, PaymentMethod.INSTITUTIONAL);
		paymentProcessor.saveTransaction(tx);

		Optional<PaymentTransaction> result = paymentProcessor.getTransaction("TX-003");
		assertTrue(result.isPresent());
		assertEquals("TX-003", result.get().getTransactionId());
		assertEquals(75.0, result.get().getAmount(), 0.01);
	}

	@Test
	public void testGetTransactionFailsWhenNotFound() {
		Optional<PaymentTransaction> result = paymentProcessor.getTransaction("TX-NONEXISTENT");
		assertFalse(result.isPresent());
	}

	@Test
	public void testSaveMultipleTransactionsSucceeds() {
		PaymentTransaction tx1 = new PaymentTransaction("TX-004", 100.0,
			PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-001");
		PaymentTransaction tx2 = new PaymentTransaction("TX-005", 50.0,
			PaymentType.REFUND, PaymentMethod.DEBIT, "RES-002");
		PaymentTransaction tx3 = new PaymentTransaction("TX-006", 200.0,
			PaymentType.FINAL_CHARGE, PaymentMethod.GRANTS, "RES-003");

		paymentProcessor.saveTransaction(tx1);
		paymentProcessor.saveTransaction(tx2);
		paymentProcessor.saveTransaction(tx3);

		Optional<PaymentTransaction> result1 = paymentProcessor.getTransaction("TX-004");
		Optional<PaymentTransaction> result2 = paymentProcessor.getTransaction("TX-005");
		Optional<PaymentTransaction> result3 = paymentProcessor.getTransaction("TX-006");

		assertTrue(result1.isPresent());
		assertTrue(result2.isPresent());
		assertTrue(result3.isPresent());
	}

	@Test
	public void testGetPaymentsForReservationsSucceeds() {
		PaymentTransaction tx1 = new PaymentTransaction("TX-007", 100.0,
			PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-010");
		PaymentTransaction tx2 = new PaymentTransaction("TX-008", 150.0,
			PaymentType.DEPOSIT, PaymentMethod.DEBIT, "RES-011");
		PaymentTransaction tx3 = new PaymentTransaction("TX-009", 200.0,
			PaymentType.FINAL_CHARGE, PaymentMethod.INSTITUTIONAL, "RES-012");

		paymentProcessor.saveTransaction(tx1);
		paymentProcessor.saveTransaction(tx2);
		paymentProcessor.saveTransaction(tx3);

		List<String> reservationIds = Arrays.asList("RES-010", "RES-011");
		List<PaymentTransaction> result = paymentProcessor.getPaymentsForReservations(reservationIds);

		assertEquals(2, result.size());
	}

	@Test
	public void testGetPaymentsForReservationsEmptyListWhenNoMatches() {
		PaymentTransaction tx1 = new PaymentTransaction("TX-010", 100.0,
			PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-020");

		paymentProcessor.saveTransaction(tx1);

		List<String> reservationIds = Arrays.asList("RES-999", "RES-998");
		List<PaymentTransaction> result = paymentProcessor.getPaymentsForReservations(reservationIds);

		assertEquals(0, result.size());
	}

	@Test
	public void testGetPaymentsForReservationsWithPartialMatches() {
		PaymentTransaction tx1 = new PaymentTransaction("TX-011", 50.0,
			PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-030");
		PaymentTransaction tx2 = new PaymentTransaction("TX-012", 75.0,
			PaymentType.REFUND, PaymentMethod.DEBIT, "RES-031");
		PaymentTransaction tx3 = new PaymentTransaction("TX-013", 100.0,
			PaymentType.FINAL_CHARGE, PaymentMethod.GRANTS, "RES-032");

		paymentProcessor.saveTransaction(tx1);
		paymentProcessor.saveTransaction(tx2);
		paymentProcessor.saveTransaction(tx3);

		List<String> reservationIds = Arrays.asList("RES-030", "RES-999", "RES-031");
		List<PaymentTransaction> result = paymentProcessor.getPaymentsForReservations(reservationIds);

		assertEquals(2, result.size());
	}

	@Test
	public void testTransactionPreservesAllProperties() {
		PaymentTransaction tx = new PaymentTransaction("TX-014", 99.99,
			PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-040");
		tx.setStatus(PaymentStatus.AUTHORIZED);

		paymentProcessor.saveTransaction(tx);
		Optional<PaymentTransaction> retrieved = paymentProcessor.getTransaction("TX-014");

		assertTrue(retrieved.isPresent());
		assertEquals("TX-014", retrieved.get().getTransactionId());
		assertEquals(99.99, retrieved.get().getAmount(), 0.01);
		assertEquals(PaymentType.DEPOSIT, retrieved.get().getType());
		assertEquals(PaymentMethod.CREDIT, retrieved.get().getMethod());
		assertEquals(PaymentStatus.AUTHORIZED, retrieved.get().getStatus());
		assertEquals("RES-040", retrieved.get().getReservationId());
	}

	@Test
	public void testProcessPaymentWithMultipleStrategySwitches() {
		PaymentTransaction tx1 = new PaymentTransaction("TX-015", 50.0,
			PaymentType.DEPOSIT, PaymentMethod.CREDIT);
		PaymentTransaction tx2 = new PaymentTransaction("TX-016", 75.0,
			PaymentType.FINAL_CHARGE, PaymentMethod.DEBIT);

		PaymentStrategy strategy1 = new PaymentStrategy() {
			@Override
			public PaymentTransaction pay(double amount) {
				return tx1;
			}
		};

		PaymentStrategy strategy2 = new PaymentStrategy() {
			@Override
			public PaymentTransaction pay(double amount) {
				return tx2;
			}
		};

		paymentProcessor.setPaymentStrategy(strategy1);
		PaymentTransaction result1 = paymentProcessor.processPayment(50.0);

		paymentProcessor.setPaymentStrategy(strategy2);
		PaymentTransaction result2 = paymentProcessor.processPayment(75.0);

		assertEquals("TX-015", result1.getTransactionId());
		assertEquals("TX-016", result2.getTransactionId());
	}

	@Test
	public void testGetPaymentsForReservationsWithNullReservationId() {
		PaymentTransaction tx1 = new PaymentTransaction("TX-017", 100.0,
			PaymentType.DEPOSIT, PaymentMethod.CREDIT);
		PaymentTransaction tx2 = new PaymentTransaction("TX-018", 50.0,
			PaymentType.REFUND, PaymentMethod.DEBIT, "RES-050");

		paymentProcessor.saveTransaction(tx1);
		paymentProcessor.saveTransaction(tx2);

		List<String> reservationIds = Arrays.asList("RES-050");
		List<PaymentTransaction> result = paymentProcessor.getPaymentsForReservations(reservationIds);

		assertEquals(1, result.size());
		assertEquals("TX-018", result.get(0).getTransactionId());
	}

	@Test
	public void testSaveAndUpdateTransactionWithDifferentStatus() {
		PaymentTransaction tx = new PaymentTransaction("TX-019", 150.0,
			PaymentType.DEPOSIT, PaymentMethod.INSTITUTIONAL, "RES-060");
		tx.setStatus(PaymentStatus.AUTHORIZED);
		paymentProcessor.saveTransaction(tx);

		Optional<PaymentTransaction> retrieved = paymentProcessor.getTransaction("TX-019");
		assertTrue(retrieved.isPresent());
		assertEquals(PaymentStatus.AUTHORIZED, retrieved.get().getStatus());

		PaymentTransaction updated = new PaymentTransaction("TX-019", 150.0,
			PaymentType.DEPOSIT, PaymentMethod.INSTITUTIONAL, "RES-060");
		updated.setStatus(PaymentStatus.REFUNDED);
		paymentProcessor.saveTransaction(updated);

		Optional<PaymentTransaction> updatedRetrieved = paymentProcessor.getTransaction("TX-019");
		assertTrue(updatedRetrieved.isPresent());
		assertEquals(PaymentStatus.REFUNDED, updatedRetrieved.get().getStatus());
	}

	@Test
	public void testProcessPaymentWithDifferentAmounts() {
		PaymentStrategy strategy = new PaymentStrategy() {
			@Override
			public PaymentTransaction pay(double amount) {
				return new PaymentTransaction("TX-" + System.nanoTime(), amount,
					PaymentType.FINAL_CHARGE, PaymentMethod.GRANTS);
			}
		};

		paymentProcessor.setPaymentStrategy(strategy);
		PaymentTransaction result1 = paymentProcessor.processPayment(50.25);
		PaymentTransaction result2 = paymentProcessor.processPayment(100.75);
		PaymentTransaction result3 = paymentProcessor.processPayment(999.99);

		assertEquals(50.25, result1.getAmount(), 0.01);
		assertEquals(100.75, result2.getAmount(), 0.01);
		assertEquals(999.99, result3.getAmount(), 0.01);
	}

}
