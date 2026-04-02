package com.yorku.lab.model;

import java.util.ArrayList;
import java.util.List;
import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.pattern.observer.SensorSubject;
import com.yorku.lab.pattern.observer.SensorObserver;

public class Equipment implements SensorSubject {

	private String equipmentId;
    private String description;
    private String labLocation;
    private OperationalStatus operationalStatus;
    private List<UsageRecord> usageRecords;
    private boolean inUse;
    private List<SensorObserver> observers;
    
    public Equipment(String equipmentId, String description, String labLocation) {
        this.equipmentId = equipmentId;
        this.description = description;
        this.labLocation = labLocation;
        this.operationalStatus = OperationalStatus.AVAILABLE;
        this.usageRecords = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(SensorObserver observer){
        observers.add(observer);
    }

    @Override
    public void detach(SensorObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(SensorObserver observer : observers){
            observer.update(this);
        }
    }
    
    public boolean isReservable() {
        return operationalStatus == OperationalStatus.AVAILABLE;
    }

    public void setOperationalStatus(OperationalStatus status) {
        this.operationalStatus = status;
    }

    public void setInUse(boolean inUse) { 
        this.inUse = inUse; 
    }

    public void addUsageRecord(UsageRecord record) {
        this.usageRecords.add(record);
    }

    public String getEquipmentId() { return equipmentId; }
    public String getDescription() { return description; }
    public String getLabLocation() { return labLocation; }
    public OperationalStatus getOperationalStatus() { return operationalStatus; }
    public List<UsageRecord> getUsageRecords() { return usageRecords; }
    public boolean isInUse() { return inUse; }


    @Override
    public String toString() {
        return equipmentId + " - " + description + " (" + labLocation + ")";
    }
}
