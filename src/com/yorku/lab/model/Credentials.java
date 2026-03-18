package com.yorku.lab.model;

public class Credentials {

	private String email;
	private String passwordHash;
	
	public Credentials(String email,String passwordHash) {
		this.email=email;
		this.passwordHash=passwordHash;
	}
	
	public boolean verifyPassword(String rawPassword) {
		if (passwordHash == null || rawPassword == null) return false;
		return passwordHash.trim().equals(rawPassword.trim());
	}
	
	public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
	
}
