package com.yorku.lab.model;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;

public class Guest extends User {

	public Guest(String userId, String fullName, Credentials credentials) {
		super(userId, fullName, credentials);
        this.affiliation = AffiliationType.GUEST;
        this.status=AccountStatus.ACTIVE;//Req 1
	}

}
