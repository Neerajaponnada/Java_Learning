package com.wellsfargo.batch7.group3.dto;

public class LoginDataDto{
	
	private Integer loginSeqId;
	private CustomerAccountDto custId;
	private String loginType;
	private String loginPwd; 
	private String txnPwd;
	private String securityQues;
	private String securityAns;
	private Integer loginid;

	public LoginDataDto() {
		super();
	}


	public LoginDataDto(Integer loginSeqId, CustomerAccountDto custId, String loginType, String loginPwd, String txnPwd,
			String securityQues, String securityAns, Integer loginid) {
		super();
		this.loginSeqId = loginSeqId;
		this.custId = custId;
		this.loginType = loginType;
		this.loginPwd = loginPwd;
		this.txnPwd = txnPwd;
		this.securityQues = securityQues;
		this.securityAns = securityAns;
		this.loginid = loginid;
	}


	public CustomerAccountDto getCustId() {
		return custId;
	}


	public void setCustId(CustomerAccountDto custId) {
		this.custId = custId;
	}


	public Integer getLoginSeqId() {
		return loginSeqId;
	}

	public void setLoginSeqId(Integer loginSeqId) {
		this.loginSeqId = loginSeqId;
	}

	public Integer getLoginid() {
		return loginid;
	}

	public void setLoginid(Integer loginid) {
		this.loginid = loginid;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getTxnPwd() {
		return txnPwd;
	}

	public void setTxnPwd(String txnPwd) {
		this.txnPwd = txnPwd;
	}

	public String getSecurityQues() {
		return securityQues;
	}

	public void setSecurityQues(String securityQues) {
		this.securityQues = securityQues;
	}

	public String getSecurityAns() {
		return securityAns;
	}

	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}
	
	
	
		
}
