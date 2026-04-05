package test.AI_assistant.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentStatus;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.repository.PaymentRepository;

public class PaymentRepositoryAITest {

    private PaymentRepository repository;

    @Before
    public void setUp() {
        repository = new PaymentRepository();
    }

    @After
    public void tearDown() throws Exception {
        deleteIfExists("data/payments.csv");
    }

    private void deleteIfExists(String file) throws Exception {
        Path path = Paths.get(file);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    @Test
    public void testSaveAndFindById() {
        repository.save(new PaymentTransaction("PAY-A1", 50.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT));
        assertTrue(repository.findById("PAY-A1").isPresent());
    }

    @Test
    public void testFindByIdMissingReturnsEmpty() {
        assertTrue(repository.findById("missing").isEmpty());
    }

    @Test
    public void testReservationIdIsPreserved() {
        repository.save(new PaymentTransaction("PAY-A2", 60.0, PaymentType.DEPOSIT, PaymentMethod.DEBIT, "RES-1"));
        assertEquals("RES-1", repository.findById("PAY-A2").get().getReservationId());
    }

    @Test
    public void testNullReservationIdRemainsNull() {
        repository.save(new PaymentTransaction("PAY-A3", 70.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT));
        assertNull(repository.findById("PAY-A3").get().getReservationId());
    }

    @Test
    public void testFindByReservationIdsReturnsMatchingPayment() {
        repository.save(new PaymentTransaction("PAY-A4", 80.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-2"));
        assertEquals(1, repository.findByReservationIds(Set.of("RES-2")).size());
    }

    @Test
    public void testFindByReservationIdsReturnsMultipleMatches() {
        repository.save(new PaymentTransaction("PAY-A5", 90.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-3"));
        repository.save(new PaymentTransaction("PAY-A6", 20.0, PaymentType.FINAL_CHARGE, PaymentMethod.DEBIT, "RES-4"));
        assertEquals(2, repository.findByReservationIds(Set.of("RES-3", "RES-4")).size());
    }

    @Test
    public void testFindByReservationIdsIgnoresNullReservationId() {
        repository.save(new PaymentTransaction("PAY-A7", 40.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT));
        assertEquals(0, repository.findByReservationIds(Set.of("RES-5")).size());
    }

    @Test
    public void testSaveUpdatesExistingPaymentStatus() {
        PaymentTransaction payment = new PaymentTransaction("PAY-A8", 100.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT, "RES-6");
        repository.save(payment);
        payment.setStatus(PaymentStatus.REFUNDED);
        repository.save(payment);
        assertEquals(PaymentStatus.REFUNDED, repository.findById("PAY-A8").get().getStatus());
    }

    @Test
    public void testFindAllReturnsSavedPayments() {
        repository.save(new PaymentTransaction("PAY-A9", 10.0, PaymentType.DEPOSIT, PaymentMethod.CREDIT));
        repository.save(new PaymentTransaction("PAY-A10", 20.0, PaymentType.REFUND, PaymentMethod.DEBIT));
        assertEquals(2, repository.findAll().size());
    }

    @Test
    public void testLargeAmountIsPreserved() {
        repository.save(new PaymentTransaction("PAY-A11", 5000.75, PaymentType.FINAL_CHARGE, PaymentMethod.GRANTS, "RES-7"));
        assertEquals(5000.75, repository.findById("PAY-A11").get().getAmount(), 0.01);
    }
}
