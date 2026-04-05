package test.ManualJUnit.pattern.observer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.yorku.lab.model.Equipment;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.pattern.observer.SensorObserver;
import com.yorku.lab.pattern.observer.SensorSystem;

public class SensorObserverInterfaceTest {

    private SensorSystem sensorSystem;
    private Equipment equipment;
    private TestObserver testObserver;

    @Before
    public void setUp() {
        sensorSystem = new SensorSystem();
        equipment = new Equipment("E005", "Thermometer", "Lab E");
        testObserver = new TestObserver();
    }

    @Test
    public void testObserverUpdateMethodCalled() {
        sensorSystem.attach(testObserver);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(testObserver.wasUpdateCalled());
    }

    @Test
    public void testObserverReceivesCorrectEquipment() {
        sensorSystem.attach(testObserver);
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.MAINTENANCE);
        assertEquals(equipment, testObserver.getReceivedEquipment());
    }

    @Test
    public void testMultipleObserversReceiveUpdates() {
        TestObserver observer1 = new TestObserver();
        TestObserver observer2 = new TestObserver();
        sensorSystem.attach(observer1);
        sensorSystem.attach(observer2);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(observer1.wasUpdateCalled());
        assertTrue(observer2.wasUpdateCalled());
    }

    @Test
    public void testObserverNotCalledAfterDetach() {
        sensorSystem.attach(testObserver);
        sensorSystem.detach(testObserver);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertFalse(testObserver.wasUpdateCalled());
    }

    @Test
    public void testObserverWithDifferentStatuses() {
        sensorSystem.attach(testObserver);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertEquals(OperationalStatus.AVAILABLE, testObserver.getReceivedEquipment().getOperationalStatus());
    }

    @Test
    public void testObserverWithInUseTrue() {
        sensorSystem.attach(testObserver);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(testObserver.getReceivedEquipment().isInUse());
    }

    @Test
    public void testObserverWithInUseFalse() {
        sensorSystem.attach(testObserver);
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.AVAILABLE);
        assertFalse(testObserver.getReceivedEquipment().isInUse());
    }

    @Test
    public void testObserverIsInterface() {
        assertTrue(testObserver instanceof SensorObserver);
    }

    @Test
    public void testSequentialUpdatesReceived() {
        sensorSystem.attach(testObserver);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(testObserver.wasUpdateCalled());
        testObserver.reset();
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.MAINTENANCE);
        assertTrue(testObserver.wasUpdateCalled());
    }

    private static class TestObserver implements SensorObserver {
        private Equipment receivedEquipment;
        private boolean updateCalled = false;

        @Override
        public void update(Equipment equipment) {
            this.receivedEquipment = equipment;
            this.updateCalled = true;
        }

        public Equipment getReceivedEquipment() {
            return receivedEquipment;
        }

        public boolean wasUpdateCalled() {
            return updateCalled;
        }

        public void reset() {
            updateCalled = false;
            receivedEquipment = null;
        }
    }
}
