package com.wellsfargo.batch7.group3.dto;

import java.time.LocalDate;

public class KycDetailsDto{

	private Integer regId;
	private String firstname; 
	private String lastname;
	private String Gender;
	private String dateOfBirth;
	private String emailId;
	private String mobileNum;
	private String address;
	private String city;
	private Integer pinCode;
	private String typeOfAcctHolder;
	private String custAcctType; 
	private String kycIdentityType; 
//	@Column(name="KYC_PROOF_DOC")
//	private  clob kycUploadDoc;
	private char kycUploadInd; 
	private String adminCommentsKYC;
	private String kycApprovalSTatus;

	
	
	public KycDetailsDto() {
		super();
	}



	public KycDetailsDto(Integer regId, String firstname, String lastname, String gender, String dateOfBirth,
			String emailId, String mobileNum, String address, String city, Integer pinCode, String typeOfAcctHolder,
			String custAcctType, String kycIdentityType, char kycUploadInd, String adminCommentsKYC,
			String kycApprovalSTatus) {
		super();
		this.regId = regId;
		this.firstname = firstname;
		this.lastname = lastname;
		Gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.emailId = emailId;
		this.mobileNum = mobileNum;
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.typeOfAcctHolder = typeOfAcctHolder;
		this.custAcctType = custAcctType;
		this.kycIdentityType = kycIdentityType;
		this.kycUploadInd = kycUploadInd;
		this.adminCommentsKYC = adminCommentsKYC;
		this.kycApprovalSTatus = kycApprovalSTatus;
	}



	public Integer getRegId() {
		return regId;
	}



	public void setRegId(Integer regId) {
		this.regId = regId;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getGender() {
		return Gender;
	}



	public void setGender(String gender) {
		Gender = gender;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getMobileNum() {
		return mobileNum;
	}



	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public Integer getPinCode() {
		return pinCode;
	}



	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}



	public String getTypeOfAcctHolder() {
		return typeOfAcctHolder;
	}



	public void setTypeOfAcctHolder(String typeOfAcctHolder) {
		this.typeOfAcctHolder = typeOfAcctHolder;
	}



	public String getCustAcctType() {
		return custAcctType;
	}



	public void setCustAcctType(String custAcctType) {
		this.custAcctType = custAcctType;
	}



	public String getKycIdentityType() {
		return kycIdentityType;
	}



	public void setKycIdentityType(String kycIdentityType) {
		this.kycIdentityType = kycIdentityType;
	}



	public char getKycUploadInd() {
		return kycUploadInd;
	}



	public void setKycUploadInd(char kycUploadInd) {
		this.kycUploadInd = kycUploadInd;
	}



	public String getAdminCommentsKYC() {
		return adminCommentsKYC;
	}



	public void setAdminCommentsKYC(String adminCommentsKYC) {
		this.adminCommentsKYC = adminCommentsKYC;
	}



	public String getKycApprovalSTatus() {
		return kycApprovalSTatus;
	}



	public void setKycApprovalSTatus(String kycApprovalSTatus) {
		this.kycApprovalSTatus = kycApprovalSTatus;
	}
	
	
	
}
