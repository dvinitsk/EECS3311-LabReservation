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
	
}
