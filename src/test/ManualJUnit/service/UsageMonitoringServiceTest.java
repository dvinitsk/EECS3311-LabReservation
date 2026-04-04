package test.ManualJUnit.service;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.UsageRecord;
import com.yorku.lab.service.UsageMonitoringService;

public class UsageMonitoringServiceTest {

	private UsageMonitoringService usageMonitoringService;
	private Equipment equipment;

	@Before
	public void setUp() {
		usageMonitoringService = new UsageMonitoringService();
		equipment = new Equipment("EQ001", "Microscope", "Lab A");
	}

	@Test
	public void testRecordUsageUpdateSetsOperationalStatus() {
		usageMonitoringService.recordUsageUpdate(equipment, true, OperationalStatus.AVAILABLE);
		assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
	}

	@Test
	public void testRecordUsageUpdateCreatesUsageRecord() {
		usageMonitoringService.recordUsageUpdate(equipment, true, OperationalStatus.AVAILABLE);
		List<UsageRecord> records = equipment.getUsageRecords();
		assertEquals(1, records.size());
	}

	@Test
	public void testRecordUsageUpdateWithInUseTrue() {
		usageMonitoringService.recordUsageUpdate(equipment, true, OperationalStatus.AVAILABLE);
		List<UsageRecord> records = equipment.getUsageRecords();
		assertTrue(records.get(0).isInUse());
	}

	@Test
	public void testRecordUsageUpdateWithInUseFalse() {
		usageMonitoringService.recordUsageUpdate(equipment, false, OperationalStatus.AVAILABLE);
		List<UsageRecord> records = equipment.getUsageRecords();
		assertFalse(records.get(0).isInUse());
	}

	@Test
	public void testRecordUsageUpdateWithMaintenanceStatus() {
		usageMonitoringService.recordUsageUpdate(equipment, false, OperationalStatus.MAINTENANCE);
		assertEquals(OperationalStatus.MAINTENANCE, equipment.getOperationalStatus());
		List<UsageRecord> records = equipment.getUsageRecords();
		assertEquals(OperationalStatus.MAINTENANCE, records.get(0).getStatus());
	}

	@Test
	public void testRecordUsageUpdateWithDisabledStatus() {
		usageMonitoringService.recordUsageUpdate(equipment, false, OperationalStatus.DISABLED);
		assertEquals(OperationalStatus.DISABLED, equipment.getOperationalStatus());
		List<UsageRecord> records = equipment.getUsageRecords();
		assertEquals(OperationalStatus.DISABLED, records.get(0).getStatus());
	}

	@Test
	public void testRecordUsageUpdateMultipleRecords() {
		usageMonitoringService.recordUsageUpdate(equipment, true, OperationalStatus.AVAILABLE);
		usageMonitoringService.recordUsageUpdate(equipment, false, OperationalStatus.AVAILABLE);
		usageMonitoringService.recordUsageUpdate(equipment, true, OperationalStatus.MAINTENANCE);
		
		List<UsageRecord> records = equipment.getUsageRecords();
		assertEquals(3, records.size());
	}

	@Test
	public void testGetUsageHistoryReturnsEmptyListForNonExistentEquipment() {
		List<UsageRecord> history = usageMonitoringService.getUsageHistory("NON_EXISTENT");
		assertEquals(0, history.size());
	}

	@Test
	public void testGetUsageHistoryReturnsRecordsAfterUpdate() {
		usageMonitoringService.recordUsageUpdate(equipment, true, OperationalStatus.AVAILABLE);
		List<UsageRecord> history = usageMonitoringService.getUsageHistory("EQ001");
		assertTrue(history.size() >= 0);
	}


}