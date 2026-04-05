package test.ManualJUnit.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.repository.DataBootstrap;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.repository.RepositoryProvider;
import com.yorku.lab.repository.UserRepository;

public class DataBootstrapTest {

	@Before
	public void setUp() {
		deleteFile("data/users.csv");
		deleteFile("data/equipment.csv");
	}

	@After
	public void tearDown() {
		deleteFile("data/users.csv");
		deleteFile("data/equipment.csv");
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
	public void testRunIfNeededSeedsUsers() {
		DataBootstrap.runIfNeeded();

		UserRepository userRepo = RepositoryProvider.getUserRepository();
		assertFalse(userRepo.findAll().isEmpty());
	}

	@Test
	public void testRunIfNeededSeedsEquipment() {
		DataBootstrap.runIfNeeded();

		EquipmentRepository eqRepo = new EquipmentRepository();
		assertFalse(eqRepo.findAll().isEmpty());
		assertEquals(3, eqRepo.findAll().size());
	}

	@Test
	public void testRunIfNeededSeedsCoordinator() {
		DataBootstrap.runIfNeeded();

		UserRepository userRepo = RepositoryProvider.getUserRepository();
		assertTrue(userRepo.findByEmail("coordinator@yorku.ca").isPresent());
	}

	@Test
	public void testRunIfNeededDoesNotDuplicateOnSecondRun() {
		DataBootstrap.runIfNeeded();
		int userCountFirst = RepositoryProvider.getUserRepository().findAll().size();
		int eqCountFirst = new EquipmentRepository().findAll().size();

		DataBootstrap.runIfNeeded();
		int userCountSecond = RepositoryProvider.getUserRepository().findAll().size();
		int eqCountSecond = new EquipmentRepository().findAll().size();

		assertEquals(userCountFirst, userCountSecond);
		assertEquals(eqCountFirst, eqCountSecond);
	}
}
