package test.AI_assistant.repository;

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

public class EquipmentRepositoryAITest {

    private EquipmentRepository repository;

    @Before
    public void setUp() {
        repository = new EquipmentRepository();
    }

    @After
    public void tearDown() throws Exception {
        deleteIfExists("data/equipment.csv");
    }

    private void deleteIfExists(String file) throws Exception {
        Path path = Paths.get(file);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    @Test
    public void testSaveAndFindById() {
        Equipment equipment = new Equipment("EQ-A1", "Microscope", "Lab A");
        repository.save(equipment);
        assertTrue(repository.findById("EQ-A1").isPresent());
    }

    @Test
    public void testFindByIdMissingReturnsEmpty() {
        assertTrue(repository.findById("missing").isEmpty());
    }

    @Test
    public void testFindAllStartsEmpty() {
        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void testFindAllReturnsSavedEquipment() {
        repository.save(new Equipment("EQ-A2", "Scope", "Lab B"));
        assertEquals(1, repository.findAll().size());
    }

    @Test
    public void testSaveUpdatesExistingEquipment() {
        Equipment equipment = new Equipment("EQ-A3", "Printer", "Lab C");
        repository.save(equipment);
        equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
        repository.save(equipment);

        assertEquals(1, repository.findAll().size());
        assertEquals(OperationalStatus.MAINTENANCE, repository.findById("EQ-A3").get().getOperationalStatus());
    }

    @Test
    public void testDeleteRemovesEquipment() {
        repository.save(new Equipment("EQ-A4", "Scale", "Lab D"));
        repository.delete("EQ-A4");
        assertTrue(repository.findById("EQ-A4").isEmpty());
    }

    @Test
    public void testDeleteMissingEquipmentKeepsRepositoryStable() {
        repository.delete("missing");
        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void testMultipleEquipmentAreStored() {
        repository.save(new Equipment("EQ-A5", "Item1", "L1"));
        repository.save(new Equipment("EQ-A6", "Item2", "L2"));
        assertEquals(2, repository.findAll().size());
    }

    @Test
    public void testDisabledStatusIsPreserved() {
        Equipment equipment = new Equipment("EQ-A7", "Item3", "L3");
        equipment.setOperationalStatus(OperationalStatus.DISABLED);
        repository.save(equipment);
        assertEquals(OperationalStatus.DISABLED, repository.findById("EQ-A7").get().getOperationalStatus());
    }

    @Test
    public void testMaintenanceStatusIsPreserved() {
        Equipment equipment = new Equipment("EQ-A8", "Item4", "L4");
        equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
        repository.save(equipment);
        assertEquals(OperationalStatus.MAINTENANCE, repository.findById("EQ-A8").get().getOperationalStatus());
    }
}
