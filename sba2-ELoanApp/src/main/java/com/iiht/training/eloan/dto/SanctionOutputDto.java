package com.iiht.training.eloan.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SanctionOutputDto {
	
	@NotNull(message="Loan Amount Sanctioned is mandatory")
	@NotBlank(message="Loan Amount Sanctioned cannot be null")
	@Size(min=1, message="Loan Amount Sanctioned must be greater than 0")
	private Double loanAmountSanctioned;
	
	@NotNull(message="Loan Term is mandatory")
	@NotBlank(message="Loan Term cannot be null")
	@Size(min=1, message="Loan Term must be greater than 0")
	private Double termOfLoan;
	
	private String paymentStartDate;
	private String loanClosureDate;
	private Double monthlyPayment;
	public Double getLoanAmountSanctioned() {
		return loanAmountSanctioned;
	}
	public void setLoanAmountSanctioned(Double loanAmountSanctioned) {
		this.loanAmountSanctioned = loanAmountSanctioned;
	}
	public Double getTermOfLoan() {
		return termOfLoan;
	}
	public void setTermOfLoan(Double termOfLoan) {
		this.termOfLoan = termOfLoan;
	}
	public String getPaymentStartDate() {
		return paymentStartDate;
	}
	public void setPaymentStartDate(String paymentStartDate) {
		this.paymentStartDate = paymentStartDate;
	}
	public String getLoanClosureDate() {
		return loanClosureDate;
	}
	public void setLoanClosureDate(String loanClosureDate) {
		this.loanClosureDate = loanClosureDate;
	}
	public Double getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(Double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	
}
