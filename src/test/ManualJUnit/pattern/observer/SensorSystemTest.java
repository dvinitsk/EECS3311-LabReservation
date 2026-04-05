package test.ManualJUnit.pattern.observer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.yorku.lab.model.Equipment;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.pattern.observer.SensorSystem;
import com.yorku.lab.pattern.observer.SensorObserver;

public class SensorSystemTest {

    private SensorSystem sensorSystem;
    private Equipment equipment;
    private MockObserver mockObserver;

    @Before
    public void setUp() {
        sensorSystem = new SensorSystem();
        equipment = new Equipment("E001", "Microscope", "Lab A");
        mockObserver = new MockObserver();
    }

    @Test
    public void testAttachObserver() {
        sensorSystem.attach(mockObserver);
        assertTrue(true);
    }

    @Test
    public void testDetachObserver() {
        sensorSystem.attach(mockObserver);
        sensorSystem.detach(mockObserver);
        assertTrue(true);
    }

    @Test
    public void testNotifyObserversCallsUpdate() {
        sensorSystem.attach(mockObserver);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertEquals(equipment, mockObserver.getLastUpdatedEquipment());
    }

    @Test
    public void testMultipleObserversNotified() {
        MockObserver observer1 = new MockObserver();
        MockObserver observer2 = new MockObserver();
        sensorSystem.attach(observer1);
        sensorSystem.attach(observer2);
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.MAINTENANCE);
        assertEquals(equipment, observer1.getLastUpdatedEquipment());
        assertEquals(equipment, observer2.getLastUpdatedEquipment());
    }

    @Test
    public void testSendUpdateSetsEquipmentInUse() {
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(equipment.isInUse());
    }

    @Test
    public void testSendUpdateSetsEquipmentStatus() {
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.MAINTENANCE);
        assertEquals(OperationalStatus.MAINTENANCE, equipment.getOperationalStatus());
    }

    @Test
    public void testGetCurrentEquipment() {
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertEquals(equipment, sensorSystem.getCurrentEquipment());
    }

    @Test
    public void testGetInUseStatus() {
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(sensorSystem.isInUse());
    }

    @Test
    public void testGetCurrentStatus() {
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.DISABLED);
        assertEquals(OperationalStatus.DISABLED, sensorSystem.getCurrentStatus());
    }

    @Test
    public void testDetachObserverStopsNotification() {
        sensorSystem.attach(mockObserver);
        sensorSystem.detach(mockObserver);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertNull(mockObserver.getLastUpdatedEquipment());
    }

    private static class MockObserver implements SensorObserver {
        private Equipment lastUpdatedEquipment;

        @Override
        public void update(Equipment equipment) {
            this.lastUpdatedEquipment = equipment;
        }

        public Equipment getLastUpdatedEquipment() {
            return lastUpdatedEquipment;
        }
    }
}
