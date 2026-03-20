package com.yorku.lab.model;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;

public class Faculty extends User {

	public Faculty(String userId, String fullName, Credentials credentials, double funds) {
		super(userId, fullName, credentials, funds);
		this.affiliation = AffiliationType.UNIVERSITY;
		this.status = AccountStatus.PENDING_APPROVAL;
	}

	public Faculty(String userId, String fullName, Credentials credentials, String idOrCertificationNumber, double funds) {
		super(userId, fullName, credentials, idOrCertificationNumber, funds);
		this.affiliation = AffiliationType.UNIVERSITY;
		this.status = AccountStatus.PENDING_APPROVAL;
	}

	@Override
	public UserType getType() { return UserType.FACULTY; }
}
