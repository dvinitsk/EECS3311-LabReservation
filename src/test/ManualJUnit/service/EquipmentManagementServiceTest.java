package test.ManualJUnit.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.yorku.lab.model.Equipment;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.repository.EquipmentRepository;
import com.yorku.lab.service.EquipmentManagementService;

public class EquipmentManagementServiceTest {

	private EquipmentManagementService equipmentManagementService;
	private EquipmentRepository equipmentRepository;

	@Before
	public void setUp() throws Exception {
		equipmentRepository = new EquipmentRepository();
		equipmentManagementService = new EquipmentManagementService();
	}

	@After
	public void tearDown() throws Exception {
		java.nio.file.Path path = java.nio.file.Paths.get("data/equipment.csv");
		if (java.nio.file.Files.exists(path)) {
			java.nio.file.Files.delete(path);
		}
	}

	@Test
	public void testAddEquipmentSucceeds() {
		Equipment equipment = equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		assertNotNull(equipment);
		assertEquals("EQ-001", equipment.getEquipmentId());
		assertEquals("Microscope", equipment.getDescription());
		assertEquals("Lab A", equipment.getLabLocation());
		assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
	}

	@Test
	public void testAddMultipleEquipmentSucceeds() {
		Equipment eq1 = equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		Equipment eq2 = equipmentManagementService.addEquipment("EQ-002", "Centrifuge", "Lab B");
		assertEquals("EQ-001", eq1.getEquipmentId());
		assertEquals("EQ-002", eq2.getEquipmentId());
	}

	@Test
	public void testEnableEquipmentSucceeds() {
		equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		Optional<Equipment> result = equipmentManagementService.enableEquipment("EQ-001");
		assertTrue(result.isPresent());
		assertEquals(OperationalStatus.AVAILABLE, result.get().getOperationalStatus());
	}

	@Test
	public void testEnableEquipmentFailsWhenNotFound() {
		Optional<Equipment> result = equipmentManagementService.enableEquipment("EQ-999");
		assertFalse(result.isPresent());
	}

	@Test
	public void testDisableEquipmentSucceeds() {
		equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		Optional<Equipment> result = equipmentManagementService.disableEquipment("EQ-001");
		assertTrue(result.isPresent());
		assertEquals(OperationalStatus.DISABLED, result.get().getOperationalStatus());
	}

	@Test
	public void testDisableEquipmentFailsWhenNotFound() {
		Optional<Equipment> result = equipmentManagementService.disableEquipment("EQ-999");
		assertFalse(result.isPresent());
	}

	@Test
	public void testMarkMaintenanceSucceeds() {
		equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		Optional<Equipment> result = equipmentManagementService.markMaintenance("EQ-001");
		assertTrue(result.isPresent());
		assertEquals(OperationalStatus.MAINTENANCE, result.get().getOperationalStatus());
	}

	@Test
	public void testMarkMaintenanceFailsWhenNotFound() {
		Optional<Equipment> result = equipmentManagementService.markMaintenance("EQ-999");
		assertFalse(result.isPresent());
	}

	@Test
	public void testListAllEquipmentReturnsEmptyWhenNoEquipment() {
		List<Equipment> equipmentList = equipmentManagementService.listAllEquipment();
		assertNotNull(equipmentList);
		assertEquals(0, equipmentList.size());
	}

	@Test
	public void testListAllEquipmentReturnsAllAddedEquipment() {
		equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		equipmentManagementService.addEquipment("EQ-002", "Centrifuge", "Lab B");
		equipmentManagementService.addEquipment("EQ-003", "Spectrometer", "Lab C");
		List<Equipment> equipmentList = equipmentManagementService.listAllEquipment();
		assertEquals(3, equipmentList.size());
	}

	@Test
	public void testGetEquipmentSucceeds() {
		equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		Optional<Equipment> result = equipmentManagementService.getEquipment("EQ-001");
		assertTrue(result.isPresent());
		assertEquals("EQ-001", result.get().getEquipmentId());
	}

	@Test
	public void testGetEquipmentFailsWhenNotFound() {
		Optional<Equipment> result = equipmentManagementService.getEquipment("EQ-999");
		assertFalse(result.isPresent());
	}

	@Test
	public void testEnableEquipmentFromMaintenanceToAvailable() {
		equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		equipmentManagementService.markMaintenance("EQ-001");
		Optional<Equipment> result = equipmentManagementService.enableEquipment("EQ-001");
		assertTrue(result.isPresent());
		assertEquals(OperationalStatus.AVAILABLE, result.get().getOperationalStatus());
	}

	@Test
	public void testDisableEquipmentFromAvailableToDisabled() {
		equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		Optional<Equipment> result = equipmentManagementService.disableEquipment("EQ-001");
		assertTrue(result.isPresent());
		assertEquals(OperationalStatus.DISABLED, result.get().getOperationalStatus());
	}

	@Test
	public void testStatusTransitionFromDisabledToMaintenance() {
		equipmentManagementService.addEquipment("EQ-001", "Microscope", "Lab A");
		equipmentManagementService.disableEquipment("EQ-001");
		Optional<Equipment> result = equipmentManagementService.markMaintenance("EQ-001");
		assertTrue(result.isPresent());
		assertEquals(OperationalStatus.MAINTENANCE, result.get().getOperationalStatus());
	}

}
