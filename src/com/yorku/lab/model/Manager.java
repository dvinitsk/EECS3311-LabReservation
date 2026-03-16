package com.yorku.lab.model;

import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.OperationalStatus;

public class Manager extends User {

	public Manager(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
        this.affiliation = AffiliationType.UNIVERSITY;
	}
	
	public void addEquipment(String id, String description, String location) {
        //  add later
    }

    public void enableEquipment(Equipment equipment) {
        equipment.setOperationalStatus(OperationalStatus.AVAILABLE);
    }

    public void disableEquipment(Equipment equipment) {
        equipment.setOperationalStatus(OperationalStatus.DISABLED);
    }

    public void markMaintenance(Equipment equipment) {
        equipment.setOperationalStatus(OperationalStatus.MAINTENANCE);
    }


}
