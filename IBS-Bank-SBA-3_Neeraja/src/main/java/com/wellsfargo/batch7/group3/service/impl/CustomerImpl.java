package com.wellsfargo.batch7.group3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.batch7.group3.dto.LoginDataDto;
import com.wellsfargo.batch7.group3.entities.CustomerAccount;
import com.wellsfargo.batch7.group3.entities.CustomerBeneficiary;
import com.wellsfargo.batch7.group3.entities.CustomerTrasactionsInfo;
import com.wellsfargo.batch7.group3.entities.ServiceProvider;
import com.wellsfargo.batch7.group3.exception.IBSException;
import com.wellsfargo.batch7.group3.repository.CustomerRepository;
import com.wellsfargo.batch7.group3.repository.LoginRepository;
import com.wellsfargo.batch7.group3.service.ICustomerService;

@Service
public class CustomerImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private LoginRepository loginRepo;

	@Override
	public LoginDataDto userLogin(LoginDataDto loginUser) throws IBSException {
		
		LoginDataDto loginInf = new LoginDataDto();
		if((loginRepo.existsByUserName(loginUser.getUserName()))) {
			loginInf = getLoginData(loginUser.getUserName());
			if((loginInf.getUserName().equalsIgnoreCase(loginUser.getUserName())) && (loginInf.getPassword().equalsIgnoreCase(loginUser.getPassword()))) {
				System.out.println("user name password match");
			} else {
				throw new IBSException("Invalid Credentials !! ");
			}
		} else {
			throw new IBSException("User doesn't exist");
		}
		return loginUser;
	}
	
	
	private LoginDataDto getLoginData(String userName) {
		LoginDataDto loginObj = new LoginDataDto();

		loginObj.setUserName(loginRepo.findByUserName(userName).getUserName());
		loginObj.setPassword(loginRepo.findByUserName(userName).getPassword());
		loginObj.setRole(loginRepo.findByUserName(userName).getRole());
		return loginObj;
	}

	@Override
	public CustomerAccount checkBalance(CustomerAccount custAcct) throws IBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerBeneficiary addBeneficiary(CustomerBeneficiary custAcct) throws IBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerBeneficiary updateBeneficiary(CustomerBeneficiary custAcct) throws IBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerTrasactionsInfo transferFunds(CustomerTrasactionsInfo custAcct) throws IBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerTrasactionsInfo viewStatement(CustomerTrasactionsInfo custAcct) throws IBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceProvider payUtilBills(ServiceProvider custAcct) throws IBSException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
