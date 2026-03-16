package com.yorku.lab.model;

import java.util.ArrayList;
import java.util.List;
import com.yorku.lab.enums.OperationalStatus;

public class Equipment {

	private String equipmentId;
    private String description;
    private String labLocation;
    private OperationalStatus operationalStatus;
    private List<UsageRecord> usageRecords;
    
    public Equipment(String equipmentId, String description, String labLocation) {
        this.equipmentId = equipmentId;
        this.description = description;
        this.labLocation = labLocation;
        this.operationalStatus = OperationalStatus.AVAILABLE;
        this.usageRecords = new ArrayList<>();
    }
    
    public boolean isReservable() {
        return operationalStatus == OperationalStatus.AVAILABLE;
    }

    public void setOperationalStatus(OperationalStatus status) {
        this.operationalStatus = status;
    }

    public void addUsageRecord(UsageRecord record) {
        this.usageRecords.add(record);
    }

    public String getEquipmentId() { return equipmentId; }
    public String getDescription() { return description; }
    public String getLabLocation() { return labLocation; }
    public OperationalStatus getOperationalStatus() { return operationalStatus; }
    public List<UsageRecord> getUsageRecords() { return usageRecords; }
	
}
