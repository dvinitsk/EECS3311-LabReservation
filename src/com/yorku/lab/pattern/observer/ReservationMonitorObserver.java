package com.yorku.lab.pattern.observer;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.service.ArrivalMonitor;

public class ReservationMonitorObserver implements SensorObserver{

	private ArrivalMonitor arrivalMonitor;

    public ReservationMonitorObserver(ArrivalMonitor arrivalMonitor) {
        this.arrivalMonitor = arrivalMonitor;
    }

    @Override
    public void onSensorUpdate(Equipment equipment, boolean inUse, OperationalStatus status) {
        if (inUse) {
            //Arrival Monitor
        }
    }
	
}
