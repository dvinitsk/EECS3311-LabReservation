package com.yorku.lab.model;

import com.yorku.lab.enums.AffiliationType;

public class Manager extends User {

	public Manager(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
        this.affiliation = AffiliationType.UNIVERSITY;
	}

}
