package test.ManualJUnit.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.*;
import com.yorku.lab.repository.UserRepository;

public class UserRepositoryTest {

	private UserRepository repository;

	@Before
	public void setUp() {
		deleteFile("data/users.csv");
		repository = new UserRepository();
	}

	@After
	public void tearDown() {
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
		Student student = new Student("S001", "John Doe", new Credentials("john@york.ca", "pass123"), "STU001");
		repository.save(student);

		assertTrue(repository.findById("S001").isPresent());
		assertEquals("John Doe", repository.findById("S001").get().getFullName());
	}

	@Test
	public void testFindByIdNotFound() {
		assertFalse(repository.findById("NONEXISTENT").isPresent());
	}

	@Test
	public void testFindByEmail() {
		Student student = new Student("S001", "John Doe", new Credentials("john@york.ca", "pass123"), "STU001");
		repository.save(student);

		assertTrue(repository.findByEmail("john@york.ca").isPresent());
		assertEquals("S001", repository.findByEmail("john@york.ca").get().getUserId());
	}

	@Test
	public void testFindByEmailCaseInsensitive() {
		Student student = new Student("S001", "John Doe", new Credentials("John@York.CA", "pass123"), "STU001");
		repository.save(student);

		assertTrue(repository.findByEmail("john@york.ca").isPresent());
	}

	@Test
	public void testFindByEmailNotFound() {
		assertFalse(repository.findByEmail("nonexistent@york.ca").isPresent());
	}

	@Test
	public void testFindByEmailNull() {
		assertFalse(repository.findByEmail(null).isPresent());
	}

	@Test
	public void testSaveMultipleUsers() {
		repository.save(new Student("S001", "John", new Credentials("john@york.ca", "p1"), "STU001"));
		repository.save(new Faculty("F001", "Jane", new Credentials("jane@york.ca", "p2")));
		repository.save(new Guest("G001", "Bob", new Credentials("bob@email.com", "p3")));

		assertEquals(3, repository.findAll().size());
	}

	@Test
	public void testSaveUpdatesExistingUser() {
		Student student = new Student("S001", "John Doe", new Credentials("john@york.ca", "pass123"), "STU001");
		student.setStatus(AccountStatus.PENDING_APPROVAL);
		repository.save(student);

		student.setStatus(AccountStatus.ACTIVE);
		repository.save(student);

		assertEquals(1, repository.findAll().size());
		assertEquals(AccountStatus.ACTIVE, repository.findById("S001").get().getStatus());
	}

	@Test
	public void testDeleteRemovesUser() {
		repository.save(new Student("S001", "John", new Credentials("john@york.ca", "p1"), "STU001"));
		repository.delete("S001");

		assertFalse(repository.findById("S001").isPresent());
		assertEquals(0, repository.findAll().size());
	}

	@Test
	public void testDeleteNonexistentDoesNothing() {
		repository.save(new Student("S001", "John", new Credentials("john@york.ca", "p1"), "STU001"));
		repository.delete("NONEXISTENT");

		assertEquals(1, repository.findAll().size());
	}

	@Test
	public void testDeleteFromMultipleUsers() {
		repository.save(new Student("S001", "John", new Credentials("john@york.ca", "p1"), "STU001"));
		repository.save(new Faculty("F001", "Jane", new Credentials("jane@york.ca", "p2")));

		repository.delete("S001");

		assertEquals(1, repository.findAll().size());
		assertFalse(repository.findById("S001").isPresent());
		assertTrue(repository.findById("F001").isPresent());
	}

	@Test
	public void testManagerDepartmentPersisted() {
		Manager manager = new Manager("M001", "Alex", new Credentials("alex@york.ca", "p1"), "Engineering");
		repository.save(manager);

		User loaded = repository.findById("M001").get();
		assertTrue(loaded instanceof Manager);
		assertEquals("Engineering", ((Manager) loaded).getDepartment());
	}

	@Test
	public void testResearcherCertificationPersisted() {
		Researcher researcher = new Researcher("R001", "Dr. Smith", new Credentials("smith@york.ca", "p1"), "CERT-001");
		repository.save(researcher);

		User loaded = repository.findById("R001").get();
		assertEquals("CERT-001", loaded.getIdOrCertificationNumber());
	}
}
