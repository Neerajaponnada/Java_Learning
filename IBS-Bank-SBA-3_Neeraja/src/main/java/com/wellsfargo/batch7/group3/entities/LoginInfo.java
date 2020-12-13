package com.wellsfargo.batch7.group3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN_PASSWORD")
public class LoginInfo{
	
	@Id
	@Column(name="LOGIN_SEQ_ID")
	@GeneratedValue
	private Integer loginSeqId;
	
	@OneToOne
	@JoinColumn(name="UCI")
	private CustomerAccount custId;
	
	@Column(name="LOGIN_TYPE")
	private String loginType;
	
	@Column(name="LOGIN_PWD")
	private String loginPwd; 
	
	@Column(name="TXN_PWD")
	private String txnPwd;

	@Column(name="SECURITY_QUES1")
	private String securityQues;
	
	@Column(name="SECURITY_ANS1")
	private String securityAns;

	private Integer loginid;

	public LoginInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginInfo(Integer loginSeqId, Integer loginid, String loginType, String loginPwd, String txnPwd,
			String securityQues, String securityAns) {
		super();
		this.loginSeqId = loginSeqId;
		this.loginid = loginid;
		this.loginType = loginType;
		this.loginPwd = loginPwd;
		this.txnPwd = txnPwd;
		this.securityQues = securityQues;
		this.securityAns = securityAns;
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
