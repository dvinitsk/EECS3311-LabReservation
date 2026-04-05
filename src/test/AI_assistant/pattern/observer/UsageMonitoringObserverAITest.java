package test.AI_assistant.pattern.observer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.UsageRecord;
import com.yorku.lab.pattern.observer.UsageMonitoringObserver;
import com.yorku.lab.service.UsageMonitoringService;

public class UsageMonitoringObserverAITest {

    private UsageMonitoringObserver observer;
    private UsageMonitoringService service;
    private Equipment equipment;

    @Before
    public void setUp() {
        service = new UsageMonitoringService();
        observer = new UsageMonitoringObserver(service);
        equipment = new Equipment("EQ-AI-2", "Oscilloscope", "Lab B");
    }

    @Test
    public void testRecordUsageReturnsRecord() {
        UsageRecord record = observer.recordUsage(equipment);
        assertNotNull(record);
    }

    @Test
    public void testRecordUsagePreservesEquipment() {
        UsageRecord record = observer.recordUsage(equipment);
        assertEquals(equipment, record.getEquipment());
    }

    @Test
    public void testRecordUsageAddsRecordToEquipment() {
        observer.recordUsage(equipment);
        assertEquals(1, equipment.getUsageRecords().size());
    }

    @Test
    public void testRecordUsageCreatesNonNullId() {
        UsageRecord record = observer.recordUsage(equipment);
        assertNotNull(record.getRecordId());
    }

    @Test
    public void testRecordUsageCopiesInUseFlag() {
        equipment.setInUse(true);
        UsageRecord record = observer.recordUsage(equipment);
        assertTrue(record.isInUse());
    }

    @Test
    public void testRecordUsageCopiesStatus() {
        equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
        UsageRecord record = observer.recordUsage(equipment);
        assertEquals(OperationalStatus.MAINTENANCE, record.getStatus());
    }

    @Test
    public void testUpdateAddsUsageRecord() {
        observer.update(equipment);
        assertEquals(1, equipment.getUsageRecords().size());
    }

    @Test
    public void testUpdateUsesCurrentInUseValue() {
        equipment.setInUse(true);
        observer.update(equipment);
        assertTrue(equipment.getUsageRecords().get(0).isInUse());
    }

    @Test
    public void testUpdateUsesCurrentStatusValue() {
        equipment.setOperationalStatus(OperationalStatus.DISABLED);
        observer.update(equipment);
        assertEquals(OperationalStatus.DISABLED, equipment.getUsageRecords().get(0).getStatus());
    }

    @Test
    public void testMultipleUpdatesCreateMultipleRecords() {
        observer.update(equipment);
        observer.update(equipment);
        assertEquals(2, equipment.getUsageRecords().size());
    }
}
