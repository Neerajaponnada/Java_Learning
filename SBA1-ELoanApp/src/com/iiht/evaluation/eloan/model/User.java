package com.iiht.evaluation.eloan.model;

import java.time.LocalDate;

public class User {
	
	private String fullname; 
	private String Gender;
	private LocalDate dateOfBirth;
	private String emailId;
	
	private String username;
	private String password;
	
	
	public User() {
		
	}

	public User(String fullname, String gender, LocalDate dateOfBirth, String emailId, String username, String password) {
	super();
	this.fullname = fullname;
	Gender = gender;
	this.dateOfBirth = dateOfBirth;
	this.emailId = emailId;
	this.username = username;
	this.password = password;
}




	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
