package test.AI_assistant.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.ApprovalRequest;
import com.yorku.lab.model.User;
import com.yorku.lab.service.RegistrationService;
import com.yorku.lab.service.RegistrationService.RegistrationResult;

public class RegistrationServiceAITest {

	private RegistrationService registrationService;

	@Before
	public void setUp() throws Exception {
		registrationService = new RegistrationService();
	}

	@After
	public void tearDown() throws Exception {
		java.nio.file.Path userPath = java.nio.file.Paths.get("data/users.csv");
		if (java.nio.file.Files.exists(userPath)) {
			java.nio.file.Files.delete(userPath);
		}
		java.nio.file.Path approvalPath = java.nio.file.Paths.get("data/approval_requests.csv");
		if (java.nio.file.Files.exists(approvalPath)) {
			java.nio.file.Files.delete(approvalPath);
		}
	}

	@Test
	public void testRegisterGuestUserSucceeds() {
		RegistrationResult result = registrationService.registerUser("guest@example.com", "Password123!",
			"John Guest", UserType.GUEST, "GUEST001");

		assertTrue(result.success());
		assertNotNull(result.user());
		assertEquals("John Guest", result.user().getFullName());
		assertEquals(AccountStatus.ACTIVE, result.user().getStatus());
	}

	@Test
	public void testRegisterStudentUserPendingApproval() {
		RegistrationResult result = registrationService.registerUser("student@york.ca", "Secure123!",
			"Jane Student", UserType.STUDENT, "STU12345");

		assertTrue(result.success());
		assertNull(result.user());
		assertTrue(result.message().contains("Pending"));
	}

	@Test
	public void testRegisterWithDuplicateEmailFails() {
		registrationService.registerUser("test@example.com", "Password123!", "User One", UserType.GUEST, "G001");
		RegistrationResult result = registrationService.registerUser("test@example.com", "Password456!",
			"User Two", UserType.GUEST, "G002");

		assertFalse(result.success());
		assertTrue(result.message().contains("Email already in use"));
	}

	@Test
	public void testRegisterWithWeakPasswordFails() {
		RegistrationResult result = registrationService.registerUser("weak@example.com", "weak",
			"Weak User", UserType.GUEST, "G001");

		assertFalse(result.success());
		assertTrue(result.message().contains("Password"));
	}

	@Test
	public void testRegisterWithPasswordNoUppercaseFails() {
		RegistrationResult result = registrationService.registerUser("upper@example.com", "password123!",
			"Test User", UserType.GUEST, "G001");

		assertFalse(result.success());
	}

	@Test
	public void testRegisterWithPasswordNoLowercaseFails() {
		RegistrationResult result = registrationService.registerUser("lower@example.com", "PASSWORD123!",
			"Test User", UserType.GUEST, "G001");

		assertFalse(result.success());
	}

	@Test
	public void testRegisterWithPasswordNoNumberFails() {
		RegistrationResult result = registrationService.registerUser("number@example.com", "Password!",
			"Test User", UserType.GUEST, "G001");

		assertFalse(result.success());
	}

	@Test
	public void testRegisterWithPasswordNoSymbolFails() {
		RegistrationResult result = registrationService.registerUser("symbol@example.com", "Password123",
			"Test User", UserType.GUEST, "G001");

		assertFalse(result.success());
	}

	@Test
	public void testFindUserByEmailSucceeds() {
		registrationService.registerUser("findme@example.com", "Password123!", "Find Me",
			UserType.GUEST, "G001");

		Optional<User> result = registrationService.findByEmail("findme@example.com");
		assertTrue(result.isPresent());
		assertEquals("Find Me", result.get().getFullName());
	}

	@Test
	public void testFindUserByEmailNotFound() {
		Optional<User> result = registrationService.findByEmail("notfound@example.com");
		assertFalse(result.isPresent());
	}

	@Test
	public void testIsPasswordStrongValidates() {
		assertTrue(registrationService.isPasswordStrong("StrongPass123!"));
		assertTrue(registrationService.isPasswordStrong("ValidPassword1@"));
		assertFalse(registrationService.isPasswordStrong("weak"));
		assertFalse(registrationService.isPasswordStrong("NoNumber!"));
		assertFalse(registrationService.isPasswordStrong(null));
	}

	@Test
	public void testGetPendingApprovalsReturnsUniversityUsers() {
		registrationService.registerUser("student1@york.ca", "Password123!", "Student One",
			UserType.STUDENT, "STU001");
		registrationService.registerUser("student2@york.ca", "Password123!", "Student Two",
			UserType.STUDENT, "STU002");
		registrationService.registerUser("guest@example.com", "Password123!", "Guest User",
			UserType.GUEST, "G001");

		List<ApprovalRequest> pending = registrationService.getPendingApprovals();
		assertEquals(2, pending.size());
	}

	@Test
	public void testApproveAccountSucceeds() {
		RegistrationResult result = registrationService.registerUser("approve@york.ca", "Password123!",
			"Approve Me", UserType.STUDENT, "STU003");

		List<ApprovalRequest> pending = registrationService.getPendingApprovals();
		assertTrue(pending.size() > 0);

		String requestId = pending.get(0).getRequestId();
		registrationService.approveAccount(requestId);

		Optional<User> approved = registrationService.findByEmail("approve@york.ca");
		assertTrue(approved.isPresent());
		assertEquals(AccountStatus.ACTIVE, approved.get().getStatus());
	}

	@Test
	public void testRejectAccountSucceeds() {
		RegistrationResult result = registrationService.registerUser("reject@york.ca", "Password123!",
			"Reject Me", UserType.FACULTY, "FAC001");

		List<ApprovalRequest> pending = registrationService.getPendingApprovals();
		assertTrue(pending.size() > 0);

		String requestId = pending.get(0).getRequestId();
		registrationService.rejectAccount(requestId, "Not eligible");

		Optional<User> rejected = registrationService.findByEmail("reject@york.ca");
		assertTrue(rejected.isPresent());
		assertEquals(AccountStatus.REJECTED, rejected.get().getStatus());
	}

	@Test
	public void testFindUserByIdSucceeds() {
		RegistrationResult result = registrationService.registerUser("findbyid@example.com", "Password123!",
			"Find By ID", UserType.GUEST, "G002");

		Optional<User> user = registrationService.findByEmail("findbyid@example.com");
		assertTrue(user.isPresent());

		Optional<User> foundById = registrationService.findById(user.get().getUserId());
		assertTrue(foundById.isPresent());
		assertEquals("Find By ID", foundById.get().getFullName());
	}

	@Test
	public void testFindUserByIdNotFound() {
		Optional<User> result = registrationService.findById("NON_EXISTENT_ID");
		assertFalse(result.isPresent());
	}

	@Test
	public void testRegisterMultipleUsersDifferentTypes() {
		RegistrationResult guest = registrationService.registerUser("guest@example.com", "Password123!",
			"Guest User", UserType.GUEST, "G001");
		RegistrationResult student = registrationService.registerUser("student@york.ca", "Password123!",
			"Student User", UserType.STUDENT, "STU001");
		RegistrationResult researcher = registrationService.registerUser("researcher@york.ca", "Password123!",
			"Researcher User", UserType.RESEARCHER, "RES001");

		assertTrue(guest.success());
		assertTrue(student.success());
		assertTrue(researcher.success());

		Optional<User> foundGuest = registrationService.findByEmail("guest@example.com");
		Optional<User> foundStudent = registrationService.findByEmail("student@york.ca");
		Optional<User> foundResearcher = registrationService.findByEmail("researcher@york.ca");

		assertTrue(foundGuest.isPresent());
		assertTrue(foundStudent.isPresent());
		assertTrue(foundResearcher.isPresent());

		assertEquals(AccountStatus.ACTIVE, foundGuest.get().getStatus());
		assertEquals(AccountStatus.PENDING_APPROVAL, foundStudent.get().getStatus());
		assertEquals(AccountStatus.PENDING_APPROVAL, foundResearcher.get().getStatus());
	}

	@Test
	public void testApproveMultiplePendingAccounts() {
		registrationService.registerUser("student1@york.ca", "Password123!", "Student 1",
			UserType.STUDENT, "STU001");
		registrationService.registerUser("faculty1@york.ca", "Password123!", "Faculty 1",
			UserType.FACULTY, "FAC001");

		List<ApprovalRequest> pending = registrationService.getPendingApprovals();
		assertEquals(2, pending.size());

		for (ApprovalRequest request : pending) {
			registrationService.approveAccount(request.getRequestId());
		}

		Optional<User> student = registrationService.findByEmail("student1@york.ca");
		Optional<User> faculty = registrationService.findByEmail("faculty1@york.ca");

		assertTrue(student.isPresent());
		assertTrue(faculty.isPresent());
		assertEquals(AccountStatus.ACTIVE, student.get().getStatus());
		assertEquals(AccountStatus.ACTIVE, faculty.get().getStatus());
	}

	@Test
	public void testPasswordValidationEdgeCases() {
		assertTrue(registrationService.isPasswordStrong("Aa1!bcdefghijk"));
		assertTrue(registrationService.isPasswordStrong("Za1@zzzzzzzzz"));
		assertFalse(registrationService.isPasswordStrong("Aa1!bcd"));
		assertFalse(registrationService.isPasswordStrong("aa1!bcdefghijk"));
		assertFalse(registrationService.isPasswordStrong("Aa!!bcdefghijk"));
	}

	@Test
	public void testRegisterFacultyUserPendingApproval() {
		RegistrationResult result = registrationService.registerUser("faculty@york.ca", "Password123!",
			"Prof Faculty", UserType.FACULTY, "FAC001");

		assertTrue(result.success());
		assertNull(result.user());

		List<ApprovalRequest> pending = registrationService.getPendingApprovals();
		assertEquals(1, pending.size());
		assertEquals("Prof Faculty", pending.get(0).getUser().getFullName());
	}

	@Test
	public void testRejectAccountWithReason() {
		RegistrationResult result = registrationService.registerUser("rejectreason@york.ca",
			"Password123!", "Reject With Reason", UserType.RESEARCHER, "RES001");

		List<ApprovalRequest> pending = registrationService.getPendingApprovals();
		String requestId = pending.get(0).getRequestId();

		String rejectReason = "Does not meet eligibility criteria";
		registrationService.rejectAccount(requestId, rejectReason);

		Optional<User> rejected = registrationService.findByEmail("rejectreason@york.ca");
		assertTrue(rejected.isPresent());
		assertEquals(AccountStatus.REJECTED, rejected.get().getStatus());
	}

}
