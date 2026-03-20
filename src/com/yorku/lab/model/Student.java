package com.yorku.lab.model;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;

public class Student extends User {

	public Student(String userId, String fullName, Credentials credentials, double funds) {
		super(userId, fullName, credentials, funds);
		this.affiliation = AffiliationType.UNIVERSITY;
		this.status = AccountStatus.PENDING_APPROVAL;
	}

	public Student(String userId, String fullName, Credentials credentials, String idOrCertificationNumber, double funds) {
		super(userId, fullName, credentials, idOrCertificationNumber, funds);
		this.affiliation = AffiliationType.UNIVERSITY;
		this.status = AccountStatus.PENDING_APPROVAL;
	}

	@Override
	public UserType getType() { return UserType.STUDENT; }
}
