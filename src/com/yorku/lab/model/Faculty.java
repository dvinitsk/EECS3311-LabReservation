package com.yorku.lab.model;

import com.yorku.lab.enums.AffiliationType;

public class Faculty extends User {

	public Faculty(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
        this.affiliation = AffiliationType.UNIVERSITY;
	}

}
