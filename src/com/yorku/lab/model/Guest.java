package com.yorku.lab.model;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;

public class Guest extends User {

	public Guest(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
		this.affiliation = AffiliationType.GUEST;
		this.status = AccountStatus.ACTIVE;
	}

	public Guest(String userId, String fullName, Credentials credentials, String idOrCertificationNumber) {
		super(userId, fullName, credentials, idOrCertificationNumber);
		this.affiliation = AffiliationType.GUEST;
		this.status = AccountStatus.ACTIVE;
	}

	@Override
	public UserType getType() { return UserType.GUEST; }
}
