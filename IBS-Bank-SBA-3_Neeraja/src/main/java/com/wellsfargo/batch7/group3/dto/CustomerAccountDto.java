package com.wellsfargo.batch7.group3.dto;

import java.time.LocalDate;
public class CustomerAccountDto{
	
	private long uci;
	private long regId;
	private long custAcctNum;
	private String custName; 
	private String userName; 
	private String custAcctType;
	private double availableBalance;
	private LocalDate acctStartDate;
	private LocalDate acctCloseDate;
	private String branchName;
	private String branchIFSC;
	private double interestRate;
	private String tenure;
	private String custAcctStatus;

	public CustomerAccountDto() {
		super();
	}

	public CustomerAccountDto(long uci, long regId, long custAcctNum, String custName, String userName, String custAcctType,
			double availableBalance, LocalDate acctStartDate, LocalDate acctCloseDate, String branchName,
			String branchIFSC, double interestRate, String tenure, String custAcctStatus) {
		super();
		this.uci = uci;
		this.regId = regId;
		this.custAcctNum = custAcctNum;
		this.custName = custName;
		this.userName = userName;
		this.custAcctType = custAcctType;
		this.availableBalance = availableBalance;
		this.acctStartDate = acctStartDate;
		this.acctCloseDate = acctCloseDate;
		this.branchName = branchName;
		this.branchIFSC = branchIFSC;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.custAcctStatus = custAcctStatus;
	}

	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUci() {
		return uci;
	}

	public void setUci(long uci) {
		this.uci = uci;
	}


	public long getRegId() {
		return regId;
	}

	public void setRegId(long regId) {
		this.regId = regId;
	}

	public long getCustAcctNum() {
		return custAcctNum;
	}

	public void setCustAcctNum(long custAcctNum) {
		this.custAcctNum = custAcctNum;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAcctType() {
		return custAcctType;
	}

	public void setCustAcctType(String custAcctType) {
		this.custAcctType = custAcctType;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public LocalDate getAcctStartDate() {
		return acctStartDate;
	}

	public void setAcctStartDate(LocalDate acctStartDate) {
		this.acctStartDate = acctStartDate;
	}

	public LocalDate getAcctCloseDate() {
		return acctCloseDate;
	}

	public void setAcctCloseDate(LocalDate acctCloseDate) {
		this.acctCloseDate = acctCloseDate;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchIFSC() {
		return branchIFSC;
	}

	public void setBranchIFSC(String branchIFSC) {
		this.branchIFSC = branchIFSC;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public String getCustAcctStatus() {
		return custAcctStatus;
	}

	public void setCustAcctStatus(String custAcctStatus) {
		this.custAcctStatus = custAcctStatus;
	}
	
	
	
	
}
