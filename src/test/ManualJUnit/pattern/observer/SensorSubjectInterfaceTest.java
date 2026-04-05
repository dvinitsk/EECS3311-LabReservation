package test.ManualJUnit.pattern.observer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.yorku.lab.model.Equipment;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.pattern.observer.SensorSubject;
import com.yorku.lab.pattern.observer.SensorObserver;
import com.yorku.lab.pattern.observer.SensorSystem;

public class SensorSubjectInterfaceTest {

    private SensorSubject sensorSubject;
    private Equipment equipment;
    private MockObserver mockObserver;

    @Before
    public void setUp() {
        sensorSubject = new SensorSystem();
        equipment = new Equipment("E006", "pH Meter", "Lab F");
        mockObserver = new MockObserver();
    }

    @Test
    public void testAttachMethodExists() {
        sensorSubject.attach(mockObserver);
        assertTrue(true);
    }

    @Test
    public void testDetachMethodExists() {
        sensorSubject.attach(mockObserver);
        sensorSubject.detach(mockObserver);
        assertTrue(true);
    }

    @Test
    public void testNotifyObserversMethodExists() {
        sensorSubject.notifyObservers();
        assertTrue(true);
    }

    @Test
    public void testAttachAndNotify() {
        sensorSubject.attach(mockObserver);
        SensorSystem system = (SensorSystem) sensorSubject;
        system.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertNotNull(mockObserver.getLastEquipment());
    }

    @Test
    public void testDetachPreventsNotification() {
        sensorSubject.attach(mockObserver);
        sensorSubject.detach(mockObserver);
        SensorSystem system = (SensorSystem) sensorSubject;
        system.sendUpdate(equipment, false, OperationalStatus.AVAILABLE);
        assertNull(mockObserver.getLastEquipment());
    }

    @Test
    public void testMultipleAttachCalls() {
        MockObserver observer2 = new MockObserver();
        sensorSubject.attach(mockObserver);
        sensorSubject.attach(observer2);
        SensorSystem system = (SensorSystem) sensorSubject;
        system.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertNotNull(mockObserver.getLastEquipment());
        assertNotNull(observer2.getLastEquipment());
    }

    @Test
    public void testMultipleDetachCalls() {
        MockObserver observer2 = new MockObserver();
        sensorSubject.attach(mockObserver);
        sensorSubject.attach(observer2);
        sensorSubject.detach(mockObserver);
        sensorSubject.detach(observer2);
        SensorSystem system = (SensorSystem) sensorSubject;
        system.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertNull(mockObserver.getLastEquipment());
        assertNull(observer2.getLastEquipment());
    }

    @Test
    public void testNotifyObserversWithMultipleAttached() {
        MockObserver observer1 = new MockObserver();
        MockObserver observer2 = new MockObserver();
        MockObserver observer3 = new MockObserver();
        sensorSubject.attach(observer1);
        sensorSubject.attach(observer2);
        sensorSubject.attach(observer3);
        SensorSystem system = (SensorSystem) sensorSubject;
        system.sendUpdate(equipment, false, OperationalStatus.DISABLED);
        assertEquals(equipment, observer1.getLastEquipment());
        assertEquals(equipment, observer2.getLastEquipment());
        assertEquals(equipment, observer3.getLastEquipment());
    }

    @Test
    public void testPartialDetachKeepsOthers() {
        MockObserver observer1 = new MockObserver();
        MockObserver observer2 = new MockObserver();
        sensorSubject.attach(observer1);
        sensorSubject.attach(observer2);
        sensorSubject.detach(observer1);
        SensorSystem system = (SensorSystem) sensorSubject;
        system.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertNull(observer1.getLastEquipment());
        assertNotNull(observer2.getLastEquipment());
    }

    @Test
    public void testReattachAfterDetach() {
        sensorSubject.attach(mockObserver);
        sensorSubject.detach(mockObserver);
        sensorSubject.attach(mockObserver);
        SensorSystem system = (SensorSystem) sensorSubject;
        system.sendUpdate(equipment, true, OperationalStatus.MAINTENANCE);
        assertNotNull(mockObserver.getLastEquipment());
    }

    @Test
    public void testSubjectImplementsInterface() {
        assertTrue(sensorSubject instanceof SensorSubject);
    }

    private static class MockObserver implements SensorObserver {
        private Equipment lastEquipment;

        @Override
        public void update(Equipment equipment) {
            this.lastEquipment = equipment;
        }

        public Equipment getLastEquipment() {
            return lastEquipment;
        }
    }
}
