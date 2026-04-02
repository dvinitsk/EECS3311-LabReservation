package com.yorku.lab.pattern.observer;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.service.UsageMonitoringService;
import com.yorku.lab.model.UsageRecord;

public class UsageMonitoringObserver implements SensorObserver {

    private UsageMonitoringService usageMonitoringService;

    public UsageMonitoringObserver(UsageMonitoringService usageMonitoringService) {
        this.usageMonitoringService = usageMonitoringService;
    }
    
    public UsageRecord recordUsage(Equipment equipment){
        UsageRecord record = new UsageRecord(
                java.util.UUID.randomUUID().toString(),
                equipment,
                java.time.LocalDateTime.now(),
                equipment.isInUse(),
                equipment.getOperationalStatus()
        );
        equipment.addUsageRecord(record);
        return record;
    }

    @Override
    public void update(Equipment equipment) {
        usageMonitoringService.recordUsageUpdate(equipment, equipment.isInUse(), equipment.getOperationalStatus());
    }
}
