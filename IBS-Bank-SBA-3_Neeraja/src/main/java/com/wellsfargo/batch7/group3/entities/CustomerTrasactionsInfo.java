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
@Table(name="CUST_ACCT_TXN_INFO")
public class CustomerTrasactionsInfo{
	
	@Id
	@Column(name="TXN_ID")
	@GeneratedValue
	private Integer txnId;
	
	@ManyToOne
	@JoinColumn(name="CUST_ACCT_NUM")
	private CustomerAccount custAcctInfo;
	
	@Column(name="CUST_ACCT_TYPE")
	private String custAcctType;

	@Column(name="TXN_TYPE")
	private String txnType;
	
	@Column(name="FROM_ACCT_NUM")
	private Integer fromAcctNum; 
	
	@Column(name="TO_ACCT_NUM")
	private Integer toAcctNum;
	
	@Column(name="TXN_AMT")
	private double txnAmt;
	
	@Column(name="TXN_DATE_TIME")
	private LocalDate txnDateTime;
	
	@Column(name="TXN_COMMENTS")
	private String txnCmnts;

	public CustomerTrasactionsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerTrasactionsInfo(Integer txnId, CustomerAccount custAcctInfo, String custAcctType, String txnType,
			Integer fromAcctNum, Integer toAcctNum, Float txnAmt, LocalDate txnDateTime, String txnCmnts) {
		super();
		this.txnId = txnId;
		this.custAcctInfo = custAcctInfo;
		this.custAcctType = custAcctType;
		this.txnType = txnType;
		this.fromAcctNum = fromAcctNum;
		this.toAcctNum = toAcctNum;
		this.txnAmt = txnAmt;
		this.txnDateTime = txnDateTime;
		this.txnCmnts = txnCmnts;
	}

	public Integer getTxnId() {
		return txnId;
	}

	public void setTxnId(Integer txnId) {
		this.txnId = txnId;
	}

	public CustomerAccount getCustAcctInfo() {
		return custAcctInfo;
	}

	public void setCustAcctInfo(CustomerAccount custAcctInfo) {
		this.custAcctInfo = custAcctInfo;
	}

	public String getCustAcctType() {
		return custAcctType;
	}

	public void setCustAcctType(String custAcctType) {
		this.custAcctType = custAcctType;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public Integer getFromAcctNum() {
		return fromAcctNum;
	}

	public void setFromAcctNum(Integer fromAcctNum) {
		this.fromAcctNum = fromAcctNum;
	}

	public Integer getToAcctNum() {
		return toAcctNum;
	}

	public void setToAcctNum(Integer toAcctNum) {
		this.toAcctNum = toAcctNum;
	}

	public double getTxnAmt() {
		return txnAmt;
	}

	public void setTxnAmt(Float txnAmt) {
		this.txnAmt = txnAmt;
	}

	public LocalDate getTxnDateTime() {
		return txnDateTime;
	}

	public void setTxnDateTime(LocalDate txnDateTime) {
		this.txnDateTime = txnDateTime;
	}

	public String getTxnCmnts() {
		return txnCmnts;
	}

	public void setTxnCmnts(String txnCmnts) {
		this.txnCmnts = txnCmnts;
	}

	

	
	
}
