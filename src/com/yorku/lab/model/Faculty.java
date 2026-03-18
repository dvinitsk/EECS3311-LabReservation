package com.yorku.lab.model;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;

public class Faculty extends User {

	public Faculty(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
		this.affiliation = AffiliationType.UNIVERSITY;
		this.status = AccountStatus.PENDING_APPROVAL;
	}

	public Faculty(String userId, String fullName, Credentials credentials, String idOrCertificationNumber) {
		super(userId, fullName, credentials, idOrCertificationNumber);
		this.affiliation = AffiliationType.UNIVERSITY;
		this.status = AccountStatus.PENDING_APPROVAL;
	}

	@Override
	public UserType getType() { return UserType.FACULTY; }
}
