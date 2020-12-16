package com.wellsfargo.batch7.group3.service;

import com.wellsfargo.batch7.group3.dto.CustomerAccountDto;
import com.wellsfargo.batch7.group3.dto.CustomerTransactionsDto;
import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.dto.LoginDataDto;
import com.wellsfargo.batch7.group3.dto.ServiceProviderDto;
import com.wellsfargo.batch7.group3.exception.IBSException;

public interface IAdminService {
	
	KycDetailsDto register(KycDetailsDto regAcct) throws IBSException; // Approve/reject registration & send mail accordingly
	CustomerAccountDto createCustomerId(CustomerAccountDto custAcct) throws IBSException;
	ServiceProviderDto createServiceProviderId(ServiceProviderDto svcAcct) throws IBSException;
	
	
	CustomerTransactionsDto chkCustStatement(CustomerTransactionsDto custAcct) throws IBSException;
	CustomerTransactionsDto fundDepositEntry(CustomerTransactionsDto custAcct) throws IBSException;
	
	LoginDataDto adminLogin(LoginDataDto loginUser) throws IBSException;
	
	KycDetailsDto rejectAcct(long regId) throws IBSException;
	KycDetailsDto approveAcct(long regId) throws IBSException;
	
	
}
