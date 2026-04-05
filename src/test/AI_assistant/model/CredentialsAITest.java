package test.AI_assistant.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.model.Credentials;

public class CredentialsAITest {

	private Credentials credentials;
	
	@Before
	public void setUp() {
		credentials = new Credentials("student1@york.edu", "pass123");
	}
	
	@Test
	public void testCredentialsCreation() {
		assertEquals("student1@york.edu", credentials.getEmail());
		assertEquals("pass123", credentials.getPasswordHash());
	}
	
	@Test
	public void testVerifyPasswordCorrect() {
		assertTrue(credentials.verifyPassword("pass123"));
	}
	
	@Test
	public void testVerifyPasswordIncorrect() {
		assertFalse(credentials.verifyPassword("wrongpassword"));
	}
	
	@Test
	public void testVerifyPasswordWithWhitespace() {
		Credentials credentialsWithSpace = new Credentials("faculty@york.edu", "  password123  ");
		assertTrue(credentialsWithSpace.verifyPassword("password123"));
		assertTrue(credentialsWithSpace.verifyPassword("  password123  "));
	}
	
	@Test
	public void testVerifyPasswordNull() {
		assertFalse(credentials.verifyPassword(null));
	}
	
	@Test
	public void testSetEmail() {
		assertEquals("student1@york.edu", credentials.getEmail());
		credentials.setEmail("newstudent@york.edu");
		assertEquals("newstudent@york.edu", credentials.getEmail());
	}
	
	@Test
	public void testSetPasswordHash() {
		assertEquals("pass123", credentials.getPasswordHash());
		credentials.setPasswordHash("newpassword456");
		assertEquals("newpassword456", credentials.getPasswordHash());
		assertTrue(credentials.verifyPassword("newpassword456"));
		assertFalse(credentials.verifyPassword("pass123"));
	}
	
	@Test
	public void testMultipleCredentialsInstances() {
		Credentials creds1 = new Credentials("user1@york.edu", "password1");
		Credentials creds2 = new Credentials("user2@york.edu", "password2");
		Credentials creds3 = new Credentials("user3@york.edu", "password3");
		
		assertEquals("user1@york.edu", creds1.getEmail());
		assertEquals("user2@york.edu", creds2.getEmail());
		assertEquals("user3@york.edu", creds3.getEmail());
		
		assertTrue(creds1.verifyPassword("password1"));
		assertTrue(creds2.verifyPassword("password2"));
		assertTrue(creds3.verifyPassword("password3"));
		
		assertFalse(creds1.verifyPassword("password2"));
		assertFalse(creds2.verifyPassword("password3"));
	}
	
	@Test
	public void testCredentialsWithSpecialCharacters() {
		Credentials specialCreds = new Credentials("special@york.edu", "p@ss!123#xyz");
		assertEquals("special@york.edu", specialCreds.getEmail());
		assertEquals("p@ss!123#xyz", specialCreds.getPasswordHash());
		assertTrue(specialCreds.verifyPassword("p@ss!123#xyz"));
		assertFalse(specialCreds.verifyPassword("p@ss!123#x"));
	}
	
	@Test
	public void testCredentialsPasswordHashNullVerification() {
		Credentials nullPasswordCreds = new Credentials("test@york.edu", null);
		assertNull(nullPasswordCreds.getPasswordHash());
		assertFalse(nullPasswordCreds.verifyPassword("anypassword"));
		assertFalse(nullPasswordCreds.verifyPassword(null));
	}
	
	@Test
	public void testCredentialsEmailUpdate() {
		assertEquals("student1@york.edu", credentials.getEmail());
		credentials.setEmail("updated@york.edu");
		assertEquals("updated@york.edu", credentials.getEmail());
		
		credentials.setEmail("another@example.com");
		assertEquals("another@example.com", credentials.getEmail());
		
		assertTrue(credentials.verifyPassword("pass123"));
	}
	
	@Test
	public void testMultiplePasswordChanges() {
		assertTrue(credentials.verifyPassword("pass123"));
		
		credentials.setPasswordHash("newpass456");
		assertFalse(credentials.verifyPassword("pass123"));
		assertTrue(credentials.verifyPassword("newpass456"));
		
		credentials.setPasswordHash("thirdpass789");
		assertFalse(credentials.verifyPassword("newpass456"));
		assertTrue(credentials.verifyPassword("thirdpass789"));
		
		credentials.setPasswordHash("pass123");
		assertTrue(credentials.verifyPassword("pass123"));
	}

}
