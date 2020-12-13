package com.wellsfargo.batch7.group3.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SERVICE_PROVIDER_ACCT")
public class ServiceProvider{
	
	@Id
	@Column(name="SERVICE_PROVIDER_ID")
	@GeneratedValue
	private Integer serviceProviderId;
	
	@ManyToOne
	@JoinColumn(name="regId")
	private KycDetails svcRegstrId;
	
	@Column(name="SERVICE_PROVIDER_NAME")
	private String serviceProviderName;
	
	@Column(name="BANK_NAME")
	private String bankName;
	
	@Column(name="ACCOUNT_ID")
	private Integer acctId;

	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="IFSC_CODE")
	private String ifscCode;
	
	@Column(name="SVC_START_DATE")
	private LocalDate svcStartDate;
	
	@Column(name="SVC_END_DATE")
	private LocalDate svcEndDate;

	public ServiceProvider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceProvider(Integer serviceProviderId, KycDetails svcRegstrId, String serviceProviderName,
			String bankName, Integer acctId, String branchName, String ifscCode, LocalDate svcStartDate,
			LocalDate svcEndDate) {
		super();
		this.serviceProviderId = serviceProviderId;
		this.svcRegstrId = svcRegstrId;
		this.serviceProviderName = serviceProviderName;
		this.bankName = bankName;
		this.acctId = acctId;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.svcStartDate = svcStartDate;
		this.svcEndDate = svcEndDate;
	}

	public Integer getServiceProviderId() {
		return serviceProviderId;
	}

	public void setServiceProviderId(Integer serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	public KycDetails getSvcRegstrId() {
		return svcRegstrId;
	}

	public void setSvcRegstrId(KycDetails svcRegstrId) {
		this.svcRegstrId = svcRegstrId;
	}

	public String getServiceProviderName() {
		return serviceProviderName;
	}

	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Integer getAcctId() {
		return acctId;
	}

	public void setAcctId(Integer acctId) {
		this.acctId = acctId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public LocalDate getSvcStartDate() {
		return svcStartDate;
	}

	public void setSvcStartDate(LocalDate svcStartDate) {
		this.svcStartDate = svcStartDate;
	}

	public LocalDate getSvcEndDate() {
		return svcEndDate;
	}

	public void setSvcEndDate(LocalDate svcEndDate) {
		this.svcEndDate = svcEndDate;
	}

	

	
		
}
