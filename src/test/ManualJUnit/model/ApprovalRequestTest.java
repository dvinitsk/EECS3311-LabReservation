package test.ManualJUnit.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.ApprovalStatus;
import com.yorku.lab.model.*;

public class ApprovalRequestTest {

	ApprovalRequest request;
	
	@Before
	public void test() {
		User a=new Student("Id123","John Doe",new Credentials("a@email.com", "Pass123"),"Cert123");
		request = new ApprovalRequest("1234", a);
	}
	
	@Test
	public void testApproveTrue() {
		assertEquals(ApprovalStatus.PENDING, request.getStatus());
		request.approve();
		assertEquals(ApprovalStatus.APPROVED, request.getStatus());
	}
	
	@Test
	public void testApproveFalse() {
		assertEquals(ApprovalStatus.PENDING, request.getStatus());
		request.reject("Rejected");
		assertEquals(ApprovalStatus.REJECTED, request.getStatus());
	}
	
	@Test
	public void testApproveFalseReason() {
		assertEquals(ApprovalStatus.PENDING, request.getStatus());
		request.reject("Rejected");
		assertEquals(ApprovalStatus.REJECTED, request.getStatus());
		assertEquals("Rejected", request.getRejectReason());
	}
	
	@Test
	public void testChangeReason() {
		request.reject("Rejected");
		assertEquals("Rejected", request.getRejectReason());
		request.setRejectReason("Rejected unknown");
		assertEquals("Rejected unknown", request.getRejectReason());
	}
	
	@Test
	public void testGetRequestID() {
		assertEquals("1234", request.getRequestId());
	}
	
	@Test
	public void testGetUser() {
		assertEquals("Id123", request.getUser().getUserId());
		assertEquals("John Doe", request.getUser().getFullName());
		assertEquals("a@email.com", request.getUser().getCredentials().getEmail());
		assertEquals("Pass123", request.getUser().getCredentials().getPasswordHash());
		assertEquals("Cert123", request.getUser().getIdOrCertificationNumber());
	}
	
	@Test
	public void testApproveDoesNotSetRejectReason() {
		request.approve();
		assertNull(request.getRejectReason());
		assertEquals(ApprovalStatus.APPROVED, request.getStatus());
	}
	
	@Test
	public void testRejectMultipleTimes() {
		request.reject("First rejection reason");
		assertEquals("First rejection reason", request.getRejectReason());
		request.reject("Second rejection reason");
		assertEquals("Second rejection reason", request.getRejectReason());
	}
	
	@Test
	public void testApproveMultipleTimes() {
		request.approve();
		assertEquals(ApprovalStatus.APPROVED, request.getStatus());
		request.approve();
		assertEquals(ApprovalStatus.APPROVED, request.getStatus());
	}
	
	@Test
	public void testInitialState() {
		ApprovalRequest newRequest = new ApprovalRequest("5678", request.getUser());
		assertEquals(ApprovalStatus.PENDING, newRequest.getStatus());
		assertNull(newRequest.getRejectReason());
		assertEquals("5678", newRequest.getRequestId());
	}
	
	@Test
	public void testApprovalAfterRejection() {
		request.reject("Initial rejection");
		assertEquals(ApprovalStatus.REJECTED, request.getStatus());
		assertEquals("Initial rejection", request.getRejectReason());
		request.approve();
		assertEquals(ApprovalStatus.APPROVED, request.getStatus());
		assertNull(request.getRejectReason());
	}
	
	@Test
	public void testRejectAfterApproval() {
		request.approve();
		assertEquals(ApprovalStatus.APPROVED, request.getStatus());
		request.reject("Rejected after approval");
		assertEquals(ApprovalStatus.REJECTED, request.getStatus());
		assertEquals("Rejected after approval", request.getRejectReason());
	}
	
	@Test
	public void testStatusTransitionsWithMultipleOperations() {
		assertEquals(ApprovalStatus.PENDING, request.getStatus());
		request.reject("First rejection");
		assertEquals(ApprovalStatus.REJECTED, request.getStatus());
		request.setRejectReason("Updated reason");
		assertEquals("Updated reason", request.getRejectReason());
		request.approve();
		assertEquals(ApprovalStatus.APPROVED, request.getStatus());
		assertNull(request.getRejectReason());
	}
	

}
