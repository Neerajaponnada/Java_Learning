package com.wellsfargo.batch7.group3.dto;

import java.time.LocalDate;

public class CustomerTrasactionsDto{
	
	private Integer txnId;
	private CustomerAccountDto custAcctInfo;
	private String custAcctType;
	private String txnType;
	private Integer fromAcctNum; 
	private Integer toAcctNum;
	private double txnAmt;
	private LocalDate txnDateTime;
	private String txnCmnts;
	public CustomerTrasactionsDto() {
		super();
	}

	public CustomerTrasactionsDto(Integer txnId, CustomerAccountDto custAcctInfo, String custAcctType, String txnType,
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

	public CustomerAccountDto getCustAcctInfo() {
		return custAcctInfo;
	}

	public void setCustAcctInfo(CustomerAccountDto custAcctInfo) {
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
