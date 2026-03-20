package com.yorku.lab.model;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.AffiliationType;
import com.yorku.lab.enums.UserType;

public abstract class User {
	
	protected String userId;
	protected String fullName;
	protected Credentials credentials;
	protected AccountStatus status;
	protected double hourlyRate;
	protected AffiliationType affiliation;
	protected String idOrCertificationNumber;
	protected boolean isActive;
	protected double funds;
	
	public User(String userId, String fullName, Credentials credentials, double funds) {
		this.userId = userId;
		this.fullName = fullName;
		this.credentials = credentials;
		this.isActive = true;
		this.funds = funds;
	}
	
	public User(String userId, String fullName, Credentials credentials, String idOrCertificationNumber, double funds) {
		this(userId, fullName, credentials,funds);
		this.idOrCertificationNumber = idOrCertificationNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public AffiliationType getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(AffiliationType affiliation) {
		this.affiliation = affiliation;
	}

	public String getIdOrCertificationNumber() {
		return idOrCertificationNumber;
	}

	public void setIdOrCertificationNumber(String idOrCertificationNumber) {
		this.idOrCertificationNumber = idOrCertificationNumber;
	}

	public double getFunds() {
		return funds;
	}

	public void setFunds(double funds) {
		this.funds = funds;
	}

	public abstract UserType getType();
}
