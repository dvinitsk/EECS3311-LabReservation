package test.ManualJUnit.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.ApprovalStatus;
import com.yorku.lab.model.*;
import com.yorku.lab.repository.ApprovalRequestRepository;
import com.yorku.lab.repository.UserRepository;

public class ApprovalRequestRepositoryTest {

	private ApprovalRequestRepository repository;
	private UserRepository userRepository;
	private User testUser;

	@Before
	public void setUp() {
		deleteFile("data/users.csv");
		deleteFile("data/approval_requests.csv");

		userRepository = new UserRepository();
		repository = new ApprovalRequestRepository();

		testUser = new Student("S001", "John Doe", new Credentials("john@york.ca", "pass123"), "STU001");
		userRepository.save(testUser);
	}

	@After
	public void tearDown() {
		deleteFile("data/approval_requests.csv");
		deleteFile("data/users.csv");
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
		ApprovalRequest request = new ApprovalRequest("AR-001", testUser);
		repository.save(request);

		assertTrue(repository.findById("AR-001").isPresent());
		assertEquals("AR-001", repository.findById("AR-001").get().getRequestId());
	}

	@Test
	public void testFindByIdNotFound() {
		assertFalse(repository.findById("NONEXISTENT").isPresent());
	}

	@Test
	public void testSaveMultipleRequests() {
		repository.save(new ApprovalRequest("AR-001", testUser));
		repository.save(new ApprovalRequest("AR-002", testUser));

		assertEquals(2, repository.findAll().size());
	}

	@Test
	public void testSaveUpdatesExisting() {
		ApprovalRequest request = new ApprovalRequest("AR-001", testUser);
		repository.save(request);

		request.approve();
		repository.save(request);

		assertEquals(1, repository.findAll().size());
		assertEquals(ApprovalStatus.APPROVED, repository.findById("AR-001").get().getStatus());
	}

	@Test
	public void testFindPending() {
		ApprovalRequest pending = new ApprovalRequest("AR-001", testUser);
		repository.save(pending);

		ApprovalRequest approved = new ApprovalRequest("AR-002", testUser);
		approved.approve();
		repository.save(approved);

		List<ApprovalRequest> pendingResults = repository.findPending();
		assertEquals(1, pendingResults.size());
		assertEquals("AR-001", pendingResults.get(0).getRequestId());
	}

	@Test
	public void testFindPendingEmpty() {
		ApprovalRequest approved = new ApprovalRequest("AR-001", testUser);
		approved.approve();
		repository.save(approved);

		assertEquals(0, repository.findPending().size());
	}

	@Test
	public void testRejectedStatusPersisted() {
		ApprovalRequest request = new ApprovalRequest("AR-001", testUser);
		request.reject("Incomplete documents");
		repository.save(request);

		ApprovalRequest loaded = repository.findById("AR-001").get();
		assertEquals(ApprovalStatus.REJECTED, loaded.getStatus());
		assertEquals("Incomplete documents", loaded.getRejectReason());
	}

	@Test
	public void testApprovedStatusPersisted() {
		ApprovalRequest request = new ApprovalRequest("AR-001", testUser);
		request.approve();
		repository.save(request);

		assertEquals(ApprovalStatus.APPROVED, repository.findById("AR-001").get().getStatus());
	}

	@Test
	public void testUserLinkedCorrectly() {
		ApprovalRequest request = new ApprovalRequest("AR-001", testUser);
		repository.save(request);

		ApprovalRequest loaded = repository.findById("AR-001").get();
		assertEquals("S001", loaded.getUser().getUserId());
		assertEquals("John Doe", loaded.getUser().getFullName());
	}
}
