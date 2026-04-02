package com.yorku.lab.pattern.observer;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;

public interface SensorObserver {
	void update(Equipment equipment);
}
