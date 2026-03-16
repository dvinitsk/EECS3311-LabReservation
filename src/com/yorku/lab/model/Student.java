package com.yorku.lab.model;

import com.yorku.lab.enums.*;

public class Student extends User {

	public Student(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
        this.affiliation = AffiliationType.UNIVERSITY;
	}

}
