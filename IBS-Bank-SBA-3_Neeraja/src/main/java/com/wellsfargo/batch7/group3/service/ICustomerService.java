package com.wellsfargo.batch7.group3.service;

import com.wellsfargo.batch7.group3.entities.CustomerAccount;
import com.wellsfargo.batch7.group3.entities.CustomerBeneficiary;
import com.wellsfargo.batch7.group3.entities.CustomerTrasactionsInfo;
import com.wellsfargo.batch7.group3.entities.LoginInfo;
import com.wellsfargo.batch7.group3.entities.ServiceProvider;
import com.wellsfargo.batch7.group3.exception.IBSException;

public interface ICustomerService {

	LoginInfo custLogin(LoginInfo custAcct) throws IBSException;
	
	CustomerAccount checkBalance(CustomerAccount custAcct) throws IBSException;
	
	CustomerBeneficiary addBeneficiary(CustomerBeneficiary custAcct) throws IBSException;
	CustomerBeneficiary updateBeneficiary(CustomerBeneficiary custAcct) throws IBSException;
	
	CustomerTrasactionsInfo transferFunds(CustomerTrasactionsInfo custAcct) throws IBSException;
	CustomerTrasactionsInfo viewStatement(CustomerTrasactionsInfo custAcct) throws IBSException;
	
	ServiceProvider payUtilBills(ServiceProvider custAcct) throws IBSException;
	
	
}
