package test.AI_assistant.pattern.observer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.pattern.observer.SensorObserver;
import com.yorku.lab.pattern.observer.SensorSystem;

public class SensorSystemAITest {

    private SensorSystem sensorSystem;
    private Equipment equipment;

    @Before
    public void setUp() {
        sensorSystem = new SensorSystem();
        equipment = new Equipment("EQ-AI-1", "Microscope", "Lab A");
    }

    @Test
    public void testCurrentEquipmentStartsNull() {
        assertNull(sensorSystem.getCurrentEquipment());
    }

    @Test
    public void testInitialInUseIsFalse() {
        assertFalse(sensorSystem.isInUse());
    }

    @Test
    public void testAttachObserverDoesNotThrow() {
        sensorSystem.attach(new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
            }
        });
        assertNotNull(sensorSystem);
    }

    @Test
    public void testDetachObserverDoesNotThrow() {
        SensorObserver observer = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
            }
        };
        sensorSystem.attach(observer);
        sensorSystem.detach(observer);
        assertNotNull(sensorSystem);
    }

    @Test
    public void testSendUpdateStoresCurrentEquipment() {
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertEquals(equipment, sensorSystem.getCurrentEquipment());
    }

    @Test
    public void testSendUpdateStoresInUseValue() {
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(sensorSystem.isInUse());
    }

    @Test
    public void testSendUpdateStoresOperationalStatus() {
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.MAINTENANCE);
        assertEquals(OperationalStatus.MAINTENANCE, sensorSystem.getCurrentStatus());
    }

    @Test
    public void testSendUpdateMutatesEquipmentInUse() {
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(equipment.isInUse());
    }

    @Test
    public void testSendUpdateMutatesEquipmentStatus() {
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.DISABLED);
        assertEquals(OperationalStatus.DISABLED, equipment.getOperationalStatus());
    }

    @Test
    public void testNotifyObserverIsTriggered() {
        final boolean[] updated = {false};
        sensorSystem.attach(new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                updated[0] = true;
            }
        });

        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(updated[0]);
    }
}
