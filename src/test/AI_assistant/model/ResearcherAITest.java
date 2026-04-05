package test.AI_assistant.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Guest;
import com.yorku.lab.model.Researcher;
import com.yorku.lab.model.User;

public class ResearcherAITest {

	private User user;

	@Before
	public void setUp() throws Exception {
		user=new Researcher("Id123","John Doe",new Credentials("a@email.com", "Pass123"),"Cert123");
		user.setStatus(AccountStatus.PENDING_APPROVAL);
		user.setActive(false);
		user.setAffiliation(AffiliationType.UNIVERSITY);
	}

	@Test
	public void testTypeReturn() {
		assertEquals(UserType.RESEARCHER, user.getType());
	}
	
	@Test
	public void testModifyUserID() {
		assertEquals("Id123", user.getUserId());
		user.setUserId("Id1234");
		assertEquals("Id1234", user.getUserId());
	}
	
	@Test
	public void testModifyUserName() {
		assertEquals("John Doe", user.getFullName());
		user.setFullName("Jane Doe");
		assertEquals("Jane Doe", user.getFullName());
	}
	
	@Test
	public void testCheckStatusTrue() {
		assertEquals(AccountStatus.PENDING_APPROVAL, user.getStatus());
		user.setStatus(AccountStatus.ACTIVE);
		assertEquals(AccountStatus.ACTIVE, user.getStatus());
	}
	
	@Test
	public void testCheckStatusFalse() {
		assertEquals(AccountStatus.PENDING_APPROVAL, user.getStatus());
		user.setStatus(AccountStatus.REJECTED);
		assertEquals(AccountStatus.REJECTED, user.getStatus());
	}
	
	@Test
	public void testModifyRate() {
		assertEquals(0.0, user.getHourlyRate(),0.01);
		user.setHourlyRate(10.00);
		assertEquals(10.00, user.getHourlyRate(),0.01);
	}
	
	@Test
	public void testActive() {
		assertFalse(user.isActive());
		user.setActive(true);
		assertTrue(user.isActive());
	}
	
	@Test
	public void testCredentials() {
		Credentials test = new Credentials("a@email.com", "Pass123");
		assertEquals(test.getEmail(), user.getCredentials().getEmail());
		assertEquals(test.getPasswordHash(), user.getCredentials().getPasswordHash());
	}
	
	@Test
	public void testAffiliation() {
		assertEquals(AffiliationType.UNIVERSITY,user.getAffiliation());
		user.setAffiliation(AffiliationType.GUEST);
		assertEquals(AffiliationType.GUEST,user.getAffiliation());
	}
	
	@Test
	public void testIdOrCertification() {
		assertEquals("Cert123", user.getIdOrCertificationNumber());
		user.setIdOrCertificationNumber("Cert1234");
		assertEquals("Cert1234", user.getIdOrCertificationNumber());
	}

}
