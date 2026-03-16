package com.yorku.lab.pattern.observer;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;

import java.util.ArrayList;
import java.util.List;

public class SensorSystem implements SensorSubject {

    private List<SensorObserver> observers;
    private Equipment currentEquipment;
    private boolean inUse;
    private OperationalStatus currentStatus;

    public SensorSystem() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(SensorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(SensorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (SensorObserver observer : observers) {
            observer.onSensorUpdate(currentEquipment, inUse, currentStatus);
        }
    }

    public void sendUpdate(Equipment equipment, boolean inUse, OperationalStatus status) {
        this.currentEquipment = equipment;
        this.inUse = inUse;
        this.currentStatus = status;
        notifyObservers();
    }

    public Equipment getCurrentEquipment() { return currentEquipment; }
    public boolean isInUse() { return inUse; }
    public OperationalStatus getCurrentStatus() { return currentStatus; }
}
