package com.yorku.lab.service;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.UsageRecord;
import com.yorku.lab.repository.EquipmentRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * UC9: Track equipment usage & status from sensor updates.
 */
public class UsageMonitoringService {

    private final EquipmentRepository equipmentRepository = new EquipmentRepository();

    public void recordUsageUpdate(Equipment equipment, boolean inUse, OperationalStatus status) {
        equipment.setOperationalStatus(status);
        UsageRecord record = new UsageRecord(
            UUID.randomUUID().toString(),
            equipment,
            LocalDateTime.now(),
            inUse,
            status
        );
        equipment.addUsageRecord(record);
        equipmentRepository.save(equipment);
    }

    public List<UsageRecord> getUsageHistory(String equipmentId) {
        return equipmentRepository.findById(equipmentId)
            .map(Equipment::getUsageRecords)
            .orElse(List.of());
    }

    public void notifyCoordinatorIfNeeded(Equipment equipment, OperationalStatus status) {
        if (status == OperationalStatus.MAINTENANCE || status == OperationalStatus.DISABLED) {
            // In a full implementation, would send notification to Lab Coordinator
            System.out.println("[UsageMonitor] Alert: Equipment " + equipment.getEquipmentId() + " status: " + status);
        }
    }
}
