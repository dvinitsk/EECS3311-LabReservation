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
    public void testAttachAddsObserverAndNotifiesIt() {
        final boolean[] updated = {false};
        SensorObserver observer = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                updated[0] = true;
            }
        };
        sensorSystem.attach(observer);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(updated[0]);
    }

    @Test
    public void testAttachMultipleObserversAllNotified() {
        final boolean[] observer1Updated = {false};
        final boolean[] observer2Updated = {false};
        
        SensorObserver observer1 = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                observer1Updated[0] = true;
            }
        };
        
        SensorObserver observer2 = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                observer2Updated[0] = true;
            }
        };
        
        sensorSystem.attach(observer1);
        sensorSystem.attach(observer2);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        
        assertTrue(observer1Updated[0]);
        assertTrue(observer2Updated[0]);
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
    public void testDetachRemovesObserverFromNotifications() {
        final boolean[] updated = {false};
        SensorObserver observer = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                updated[0] = true;
            }
        };
        sensorSystem.attach(observer);
        sensorSystem.detach(observer);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertFalse(updated[0]);
    }

    @Test
    public void testDetachSpecificObserverLeavesOthers() {
        final boolean[] observer1Updated = {false};
        final boolean[] observer2Updated = {false};
        
        SensorObserver observer1 = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                observer1Updated[0] = true;
            }
        };
        
        SensorObserver observer2 = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                observer2Updated[0] = true;
            }
        };
        
        sensorSystem.attach(observer1);
        sensorSystem.attach(observer2);
        sensorSystem.detach(observer1);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        
        assertFalse(observer1Updated[0]);
        assertTrue(observer2Updated[0]);
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

    @Test
    public void testNotifyObserversCalledDirectly() {
        final boolean[] updated = {false};
        SensorObserver observer = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                updated[0] = true;
            }
        };
        sensorSystem.attach(observer);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        
        // Reset flag and call notifyObservers directly
        updated[0] = false;
        sensorSystem.notifyObservers();
        assertTrue(updated[0]);
    }

    @Test
    public void testNotifyObserversWithMultipleObservers() {
        final boolean[] observer1Updated = {false};
        final boolean[] observer2Updated = {false};
        final boolean[] observer3Updated = {false};
        
        SensorObserver observer1 = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                observer1Updated[0] = true;
            }
        };
        
        SensorObserver observer2 = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                observer2Updated[0] = true;
            }
        };
        
        SensorObserver observer3 = new SensorObserver() {
            @Override
            public void update(Equipment equipment) {
                observer3Updated[0] = true;
            }
        };
        
        sensorSystem.attach(observer1);
        sensorSystem.attach(observer2);
        sensorSystem.attach(observer3);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        sensorSystem.notifyObservers();
        
        assertTrue(observer1Updated[0]);
        assertTrue(observer2Updated[0]);
        assertTrue(observer3Updated[0]);
    }

    @Test
    public void testNotifyObserversPassesCorrectEquipment() {
        final Equipment[] receivedEquipment = {null};
        SensorObserver observer = new SensorObserver() {
            @Override
            public void update(Equipment eq) {
                receivedEquipment[0] = eq;
            }
        };
        
        sensorSystem.attach(observer);
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        
        assertEquals(equipment, receivedEquipment[0]);
    }

    @Test
    public void testGetCurrentEquipmentReturnsCorrectValue() {
        assertNull(sensorSystem.getCurrentEquipment());
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertEquals(equipment, sensorSystem.getCurrentEquipment());
    }

    @Test
    public void testGetCurrentEquipmentUpdatesAfterMultipleCalls() {
        Equipment equipment2 = new Equipment("EQ-AI-2", "Centrifuge", "Lab B");
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertEquals(equipment, sensorSystem.getCurrentEquipment());
        
        sensorSystem.sendUpdate(equipment2, false, OperationalStatus.MAINTENANCE);
        assertEquals(equipment2, sensorSystem.getCurrentEquipment());
    }

    @Test
    public void testIsInUseReturnsCorrectValue() {
        assertFalse(sensorSystem.isInUse());
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertTrue(sensorSystem.isInUse());
        
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.AVAILABLE);
        assertFalse(sensorSystem.isInUse());
    }

    @Test
    public void testGetCurrentStatusReturnsCorrectValue() {
        assertNull(sensorSystem.getCurrentStatus());
        sensorSystem.sendUpdate(equipment, true, OperationalStatus.AVAILABLE);
        assertEquals(OperationalStatus.AVAILABLE, sensorSystem.getCurrentStatus());
        
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.MAINTENANCE);
        assertEquals(OperationalStatus.MAINTENANCE, sensorSystem.getCurrentStatus());
        
        sensorSystem.sendUpdate(equipment, false, OperationalStatus.DISABLED);
        assertEquals(OperationalStatus.DISABLED, sensorSystem.getCurrentStatus());
    }
}
