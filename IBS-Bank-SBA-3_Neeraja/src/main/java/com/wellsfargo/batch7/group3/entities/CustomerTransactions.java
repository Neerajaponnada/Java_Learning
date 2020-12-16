package com.wellsfargo.batch7.group3.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUST_ACCT_TXN_INFO")
public class CustomerTransactions{
	
	@Id
	@Column(name="TXN_ID")
	@GeneratedValue
	private long txnId;
	
	@Column(name="CUST_ACCT_NUM")
	private long custAcctNum;

	
	@Column(name="TXN_TYPE")
	private String txnType;
	
	@Column(name="FROM_ACCT_NUM")
	private long fromAcctNum; 
	
	@Column(name="TO_ACCT_NUM")
	private long toAcctNum;
	
	@Column(name="TXN_AMT")
	private double txnAmt;
	
	@Column(name="TXN_COMMENTS")
	private String txnCmnts;

	@Column(name="TXN_DATE")
	private Date txnDate;
	
	public CustomerTransactions() {
		super();
	}

	public CustomerTransactions(long txnId, String custAcctType, String txnType,
			long fromAcctNum, long toAcctNum, double txnAmt, String txnCmnts,long custAcctNum,Date txnDate) {
		super();
		this.txnId = txnId;
		this.txnType = txnType;
		this.fromAcctNum = fromAcctNum;
		this.toAcctNum = toAcctNum;
		this.txnAmt = txnAmt;
		this.txnCmnts = txnCmnts;
		this.custAcctNum = custAcctNum;
		this.txnDate = txnDate;
	}
	
	public Date getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public long getCustAcctNum() {
		return custAcctNum;
	}

	public void setCustAcctNum(long custAcctNum) {
		this.custAcctNum = custAcctNum;
	}


	public long getTxnId() {
		return txnId;
	}

	public void setTxnId(long txnId) {
		this.txnId = txnId;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public long getFromAcctNum() {
		return fromAcctNum;
	}

	public void setFromAcctNum(long fromAcctNum) {
		this.fromAcctNum = fromAcctNum;
	}

	public long getToAcctNum() {
		return toAcctNum;
	}

	public void setToAcctNum(long toAcctNum) {
		this.toAcctNum = toAcctNum;
	}

	public double getTxnAmt() {
		return txnAmt;
	}

	public void setTxnAmt(double txnAmt) {
		this.txnAmt = txnAmt;
	}

	public String getTxnCmnts() {
		return txnCmnts;
	}

	public void setTxnCmnts(String txnCmnts) {
		this.txnCmnts = txnCmnts;
	}

	
}
