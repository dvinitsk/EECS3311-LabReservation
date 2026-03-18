package com.yorku.lab.model;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;

public class Researcher extends User {

	public Researcher(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
		this.hourlyRate = 20.0;
		this.affiliation = AffiliationType.UNIVERSITY;
		this.status = AccountStatus.PENDING_APPROVAL;
	}

	public Researcher(String userId, String fullName, Credentials credentials, String idOrCertificationNumber) {
		super(userId, fullName, credentials, idOrCertificationNumber);
		this.hourlyRate = 20.0;
		this.affiliation = AffiliationType.UNIVERSITY;
		this.status = AccountStatus.PENDING_APPROVAL;
	}

	@Override
	public UserType getType() { return UserType.RESEARCHER; }
}
