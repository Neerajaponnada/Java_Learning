package com.wellsfargo.batch7.group3.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="KYC_DETAILS")
public class KycDetails{

	@Id
	@Column(name="REG_ID")
	@GeneratedValue
	private Integer regId;
	
	@Column(name="FIRST_NAME")
	private String firstname; 
	
	@Column(name="LAST_NAME")
	private String lastname;
	
	@Column(name="GENDER")
	private String Gender;

	@Column(name="DOB")
	private LocalDate dateOfBirth;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="MOBILE_NUM")
	private String mobileNum;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="PINCODE")
	private Integer pinCode;
	
	@Column(name="TYPE_OF_ACCT_HOLDER")
	private String typeOfAcctHolder;
	
	@Column(name="CUST_ACCT_TYPE")
	private String custAcctType; 
	
	@Column(name="KYC_IDENTITY_PROOF")
	private String kycIdentityType; 
	
	@Column(name="KYC_UPLOAD_IND")
	private char kycUploadInd; 
	
	@Column(name="ADMIN_COMMENTS_KYC")
	private String adminCommentsKYC;
	
	@Column(name="KYC_APPROVAL_STATUS")
	private String kycApprovalStatus;

	
	
	public KycDetails() {
		super();
	}



	public KycDetails(Integer regId, String firstname, String lastname, String gender, LocalDate dateOfBirth,
			String emailId, String mobileNum, String address, String city, Integer pinCode, String typeOfAcctHolder,
			String custAcctType, String kycIdentityType, char kycUploadInd, String adminCommentsKYC,
			String kycApprovalStatus) {
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
		this.kycApprovalStatus = kycApprovalStatus;
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



	public String getKycApprovalStatus() {
		return kycApprovalStatus;
	}



	public void setKycApprovalStatus(String kycApprovalStatus) {
		this.kycApprovalStatus = kycApprovalStatus;
	}
	
	
	
}
