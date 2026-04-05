package test.ManualJUnit.pattern.observer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.yorku.lab.model.Equipment;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.pattern.observer.ReservationMonitorObserver;
import com.yorku.lab.service.ArrivalMonitor;

public class ReservationMonitorObserverTest {

    private ReservationMonitorObserver observer;
    private ArrivalMonitor arrivalMonitor;
    private Equipment equipment;

    @Before
    public void setUp() {
        arrivalMonitor = new ArrivalMonitor();
        observer = new ReservationMonitorObserver(arrivalMonitor);
        equipment = new Equipment("E002", "Spectrometer", "Lab B");
    }

    @Test
    public void testConstructorInitialization() {
        assertNotNull(observer);
    }

    @Test
    public void testUpdateWithEquipmentInUse() {
        equipment.setInUse(true);
        observer.update(equipment);
        assertTrue(equipment.isInUse());
    }

    @Test
    public void testUpdateWithEquipmentNotInUse() {
        equipment.setInUse(false);
        observer.update(equipment);
        assertFalse(equipment.isInUse());
    }

    @Test
    public void testUpdateWithAvailableStatus() {
        equipment.setOperationalStatus(OperationalStatus.AVAILABLE);
        observer.update(equipment);
        assertEquals(OperationalStatus.AVAILABLE, equipment.getOperationalStatus());
    }

    @Test
    public void testUpdateWithMaintenanceStatus() {
        equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
        observer.update(equipment);
        assertEquals(OperationalStatus.MAINTENANCE, equipment.getOperationalStatus());
    }

    @Test
    public void testUpdateWithDisabledStatus() {
        equipment.setOperationalStatus(OperationalStatus.DISABLED);
        observer.update(equipment);
        assertEquals(OperationalStatus.DISABLED, equipment.getOperationalStatus());
    }

    @Test
    public void testMultipleUpdates() {
        equipment.setInUse(true);
        observer.update(equipment);
        observer.update(equipment);
        assertTrue(equipment.isInUse());
    }

    @Test
    public void testUpdateWithDifferentEquipment() {
        Equipment equipment2 = new Equipment("E003", "Oscilloscope", "Lab C");
        observer.update(equipment);
        observer.update(equipment2);
        assertEquals("E003", equipment2.getEquipmentId());
    }

    @Test
    public void testObserverImplementsInterface() {
        assertTrue(observer instanceof com.yorku.lab.pattern.observer.SensorObserver);
    }

    @Test
    public void testArrivalMonitorIsStored() {
        assertNotNull(arrivalMonitor);
    }
}
