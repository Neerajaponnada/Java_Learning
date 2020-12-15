package com.wellsfargo.batch7.group3.service;

import java.util.List;

import com.wellsfargo.batch7.group3.dto.CustomerAccountDto;
import com.wellsfargo.batch7.group3.dto.CustomerBeneficiaryDto;
import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.dto.LoginDataDto;
import com.wellsfargo.batch7.group3.entities.CustomerAccount;
import com.wellsfargo.batch7.group3.entities.CustomerBeneficiary;
import com.wellsfargo.batch7.group3.entities.CustomerTrasactionsInfo;
import com.wellsfargo.batch7.group3.entities.ServiceProvider;
import com.wellsfargo.batch7.group3.exception.IBSException;

public interface ICustomerService {

	LoginDataDto userLogin(LoginDataDto custAcct) throws IBSException;
	
	List<CustomerAccountDto> getCustomerData(String userName);

	CustomerBeneficiaryDto addBeneficiary(CustomerBeneficiaryDto custBnfcryAcct, String userName) throws IBSException;
	
	
}
