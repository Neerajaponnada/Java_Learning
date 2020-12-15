package com.wellsfargo.batch7.group3.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUST_ACCT")
public class CustomerAccount{
	
	@Id
	@Column(name="UCI")
	@GeneratedValue
	private long uci;
	
//	@OneToMany
//	@JoinColumn(name="regId")
//	private KycDetails custRegstrId;
	
	@Column(name="REG_ID")
	private long regId;
	
	@Column(name="CUST_ACCT_NUM")
	private long custAcctNum;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="CUST_NAME")
	private String custName; 
	
	@Column(name="CUST_ACCT_TYPE")
	private String custAcctType;

	@Column(name="AVLBL_BAL")
	private double availableBalance;
	
	@Column(name="ACCT_START_DATE")
	private LocalDate acctStartDate;
	
	@Column(name="ACCT_CLOSE_DATE")
	private LocalDate acctCloseDate;
	
	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="BRANCH_IFSC_CODE")
	private String branchIFSC;
	
	@Column(name="INTEREST_RATE_PCT")
	private double interestRate;
	
	@Column(name="TENURE")
	private String tenure;
	
	@Column(name="CUST_ACCT_STATUS")
	private String custAcctStatus;

	public CustomerAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public CustomerAccount(long uci, long regId, long custAcctNum, String userName,
			String custName, String custAcctType, double availableBalance, LocalDate acctStartDate,
			LocalDate acctCloseDate, String branchName, String branchIFSC, double interestRate, String tenure,
			String custAcctStatus) {
		super();
		this.uci = uci;
		this.regId = regId;
		this.custAcctNum = custAcctNum;
		this.userName = userName;
		this.custName = custName;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
