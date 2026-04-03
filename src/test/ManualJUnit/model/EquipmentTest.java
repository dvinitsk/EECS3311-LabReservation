package test.ManualJUnit.model;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.UsageRecord;
import com.yorku.lab.pattern.observer.SensorObserver;

public class EquipmentTest {

	private Equipment equipment;
	
	@Before
	public void setUp() {
		equipment = new Equipment("EQU001", "Microscope", "Lab A");
	}
	
	@Test
	public void testEquipmentCreation() {
		assertEquals("EQU001", equipment.getEquipmentId());
		assertEquals("Microscope", equipment.getDescription());
		assertEquals("Lab A", equipment.getLabLocation());
		assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
		assertEquals(false, equipment.isInUse());
		assertEquals(0, equipment.getUsageRecords().size());
	}
	
	@Test
	public void testIsReservableWhenAvailable() {
		equipment.setOperationalStatus(OperationalStatus.AVAILABLE);
		assertTrue(equipment.isReservable());
	}
	
	@Test
	public void testIsReservableWhenDisabled() {
		equipment.setOperationalStatus(OperationalStatus.DISABLED);
		assertFalse(equipment.isReservable());
	}
	
	@Test
	public void testIsReservableWhenMaintenance() {
		equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
		assertFalse(equipment.isReservable());
	}
	
	@Test
	public void testSetOperationalStatus() {
		assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
		equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
		assertEquals(OperationalStatus.MAINTENANCE, equipment.getOperationalStatus());
		equipment.setOperationalStatus(OperationalStatus.DISABLED);
		assertEquals(OperationalStatus.DISABLED, equipment.getOperationalStatus());
	}
	
	@Test
	public void testSetInUse() {
		assertEquals(false, equipment.isInUse());
		equipment.setInUse(true);
		assertEquals(true, equipment.isInUse());
		equipment.setInUse(false);
		assertEquals(false, equipment.isInUse());
	}
	
	@Test
	public void testAddUsageRecords() {
		assertEquals(0, equipment.getUsageRecords().size());
		
		LocalDateTime timestamp1 = LocalDateTime.of(2026, 4, 2, 10, 30, 0);
		UsageRecord record1 = new UsageRecord("REC001", equipment, timestamp1, true, OperationalStatus.AVAILABLE);
		equipment.addUsageRecord(record1);
		assertEquals(1, equipment.getUsageRecords().size());
		assertEquals("REC001", equipment.getUsageRecords().get(0).getRecordId());
		
		LocalDateTime timestamp2 = LocalDateTime.of(2026, 4, 2, 11, 30, 0);
		UsageRecord record2 = new UsageRecord("REC002", equipment, timestamp2, false, OperationalStatus.AVAILABLE);
		equipment.addUsageRecord(record2);
		assertEquals(2, equipment.getUsageRecords().size());
		assertEquals("REC002", equipment.getUsageRecords().get(1).getRecordId());
	}
	
	@Test
	public void testEquipmentObserverAttach() {
		SensorObserver observer1 = new SensorObserver() {
			@Override
			public void update(Equipment equipment) {}
		};
		
		equipment.attach(observer1);
		assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
	}
	
	@Test
	public void testEquipmentObserverDetach() {
		SensorObserver observer1 = new SensorObserver() {
			@Override
			public void update(Equipment equipment) {}
		};
		
		equipment.attach(observer1);
		equipment.detach(observer1);
		assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
	}
	
	@Test
	public void testEquipmentToString() {
		String result = equipment.toString();
		assertEquals("EQU001 - Microscope (Lab A)", result);
		assertTrue(result.contains("EQU001"));
		assertTrue(result.contains("Microscope"));
		assertTrue(result.contains("Lab A"));
	}
	
	@Test
	public void testMultipleEquipmentCreation() {
		Equipment equipment2 = new Equipment("EQU002", "Spectrometer", "Lab B");
		Equipment equipment3 = new Equipment("EQU003", "Centrifuge", "Lab C");
		
		assertEquals("EQU002", equipment2.getEquipmentId());
		assertEquals("Spectrometer", equipment2.getDescription());
		assertEquals("Lab B", equipment2.getLabLocation());
		
		assertEquals("EQU003", equipment3.getEquipmentId());
		assertEquals("Centrifuge", equipment3.getDescription());
		assertEquals("Lab C", equipment3.getLabLocation());
		
		assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
		assertEquals(OperationalStatus.AVAILABLE, equipment2.getOperationalStatus());
		assertEquals(OperationalStatus.AVAILABLE, equipment3.getOperationalStatus());
	}
	
	@Test
	public void testMultipleUsageRecordsWithDifferentStatuses() {
		LocalDateTime timestamp1 = LocalDateTime.of(2026, 4, 2, 9, 0, 0);
		UsageRecord record1 = new UsageRecord("REC003", equipment, timestamp1, true, OperationalStatus.AVAILABLE);
		equipment.addUsageRecord(record1);
		
		LocalDateTime timestamp2 = LocalDateTime.of(2026, 4, 2, 10, 0, 0);
		UsageRecord record2 = new UsageRecord("REC004", equipment, timestamp2, true, OperationalStatus.MAINTENANCE);
		equipment.addUsageRecord(record2);
		
		LocalDateTime timestamp3 = LocalDateTime.of(2026, 4, 2, 11, 0, 0);
		UsageRecord record3 = new UsageRecord("REC005", equipment, timestamp3, false, OperationalStatus.DISABLED);
		equipment.addUsageRecord(record3);
		
		assertEquals(3, equipment.getUsageRecords().size());
		assertEquals(OperationalStatus.AVAILABLE, equipment.getUsageRecords().get(0).getStatus());
		assertEquals(OperationalStatus.MAINTENANCE, equipment.getUsageRecords().get(1).getStatus());
		assertEquals(OperationalStatus.DISABLED, equipment.getUsageRecords().get(2).getStatus());
	}
	
	@Test
	public void testStatusTransitionsFromAvailableToMaintenanceToDisabled() {
		assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
		assertTrue(equipment.isReservable());
		
		equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
		assertEquals(OperationalStatus.MAINTENANCE, equipment.getOperationalStatus());
		assertFalse(equipment.isReservable());
		
		equipment.setOperationalStatus(OperationalStatus.DISABLED);
		assertEquals(OperationalStatus.DISABLED, equipment.getOperationalStatus());
		assertFalse(equipment.isReservable());
		
		equipment.setOperationalStatus(OperationalStatus.AVAILABLE);
		assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
		assertTrue(equipment.isReservable());
	}
	
	@Test
	public void testEquipmentInUseWithMultipleToggling() {
		assertFalse(equipment.isInUse());
		
		equipment.setInUse(true);
		assertTrue(equipment.isInUse());
		
		equipment.setInUse(true);
		assertTrue(equipment.isInUse());
		
		equipment.setInUse(false);
		assertFalse(equipment.isInUse());
		
		equipment.setInUse(false);
		assertFalse(equipment.isInUse());
		
		equipment.setInUse(true);
		assertTrue(equipment.isInUse());
	}
	
	@Test
	public void testEquipmentWithUsageRecordsAndStatusChanges() {
		LocalDateTime timestamp1 = LocalDateTime.of(2026, 4, 2, 8, 0, 0);
		UsageRecord record1 = new UsageRecord("REC006", equipment, timestamp1, true, OperationalStatus.AVAILABLE);
		equipment.addUsageRecord(record1);
		
		equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
		LocalDateTime timestamp2 = LocalDateTime.of(2026, 4, 2, 9, 0, 0);
		UsageRecord record2 = new UsageRecord("REC007", equipment, timestamp2, false, OperationalStatus.MAINTENANCE);
		equipment.addUsageRecord(record2);
		
		assertEquals(OperationalStatus.MAINTENANCE, equipment.getOperationalStatus());
		assertEquals(2, equipment.getUsageRecords().size());
		assertFalse(equipment.isReservable());
	}

}
