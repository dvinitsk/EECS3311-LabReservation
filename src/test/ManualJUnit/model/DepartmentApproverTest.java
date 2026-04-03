package test.ManualJUnit.model;

import static org.junit.Assert.*;

import org.junit.*;
import com.yorku.lab.model.*;
import com.yorku.lab.enums.ApprovalStatus;
import com.yorku.lab.enums.AccountStatus;

public class DepartmentApproverTest {

	private DepartmentApprover approver;
	private Student student1;
	private Student student2;
	private ApprovalRequest request1;
	private ApprovalRequest request2;

	@Before
	public void setUp() {
		approver = new DepartmentApprover("APP001", "Dr. Smith", "Engineering");
		
		Credentials creds1 = new Credentials("student1@york.edu", "pass123");
		student1 = new Student("STU001", "John Doe", creds1);
		
		Credentials creds2 = new Credentials("student2@york.edu", "pass456");
		student2 = new Student("STU002", "Jane Smith", creds2);
		
		request1 = new ApprovalRequest("REQ001", student1);
		request2 = new ApprovalRequest("REQ002", student2);
	}

	@Test
	public void testConstructor() {
		assertEquals("APP001", approver.getApproverId());
		assertEquals("Dr. Smith", approver.getName());
	}

	@Test
	public void testApproveRequest() {
		approver.approve(request1);
		assertEquals(ApprovalStatus.APPROVED, request1.getStatus());
	}

	@Test
	public void testRejectRequestWithReason() {
		approver.reject(request1, "Incomplete documentation");
		assertEquals(ApprovalStatus.REJECTED, request1.getStatus());
		assertEquals("Incomplete documentation", request1.getRejectReason());
	}

	@Test
	public void testApproveChangesUserStatus() {
		approver.approve(request1);
		assertEquals(AccountStatus.ACTIVE, student1.getStatus());
	}

	@Test
	public void testRejectChangesUserStatus() {
		approver.reject(request1, "Invalid credentials");
		assertEquals(AccountStatus.REJECTED, student1.getStatus());
	}

	@Test
	public void testGetApproverId() {
		String approverId = approver.getApproverId();
		assertNotNull(approverId);
		assertTrue(approverId.contains("APP"));
	}

	@Test
	public void testGetName() {
		String name = approver.getName();
		assertNotNull(name);
		assertEquals("Dr. Smith", name);
	}

	@Test
	public void testRejectWithEmptyReason() {
		approver.reject(request1, "");
		assertEquals(ApprovalStatus.REJECTED, request1.getStatus());
		assertEquals("", request1.getRejectReason());
	}

	@Test
	public void testMultipleApprovals() {
		approver.approve(request1);
		approver.approve(request2);
		assertEquals(ApprovalStatus.APPROVED, request1.getStatus());
		assertEquals(ApprovalStatus.APPROVED, request2.getStatus());
		assertEquals(AccountStatus.ACTIVE, student1.getStatus());
		assertEquals(AccountStatus.ACTIVE, student2.getStatus());
	}

	@Test
	public void testMultipleRejections() {
		approver.reject(request1, "Reason 1");
		approver.reject(request2, "Reason 2");
		assertEquals(ApprovalStatus.REJECTED, request1.getStatus());
		assertEquals(ApprovalStatus.REJECTED, request2.getStatus());
		assertEquals("Reason 1", request1.getRejectReason());
		assertEquals("Reason 2", request2.getRejectReason());
	}

}
