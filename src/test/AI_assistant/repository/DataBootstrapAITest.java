package test.AI_assistant.repository;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.Guest;
import com.yorku.lab.model.LabCoordinator;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.repository.DataBootstrap;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.repository.RepositoryProvider;
import com.yorku.lab.repository.UserRepository;

public class DataBootstrapAITest {

    private UserRepository userRepository;
    private EquipmentRepository equipmentRepository;

    @Before
    public void setUp() {
        userRepository = RepositoryProvider.getUserRepository();
        equipmentRepository = new EquipmentRepository();
    }

    @After
    public void tearDown() throws Exception {
        deleteIfExists("data/users.csv");
        deleteIfExists("data/equipment.csv");
    }

    private void deleteIfExists(String file) throws Exception {
        Path path = Paths.get(file);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    @Test
    public void testRunIfNeededSeedsCoordinator() {
        DataBootstrap.runIfNeeded();
        assertFalse(userRepository.findAll().isEmpty());
    }

    @Test
    public void testSeededCoordinatorIsLabCoordinator() {
        DataBootstrap.runIfNeeded();
        assertEquals(UserType.LABCOORDINATOR, userRepository.findAll().get(0).getType());
    }

    @Test
    public void testSeededCoordinatorStartsActive() {
        DataBootstrap.runIfNeeded();
        assertEquals(AccountStatus.ACTIVE, userRepository.findAll().get(0).getStatus());
    }

    @Test
    public void testRunIfNeededSeedsThreeEquipment() {
        DataBootstrap.runIfNeeded();
        assertEquals(3, equipmentRepository.findAll().size());
    }

    @Test
    public void testSecondRunDoesNotDuplicateUsers() {
        DataBootstrap.runIfNeeded();
        DataBootstrap.runIfNeeded();
        assertEquals(1, userRepository.findAll().size());
    }

    @Test
    public void testSecondRunDoesNotDuplicateEquipment() {
        DataBootstrap.runIfNeeded();
        DataBootstrap.runIfNeeded();
        assertEquals(3, equipmentRepository.findAll().size());
    }

    @Test
    public void testExistingUserPreventsCoordinatorSeed() {
        userRepository.save(new Guest("DB-U1", "Guest", new Credentials("db@yorku.ca", "Pass123!"), "CERT"));
        DataBootstrap.runIfNeeded();
        assertEquals(1, userRepository.findAll().size());
    }

    @Test
    public void testExistingEquipmentPreventsEquipmentSeed() {
        equipmentRepository.save(new Equipment("DB-E1", "Custom", "Lab X"));
        DataBootstrap.runIfNeeded();
        assertEquals(1, equipmentRepository.findAll().size());
    }

    @Test
    public void testSeededEquipmentDescriptionMatches() {
        DataBootstrap.runIfNeeded();
        assertEquals("Microscope", equipmentRepository.findById("EQ-001").get().getDescription());
    }

    @Test
    public void testSeededEquipmentIdsStartWithEqPrefix() {
        DataBootstrap.runIfNeeded();
        assertTrue(equipmentRepository.findAll().stream().allMatch(e -> e.getEquipmentId().startsWith("EQ-")));
    }
}
