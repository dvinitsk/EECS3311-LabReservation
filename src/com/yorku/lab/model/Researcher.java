package com.yorku.lab.model;

import com.yorku.lab.enums.AffiliationType;

public class Researcher extends User {

	public Researcher(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
		this.hourlyRate = 20.0;
        this.affiliation = AffiliationType.UNIVERSITY;
	}

}
