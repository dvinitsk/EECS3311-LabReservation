package com.yorku.lab.model;

import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;

public class LabCoordinator extends User {

	public LabCoordinator(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
		this.affiliation = AffiliationType.UNIVERSITY;
	}

	@Override
	public UserType getType() { return UserType.LABCOORDINATOR; }
}
