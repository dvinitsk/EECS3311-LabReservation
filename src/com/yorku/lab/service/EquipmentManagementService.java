package com.yorku.lab.service;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.repository.EquipmentRepository;

import java.util.List;
import java.util.Optional;

/**
 * UC10: Manage equipment - add, enable, disable, mark unavailable for maintenance.
 */
public class EquipmentManagementService {

    private final EquipmentRepository equipmentRepository = new EquipmentRepository();

    public Equipment addEquipment(String equipmentId, String description, String labLocation) {
        Equipment equipment = new Equipment(equipmentId, description, labLocation);
        equipmentRepository.save(equipment);
        return equipment;
    }

    public Optional<Equipment> enableEquipment(String equipmentId) {
        return equipmentRepository.findById(equipmentId).map(eq -> {
            eq.setOperationalStatus(OperationalStatus.AVAILABLE);
            equipmentRepository.save(eq);
            return eq;
        });
    }

    public Optional<Equipment> disableEquipment(String equipmentId) {
        return equipmentRepository.findById(equipmentId).map(eq -> {
            eq.setOperationalStatus(OperationalStatus.DISABLED);
            equipmentRepository.save(eq);
            return eq;
        });
    }

    public Optional<Equipment> markMaintenance(String equipmentId) {
        return equipmentRepository.findById(equipmentId).map(eq -> {
            eq.setOperationalStatus(OperationalStatus.MAINTENANCE);
            equipmentRepository.save(eq);
            return eq;
        });
    }

    public List<Equipment> listAllEquipment() {
        return equipmentRepository.findAll();
    }

    public Optional<Equipment> getEquipment(String equipmentId) {
        return equipmentRepository.findById(equipmentId);
    }
}
