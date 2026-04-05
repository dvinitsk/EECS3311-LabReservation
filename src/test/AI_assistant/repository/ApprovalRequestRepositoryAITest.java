package test.AI_assistant.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.ApprovalStatus;
import com.yorku.lab.model.ApprovalRequest;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.User;
import com.yorku.lab.repository.ApprovalRequestRepository;
import com.yorku.lab.repository.UserRepository;

public class ApprovalRequestRepositoryAITest {

    private ApprovalRequestRepository repository;
    private UserRepository userRepository;
    private User user;

    @Before
    public void setUp() {
        repository = new ApprovalRequestRepository();
        userRepository = new UserRepository();
        user = new Student("AR-U1", "Approval User", new Credentials("approval@yorku.ca", "Pass123!"), "CERT-1");
        userRepository.save(user);
    }

    @After
    public void tearDown() throws Exception {
        deleteIfExists("data/approval_requests.csv");
        deleteIfExists("data/users.csv");
    }

    private void deleteIfExists(String file) throws Exception {
        Path path = Paths.get(file);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    @Test
    public void testSaveAndFindById() {
        ApprovalRequest request = new ApprovalRequest("AR-1", user);
        repository.save(request);

        Optional<ApprovalRequest> found = repository.findById("AR-1");
        assertTrue(found.isPresent());
    }

    @Test
    public void testFindByIdMissingReturnsEmpty() {
        assertTrue(repository.findById("missing").isEmpty());
    }

    @Test
    public void testFindPendingReturnsSavedPendingRequest() {
        repository.save(new ApprovalRequest("AR-2", user));
        assertEquals(1, repository.findPending().size());
    }

    @Test
    public void testApprovedRequestIsNotPending() {
        ApprovalRequest request = new ApprovalRequest("AR-3", user);
        request.approve();
        repository.save(request);

        assertEquals(0, repository.findPending().size());
    }

    @Test
    public void testRejectedRequestIsNotPending() {
        ApprovalRequest request = new ApprovalRequest("AR-4", user);
        request.reject("No documents");
        repository.save(request);

        assertEquals(0, repository.findPending().size());
    }

    @Test
    public void testRejectReasonIsPreserved() {
        ApprovalRequest request = new ApprovalRequest("AR-5", user);
        request.reject("No documents");
        repository.save(request);

        Optional<ApprovalRequest> found = repository.findById("AR-5");
        assertTrue(found.isPresent());
        assertEquals("No documents", found.get().getRejectReason());
    }

    @Test
    public void testSaveUpdatesExistingRequest() {
        ApprovalRequest request = new ApprovalRequest("AR-6", user);
        repository.save(request);
        request.setStatus(ApprovalStatus.APPROVED);
        repository.save(request);

        List<ApprovalRequest> all = repository.findAll();
        assertEquals(1, all.size());
        assertEquals(ApprovalStatus.APPROVED, all.get(0).getStatus());
    }

    @Test
    public void testFindAllReturnsMultipleRequests() {
        repository.save(new ApprovalRequest("AR-7", user));
        repository.save(new ApprovalRequest("AR-8", user));

        assertEquals(2, repository.findAll().size());
    }

    @Test
    public void testFindByIdReturnsCorrectRequestId() {
        repository.save(new ApprovalRequest("AR-9", user));
        Optional<ApprovalRequest> found = repository.findById("AR-9");
        assertTrue(found.isPresent());
        assertEquals("AR-9", found.get().getRequestId());
    }

    @Test
    public void testFindPendingReturnsOnlyPendingOnes() {
        ApprovalRequest pending = new ApprovalRequest("AR-10", user);
        ApprovalRequest rejected = new ApprovalRequest("AR-11", user);
        rejected.reject("Rejected");
        repository.save(pending);
        repository.save(rejected);

        assertEquals(1, repository.findPending().size());
        assertEquals("AR-10", repository.findPending().get(0).getRequestId());
    }
}
