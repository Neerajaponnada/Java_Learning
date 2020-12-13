package com.wellsfargo.batch7.group3.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CUST_ACCT")
public class CustomerAccount{
	
	@Id
	@Column(name="UCI")
	@GeneratedValue
	private Integer uci;
	
	@ManyToOne
	@JoinColumn(name="regId")
	private KycDetails custRegstrId;
	
	@OneToMany(mappedBy="custAcctInfo",cascade=CascadeType.ALL)
	private List<CustomerBeneficiary> custBenf;
	
	@Column(name="CUST_ACCT_NUM")
	private Integer custAcctNum;
	
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

	public CustomerAccount(Integer uci, KycDetails regstrId, Integer custAcctNum, String custName, String custAcctType,
			double availableBalance, LocalDate acctStartDate, LocalDate acctCloseDate, String branchName,
			String branchIFSC, double interestRate, String tenure, String custAcctStatus) {
		super();
		this.uci = uci;
		this.custRegstrId = regstrId;
		this.custAcctNum = custAcctNum;
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

	public Integer getUci() {
		return uci;
	}

	public void setUci(Integer uci) {
		this.uci = uci;
	}

	public KycDetails getRegstrId() {
		return custRegstrId;
	}

	public void setRegstrId(KycDetails regstrId) {
		this.custRegstrId = regstrId;
	}

	public Integer getCustAcctNum() {
		return custAcctNum;
	}

	public void setCustAcctNum(Integer custAcctNum) {
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
