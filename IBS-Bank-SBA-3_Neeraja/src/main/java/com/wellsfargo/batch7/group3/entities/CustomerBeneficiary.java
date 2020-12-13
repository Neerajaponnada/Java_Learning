package com.wellsfargo.batch7.group3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CUST_BNFCRY")
public class CustomerBeneficiary{
	
	@Id
	@Column(name="BNFCRY_ID")
	@GeneratedValue
	private Integer bnfcryId;
	
	@ManyToOne
	@JoinColumn(name="CUST_ACCT_NUM")
	private CustomerAccount custAcctInfo;
	
	@Column(name="BNFCRY_ACCT_NUM")
	private Integer bnfcryAcctNum;
	
	@Column(name="BNFCRY_ACCT_NAME")
	private String bnfcryAcctName; 
	
	@Column(name="BNFCRY_BANK_NAME")
	private String bnfcryBankName;

	@Column(name="BNFCRY_ACCT_IFSC")
	private String bnfcryBankIfsc;

	@Column(name="BNFCRY_TXN_TYP")
	private String bnfcryTxnType;
	
	@Column(name="BNFCRY_MOBILE_NUM")
	private String bnfcryMblNum;

	public CustomerBeneficiary() {
		super();
	}

	public CustomerBeneficiary(Integer bnfcryId, CustomerAccount custAcctInfo, Integer bnfcryAcctNum,
			String bnfcryAcctName, String bnfcryBankName, String bnfcryBankIfsc, String bnfcryTxnType,
			String bnfcryMblNum) {
		super();
		this.bnfcryId = bnfcryId;
		this.custAcctInfo = custAcctInfo;
		this.bnfcryAcctNum = bnfcryAcctNum;
		this.bnfcryAcctName = bnfcryAcctName;
		this.bnfcryBankName = bnfcryBankName;
		this.bnfcryBankIfsc = bnfcryBankIfsc;
		this.bnfcryTxnType = bnfcryTxnType;
		this.bnfcryMblNum = bnfcryMblNum;
	}

	public Integer getBnfcryId() {
		return bnfcryId;
	}

	public void setBnfcryId(Integer bnfcryId) {
		this.bnfcryId = bnfcryId;
	}

	public CustomerAccount getCustAcctInfo() {
		return custAcctInfo;
	}

	public void setCustAcctInfo(CustomerAccount custAcctInfo) {
		this.custAcctInfo = custAcctInfo;
	}

	public Integer getBnfcryAcctNum() {
		return bnfcryAcctNum;
	}

	public void setBnfcryAcctNum(Integer bnfcryAcctNum) {
		this.bnfcryAcctNum = bnfcryAcctNum;
	}

	public String getBnfcryAcctName() {
		return bnfcryAcctName;
	}

	public void setBnfcryAcctName(String bnfcryAcctName) {
		this.bnfcryAcctName = bnfcryAcctName;
	}

	public String getBnfcryBankName() {
		return bnfcryBankName;
	}

	public void setBnfcryBankName(String bnfcryBankName) {
		this.bnfcryBankName = bnfcryBankName;
	}

	public String getBnfcryBankIfsc() {
		return bnfcryBankIfsc;
	}

	public void setBnfcryBankIfsc(String bnfcryBankIfsc) {
		this.bnfcryBankIfsc = bnfcryBankIfsc;
	}

	public String getBnfcryTxnType() {
		return bnfcryTxnType;
	}

	public void setBnfcryTxnType(String bnfcryTxnType) {
		this.bnfcryTxnType = bnfcryTxnType;
	}

	public String getBnfcryMblNum() {
		return bnfcryMblNum;
	}

	public void setBnfcryMblNum(String bnfcryMblNum) {
		this.bnfcryMblNum = bnfcryMblNum;
	}

		
	
	
}
