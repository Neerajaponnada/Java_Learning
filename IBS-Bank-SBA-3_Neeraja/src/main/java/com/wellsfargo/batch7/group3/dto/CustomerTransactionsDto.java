package com.wellsfargo.batch7.group3.dto;

import java.util.Date;

public class CustomerTransactionsDto{
	
	private long txnId;
	private String txnType;
	private long fromAcctNum; 
	private long toAcctNum;
	private long custAcctNum;
	private double txnAmt;
	private String txnCmnts;
	private Date txnDate;
	
	public CustomerTransactionsDto() {
		super();
	}

	public CustomerTransactionsDto(long txnId, String custAcctType, String txnType,
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

	public void setTxnAmt(double txnAmt) {
		this.txnAmt = txnAmt;
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


	public String getTxnCmnts() {
		return txnCmnts;
	}

	public void setTxnCmnts(String txnCmnts) {
		this.txnCmnts = txnCmnts;
	}

	
}
