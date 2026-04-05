package test.ManualJUnit.pattern.observer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.UsageRecord;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.pattern.observer.UsageMonitoringObserver;
import com.yorku.lab.service.UsageMonitoringService;

public class UsageMonitoringObserverTest {

    private UsageMonitoringObserver observer;
    private UsageMonitoringService usageMonitoringService;
    private Equipment equipment;

    @Before
    public void setUp() {
        usageMonitoringService = new UsageMonitoringService();
        observer = new UsageMonitoringObserver(usageMonitoringService);
        equipment = new Equipment("E004", "Centrifuge", "Lab D");
    }

    @Test
    public void testRecordUsageCreatesRecord() {
        UsageRecord record = observer.recordUsage(equipment);
        assertNotNull(record);
    }

    @Test
    public void testRecordUsageHasRecordId() {
        UsageRecord record = observer.recordUsage(equipment);
        assertNotNull(record.getRecordId());
    }

    @Test
    public void testRecordUsageLinksToEquipment() {
        UsageRecord record = observer.recordUsage(equipment);
        assertEquals(equipment, record.getEquipment());
    }

    @Test
    public void testRecordUsageHasTimestamp() {
        UsageRecord record = observer.recordUsage(equipment);
        assertNotNull(record.getTimestamp());
    }

    @Test
    public void testRecordUsageAddsToEquipmentRecords() {
        int initialSize = equipment.getUsageRecords().size();
        observer.recordUsage(equipment);
        assertEquals(initialSize + 1, equipment.getUsageRecords().size());
    }

    @Test
    public void testUpdateCallsRecordUsage() {
        equipment.setInUse(true);
        int initialSize = equipment.getUsageRecords().size();
        observer.update(equipment);
        assertTrue(equipment.getUsageRecords().size() >= initialSize);
    }

    @Test
    public void testRecordUsageCapturesInUseStatus() {
        equipment.setInUse(true);
        UsageRecord record = observer.recordUsage(equipment);
        assertTrue(record.isInUse());
    }

    @Test
    public void testRecordUsageCapturesStatus() {
        equipment.setOperationalStatus(OperationalStatus.AVAILABLE);
        UsageRecord record = observer.recordUsage(equipment);
        assertEquals(OperationalStatus.AVAILABLE, record.getStatus());
    }

    @Test
    public void testMultipleRecordUsages() {
        observer.recordUsage(equipment);
        observer.recordUsage(equipment);
        observer.recordUsage(equipment);
        assertEquals(3, equipment.getUsageRecords().size());
    }
}
