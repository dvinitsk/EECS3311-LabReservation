package com.yorku.lab.model;

import com.yorku.lab.enums.OperationalStatus;
import java.time.LocalDateTime;

public class UsageRecord {
    private String recordId;
    private Equipment equipment;
    private LocalDateTime timestamp;
    private boolean inUse;
    private OperationalStatus status;

    public UsageRecord(String recordId, Equipment equipment,LocalDateTime timestamp, boolean inUse, OperationalStatus status) {
        this.recordId = recordId;
        this.equipment = equipment;
        this.timestamp = timestamp;
        this.inUse = inUse;
        this.status = status;
    }

    public String getRecordId() { return recordId; }
    public Equipment getEquipment() { return equipment; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public boolean isInUse() { return inUse; }
    public OperationalStatus getStatus() { return status; }
}
