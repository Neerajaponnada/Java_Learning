package com.wellsfargo.batch7.group3.dto;

import java.time.LocalDate;

public class ServiceProviderDto{
	
	private Integer serviceProviderId;
	private KycDetailsDto svcRegstrId;
	private String serviceProviderName;
	private String bankName;
	private Integer acctId;
	private String branchName;
	private String ifscCode;
	private LocalDate svcStartDate;
	private LocalDate svcEndDate;

	public ServiceProviderDto() {
		super();
	}

	public ServiceProviderDto(Integer serviceProviderId, KycDetailsDto svcRegstrId, String serviceProviderName,
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

	public KycDetailsDto getSvcRegstrId() {
		return svcRegstrId;
	}

	public void setSvcRegstrId(KycDetailsDto svcRegstrId) {
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
