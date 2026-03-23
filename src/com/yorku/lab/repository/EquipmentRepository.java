package com.yorku.lab.repository;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.model.Equipment;

import java.util.List;
import java.util.Optional;

public class EquipmentRepository extends CsvRepository<Equipment> {

    @Override
    protected String getFileName() { return "equipment.csv"; }

    @Override
    protected String toCsvLine(Equipment eq) {
        return escape(eq.getEquipmentId()) + "|" +
            escape(eq.getDescription()) + "|" +
            escape(eq.getLabLocation()) + "|" +
            escape(eq.getOperationalStatus().name());
    }

    @Override
    protected Equipment fromCsvLine(String line) {
        String[] parts = splitCsv(line);
        if (parts.length < 4) return null;
        Equipment eq = new Equipment(parts[0], parts[1], parts[2]);
        eq.setOperationalStatus(OperationalStatus.valueOf(parts[3]));
        return eq;
    }

    public Optional<Equipment> findById(String equipmentId) {
        return findAll().stream()
            .filter(e -> equipmentId.equals(e.getEquipmentId()))
            .findFirst();
    }

    public void save(Equipment equipment) {
        List<Equipment> all = findAll();
        all.removeIf(e -> e.getEquipmentId().equals(equipment.getEquipmentId()));
        all.add(equipment);
        saveAll(all);
    }

    public void delete(String equipmentId) {
        List<Equipment> all = findAll();
        all.removeIf(e -> e.getEquipmentId().equals(equipmentId));
        saveAll(all);
    }
}
