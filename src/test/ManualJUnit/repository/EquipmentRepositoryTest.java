package test.ManualJUnit.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.repository.EquipmentRepository;

public class EquipmentRepositoryTest {

	private EquipmentRepository repository;

	@Before
	public void setUp() {
		deleteFile("data/equipment.csv");
		repository = new EquipmentRepository();
	}

	@After
	public void tearDown() {
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
	public void testFindAllEmptyInitially() {
		assertEquals(0, repository.findAll().size());
	}

	@Test
	public void testSaveAndFindById() {
		Equipment eq = new Equipment("EQ-T1", "Microscope", "Lab A");
		repository.save(eq);

		assertTrue(repository.findById("EQ-T1").isPresent());
		assertEquals("Microscope", repository.findById("EQ-T1").get().getDescription());
	}

	@Test
	public void testFindByIdNotFound() {
		assertFalse(repository.findById("NONEXISTENT").isPresent());
	}

	@Test
	public void testSaveMultipleEquipment() {
		repository.save(new Equipment("EQ-T1", "Microscope", "Lab A"));
		repository.save(new Equipment("EQ-T2", "Oscilloscope", "Lab B"));
		repository.save(new Equipment("EQ-T3", "3D Printer", "Lab C"));

		assertEquals(3, repository.findAll().size());
	}

	@Test
	public void testSaveUpdatesExisting() {
		Equipment eq = new Equipment("EQ-T1", "Microscope", "Lab A");
		repository.save(eq);

		eq.setOperationalStatus(OperationalStatus.MAINTENANCE);
		repository.save(eq);

		assertEquals(1, repository.findAll().size());
		assertEquals(OperationalStatus.MAINTENANCE, repository.findById("EQ-T1").get().getOperationalStatus());
	}

	@Test
	public void testDeleteRemovesEquipment() {
		repository.save(new Equipment("EQ-T1", "Microscope", "Lab A"));
		repository.delete("EQ-T1");

		assertFalse(repository.findById("EQ-T1").isPresent());
		assertEquals(0, repository.findAll().size());
	}

	@Test
	public void testDeleteNonexistentDoesNothing() {
		repository.save(new Equipment("EQ-T1", "Microscope", "Lab A"));
		repository.delete("NONEXISTENT");

		assertEquals(1, repository.findAll().size());
	}

	@Test
	public void testOperationalStatusPersisted() {
		Equipment eq = new Equipment("EQ-T1", "Microscope", "Lab A");
		eq.setOperationalStatus(OperationalStatus.DISABLED);
		repository.save(eq);

		assertEquals(OperationalStatus.DISABLED, repository.findById("EQ-T1").get().getOperationalStatus());
	}

	@Test
	public void testLabLocationPersisted() {
		Equipment eq = new Equipment("EQ-T1", "Microscope", "Lab Room 205");
		repository.save(eq);

		assertEquals("Lab Room 205", repository.findById("EQ-T1").get().getLabLocation());
	}

	@Test
	public void testDeleteFromMultiple() {
		repository.save(new Equipment("EQ-T1", "Microscope", "Lab A"));
		repository.save(new Equipment("EQ-T2", "Oscilloscope", "Lab B"));
		repository.save(new Equipment("EQ-T3", "3D Printer", "Lab C"));

		repository.delete("EQ-T2");

		assertEquals(2, repository.findAll().size());
		assertFalse(repository.findById("EQ-T2").isPresent());
		assertTrue(repository.findById("EQ-T1").isPresent());
		assertTrue(repository.findById("EQ-T3").isPresent());
	}
}
