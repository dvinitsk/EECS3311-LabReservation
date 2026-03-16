package com.yorku.lab.model;

public class Credentials {

	private String email;
	private String passwordHash;
	
	public Credentials(String email,String passwordHash) {
		this.email=email;
		this.passwordHash=passwordHash;
	}
	
	public boolean verifyPassword(String rawPassword) {
		return passwordHash.equals(rawPassword);//replace with proper implementation
	}
	
}
