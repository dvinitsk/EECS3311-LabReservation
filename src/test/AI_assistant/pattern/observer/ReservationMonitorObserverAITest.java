package test.AI_assistant.pattern.observer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.pattern.observer.ReservationMonitorObserver;
import com.yorku.lab.service.ArrivalMonitor;

public class ReservationMonitorObserverAITest {

    private ReservationMonitorObserver observer;
    private ArrivalMonitor arrivalMonitor;
    private Equipment equipment;

    @Before
    public void setUp() {
        arrivalMonitor = new ArrivalMonitor();
        observer = new ReservationMonitorObserver(arrivalMonitor);
        equipment = new Equipment("EQ-AI-3", "Printer", "Lab C");
    }

    @Test
    public void testObserverConstructsSuccessfully() {
        assertNotNull(observer);
    }

    @Test
    public void testUpdateWithInUseTrueDoesNotThrow() {
        equipment.setInUse(true);
        observer.update(equipment);
        assertTrue(equipment.isInUse());
    }

    @Test
    public void testUpdateWithInUseFalseDoesNotThrow() {
        equipment.setInUse(false);
        observer.update(equipment);
        assertFalse(equipment.isInUse());
    }

    @Test
    public void testUpdateWithAvailableStatusDoesNotChangeStatus() {
        equipment.setOperationalStatus(OperationalStatus.AVAILABLE);
        observer.update(equipment);
        assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
    }

    @Test
    public void testUpdateWithMaintenanceStatusDoesNotChangeStatus() {
        equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
        observer.update(equipment);
        assertEquals(OperationalStatus.MAINTENANCE, equipment.getOperationalStatus());
    }

    @Test
    public void testUpdateWithDisabledStatusDoesNotChangeStatus() {
        equipment.setOperationalStatus(OperationalStatus.DISABLED);
        observer.update(equipment);
        assertEquals(OperationalStatus.DISABLED, equipment.getOperationalStatus());
    }

    @Test
    public void testMultipleUpdatesStillSucceed() {
        observer.update(equipment);
        observer.update(equipment);
        assertNotNull(observer);
    }

    @Test
    public void testUpdateHandlesEquipmentObject() {
        observer.update(equipment);
        assertEquals("EQ-AI-3", equipment.getEquipmentId());
    }

    @Test
    public void testUpdateLeavesDescriptionUnchanged() {
        observer.update(equipment);
        assertEquals("Printer", equipment.getDescription());
    }

    @Test
    public void testUpdateLeavesLocationUnchanged() {
        observer.update(equipment);
        assertEquals("Lab C", equipment.getLabLocation());
    }
}
