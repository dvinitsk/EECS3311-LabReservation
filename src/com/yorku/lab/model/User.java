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
	
	public User(String userId, String fullName, Credentials credentials) {
		this.userId = userId;
		this.fullName = fullName;
		this.credentials = credentials;
		this.isActive = true;
	}
	
	public User(String userId, String fullName, Credentials credentials, String idOrCertificationNumber) {
		this(userId, fullName, credentials);
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

	public abstract UserType getType();
}
