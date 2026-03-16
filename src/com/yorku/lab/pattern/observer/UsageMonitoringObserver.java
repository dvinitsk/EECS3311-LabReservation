package com.yorku.lab.pattern.observer;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.service.UsageMonitoringService;

public class UsageMonitoringObserver implements SensorObserver {

    private UsageMonitoringService usageMonitoringService;

    public UsageMonitoringObserver(UsageMonitoringService usageMonitoringService) {
        this.usageMonitoringService = usageMonitoringService;
    }

    @Override
    public void onSensorUpdate(Equipment equipment, boolean inUse, OperationalStatus status) {
        //Usage Monitor Service
    }
}
