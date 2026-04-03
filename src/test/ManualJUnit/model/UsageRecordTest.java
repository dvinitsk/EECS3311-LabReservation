package test.ManualJUnit.model;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.*;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.*;

public class UsageRecordTest {

	private UsageRecord record1;
	private UsageRecord record2;
	private UsageRecord record3;
	private Equipment equipment1;
	private Equipment equipment2;
	private LocalDateTime timestamp1;
	private LocalDateTime timestamp2;

	@Before
	public void setUp() {
		timestamp1 = LocalDateTime.of(2026, 4, 2, 10, 30, 0);
		timestamp2 = LocalDateTime.of(2026, 4, 2, 14, 45, 30);
		equipment1 = new Equipment("EQ001", "Microscope", "Lab A");
		equipment2 = new Equipment("EQ002", "Centrifuge", "Lab B");
	}

	@Test
	public void testUsageRecordCreationWithValidParameters() {
		record1 = new UsageRecord("REC001", equipment1, timestamp1, false, OperationalStatus.AVAILABLE);
		assertNotNull(record1);
		assertEquals("REC001", record1.getRecordId());
		assertEquals(equipment1, record1.getEquipment());
		assertEquals(timestamp1, record1.getTimestamp());
		assertFalse(record1.isInUse());
		assertEquals(OperationalStatus.AVAILABLE, record1.getStatus());
	}

	@Test
	public void testGetRecordId() {
		record1 = new UsageRecord("REC002", equipment1, timestamp1, true, OperationalStatus.AVAILABLE);
		assertEquals("REC002", record1.getRecordId());
	}

	@Test
	public void testGetEquipment() {
		record1 = new UsageRecord("REC003", equipment2, timestamp2, false, OperationalStatus.MAINTENANCE);
		assertEquals(equipment2, record1.getEquipment());
		assertEquals("EQ002", record1.getEquipment().getEquipmentId());
	}

	@Test
	public void testGetTimestamp() {
		record1 = new UsageRecord("REC004", equipment1, timestamp1, true, OperationalStatus.AVAILABLE);
		assertEquals(timestamp1, record1.getTimestamp());
	}

	@Test
	public void testIsInUseTrue() {
		record1 = new UsageRecord("REC005", equipment1, timestamp1, true, OperationalStatus.AVAILABLE);
		assertTrue(record1.isInUse());
	}

	@Test
	public void testIsInUseFalse() {
		record1 = new UsageRecord("REC006", equipment2, timestamp2, false, OperationalStatus.DISABLED);
		assertFalse(record1.isInUse());
	}

	@Test
	public void testGetStatusAvailable() {
		record1 = new UsageRecord("REC007", equipment1, timestamp1, false, OperationalStatus.AVAILABLE);
		assertEquals(OperationalStatus.AVAILABLE, record1.getStatus());
	}

	@Test
	public void testGetStatusMaintenance() {
		record1 = new UsageRecord("REC008", equipment2, timestamp2, true, OperationalStatus.MAINTENANCE);
		assertEquals(OperationalStatus.MAINTENANCE, record1.getStatus());
	}

	@Test
	public void testGetStatusDisabled() {
		record1 = new UsageRecord("REC009", equipment1, timestamp1, false, OperationalStatus.DISABLED);
		assertEquals(OperationalStatus.DISABLED, record1.getStatus());
	}

	@Test
	public void testMultipleEquipmentRecords() {
		record1 = new UsageRecord("REC010", equipment1, timestamp1, true, OperationalStatus.AVAILABLE);
		record2 = new UsageRecord("REC011", equipment2, timestamp2, false, OperationalStatus.MAINTENANCE);
		record3 = new UsageRecord("REC012", equipment1, timestamp1, true, OperationalStatus.DISABLED);
		
		assertNotEquals(record1.getRecordId(), record2.getRecordId());
		assertNotEquals(record1.getEquipment(), record2.getEquipment());
		assertEquals(record1.getEquipment(), record3.getEquipment());
		assertNotEquals(record1.getStatus(), record2.getStatus());
	}

}
