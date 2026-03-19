package com.yorku.lab.repository;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.model.LabCoordinator;
import com.yorku.lab.pattern.factory.UserFactory;
import com.yorku.lab.enums.UserType;

/**
 * Seeds initial data for demo/testing: Lab Coordinator, sample equipment.
 */
public class DataBootstrap {

    public static void runIfNeeded() {
        UserRepository userRepo = RepositoryProvider.getUserRepository();
        EquipmentRepository eqRepo = new EquipmentRepository();

        if (userRepo.findAll().isEmpty()) {
            LabCoordinator coordinator = (LabCoordinator) UserFactory.createUser(
                UserType.LABCOORDINATOR, "coord-1", "Head Lab Coordinator", "coordinator@yorku.ca", "Admin123!");
            coordinator.setStatus(AccountStatus.ACTIVE);
            userRepo.save(coordinator);
        }

        if (eqRepo.findAll().isEmpty()) {
            eqRepo.save(new Equipment("EQ-001", "Microscope", "Lab A"));
            eqRepo.save(new Equipment("EQ-002", "Oscilloscope", "Lab A"));
            eqRepo.save(new Equipment("EQ-003", "3D Printer", "Lab B"));
        }
    }
}
