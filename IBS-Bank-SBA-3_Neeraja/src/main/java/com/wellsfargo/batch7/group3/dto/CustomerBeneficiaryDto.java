package com.wellsfargo.batch7.group3.dto;

public class CustomerBeneficiaryDto{
	
	private Integer bnfcryId;
	private CustomerAccountDto custAcctInfo;
	private Integer bnfcryAcctNum;
	private String bnfcryAcctName; 
	private String bnfcryBankName;
	private String bnfcryBankIfsc;
	private String bnfcryTxnType;
	private String bnfcryMblNum;

	public CustomerBeneficiaryDto() {
		super();
	}

	public CustomerBeneficiaryDto(Integer bnfcryId, CustomerAccountDto custAcctInfo, Integer bnfcryAcctNum,
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

	public CustomerAccountDto getCustAcctInfo() {
		return custAcctInfo;
	}

	public void setCustAcctInfo(CustomerAccountDto custAcctInfo) {
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
