package test.ManualJUnit.pattern.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.Student;
import com.yorku.lab.model.Faculty;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.factory.UserFactory;

public class UserFactoryTest {

	@Test
	public void testCreateStudentNotNull() {
		User user = UserFactory.createUser(UserType.STUDENT, "S001", "John Doe", "john@example.com", "pass123");
		assertNotNull(user);
	}

	@Test
	public void testCreateStudentIsStudent() {
		User user = UserFactory.createUser(UserType.STUDENT, "S002", "Jane Smith", "jane@example.com", "pass456");
		assertTrue(user instanceof Student);
	}

	@Test
	public void testCreateFacultyNotNull() {
		User user = UserFactory.createUser(UserType.FACULTY, "F001", "Dr. Johnson", "johnson@example.com", "pass789");
		assertNotNull(user);
	}

	@Test
	public void testCreateFacultyIsFaculty() {
		User user = UserFactory.createUser(UserType.FACULTY, "F002", "Dr. Williams", "williams@example.com", "pass999", "987654321");
		assertTrue(user instanceof Faculty);
	}

	@Test
	public void testCreateResearcherNotNull() {
		User user = UserFactory.createUser(UserType.RESEARCHER, "R001", "Bob Research", "bob@example.com", "passresearch");
		assertNotNull(user);
	}

	@Test
	public void testCreateGuestNotNull() {
		User user = UserFactory.createUser(UserType.GUEST, "G001", "Alice Guest", "alice@example.com", "passguest", "G123");
		assertNotNull(user);
	}

	@Test
	public void testCreateManagerNotNull() {
		User user = UserFactory.createUser(UserType.MANAGER, "M001", "Manager Bob", "manager@example.com", "passmanager");
		assertNotNull(user);
	}

	@Test
	public void testCreateLabCoordinatorNotNull() {
		User user = UserFactory.createUser(UserType.LABCOORDINATOR, "LC001", "Coordinator Carol", "coordinator@example.com", "passcoord");
		assertNotNull(user);
	}

	@Test
	public void testCreateUserWithIdNotNull() {
		User user = UserFactory.createUser(UserType.STUDENT, "S003", "Test Student", "test@example.com", "testpass", "ID123");
		assertNotNull(user);
	}

	@Test
	public void testCreateUserCredentialsNotNull() {
		User user = UserFactory.createUser(UserType.FACULTY, "F003", "Dr. Test", "drtest@example.com", "drpass");
		assertNotNull(user.getCredentials());
	}

}
