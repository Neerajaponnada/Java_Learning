package com.wellsfargo.batch7.group3.service;

import com.wellsfargo.batch7.group3.dto.CustomerAccountDto;
import com.wellsfargo.batch7.group3.dto.CustomerTrasactionsDto;
import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.dto.ServiceProviderDto;
import com.wellsfargo.batch7.group3.exception.IBSException;

public interface IAdminService {
	
	KycDetailsDto register(KycDetailsDto regAcct) throws IBSException; // Approve/reject registration & send mail accordingly
	CustomerAccountDto createCustomerId(CustomerAccountDto custAcct) throws IBSException;
	ServiceProviderDto createServiceProviderId(ServiceProviderDto svcAcct) throws IBSException;
	
	
	CustomerTrasactionsDto chkCustStatement(CustomerTrasactionsDto custAcct) throws IBSException;
	CustomerTrasactionsDto fundDepositEntry(CustomerTrasactionsDto custAcct) throws IBSException;
	
	
}
