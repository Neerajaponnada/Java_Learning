package com.wellsfargo.batch7.group3.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellsfargo.batch7.group3.dto.CustomerAccountDto;
import com.wellsfargo.batch7.group3.dto.CustomerBeneficiaryDto;
import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.dto.LoginDataDto;
import com.wellsfargo.batch7.group3.entities.CustomerAccount;
import com.wellsfargo.batch7.group3.entities.CustomerBeneficiary;
import com.wellsfargo.batch7.group3.entities.CustomerTrasactionsInfo;
import com.wellsfargo.batch7.group3.entities.KycDetails;
import com.wellsfargo.batch7.group3.entities.ServiceProvider;
import com.wellsfargo.batch7.group3.exception.IBSException;
import com.wellsfargo.batch7.group3.repository.CustomerRepository;
import com.wellsfargo.batch7.group3.repository.CustomerBeneficiaryRepository;
import com.wellsfargo.batch7.group3.repository.LoginRepository;
import com.wellsfargo.batch7.group3.service.ICustomerService;

@Service
public class CustomerImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private CustomerBeneficiaryRepository custBnfRepo;
	
	@Autowired
	private LoginRepository loginRepo;

	@Override
	public LoginDataDto userLogin(LoginDataDto loginUser) throws IBSException {
		
		LoginDataDto loginInf = new LoginDataDto();
		if((loginRepo.existsByUserName(loginUser.getUserName())) && (loginUser.getRole().equalsIgnoreCase("customer"))) {
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

	@Transactional
	@Override
	public CustomerBeneficiaryDto addBeneficiary(CustomerBeneficiaryDto custBnfcryAcct, String userName) throws IBSException {
		List<CustomerAccount> custAcct = customerRepo.findByUserName(userName);
		
		long custAcctNum = 0;
		System.out.println(custBnfcryAcct.getBnfcryAcctName()+custBnfcryAcct.getBnfcryAcctName());
		for (int i = 0;i<custAcct.size();i++) {
			if(custAcct.get(i).getCustAcctType().equalsIgnoreCase("Savings Account")) {
				custAcctNum = custAcct.get(i).getCustAcctNum();
		}
		}
		return bnfParse(custBnfRepo.save(bnfParse(custBnfcryAcct,custAcctNum)));
		
	}
	
	private CustomerBeneficiaryDto bnfParse(CustomerBeneficiary source) {
		CustomerBeneficiaryDto target = new CustomerBeneficiaryDto();
		target.setBnfcryAcctNum(source.getBnfcryAcctNum());
		target.setCustAcctNum(source.getCustAcctNum());
		target.setBnfcryAcctName(source.getBnfcryAcctName());
		target.setBnfcryBankName(source.getBnfcryBankName());
		target.setBnfcryBankIfsc(source.getBnfcryBankIfsc());
		target.setBnfcryMblNum(source.getBnfcryMblNum());
		target.setBnfcryTxnType("IMPS");
		
		return target;
	}
	
	private CustomerBeneficiary bnfParse(CustomerBeneficiaryDto source , long custAcctNum) {
		CustomerBeneficiary target = new CustomerBeneficiary();
		target.setBnfcryAcctNum(source.getBnfcryAcctNum());
		target.setCustAcctNum(custAcctNum);
		target.setBnfcryAcctName(source.getBnfcryAcctName());
		target.setBnfcryBankName(source.getBnfcryBankName());
		target.setBnfcryBankIfsc(source.getBnfcryBankIfsc());
		target.setBnfcryMblNum(source.getBnfcryMblNum());
		target.setBnfcryTxnType("IMPS");
		
		return target;
	}


	@Override
	public List<CustomerAccountDto> getCustomerData(String userName) {
		List<CustomerAccount> c1 = customerRepo.findByUserName(userName);
		
		List<CustomerAccountDto> custObj1 = c1.stream().map(e -> custDataParse(e)).collect(Collectors.toList());
		
		return custObj1;
	}
	
	private CustomerAccountDto custDataParse(CustomerAccount source) {
		CustomerAccountDto target = new CustomerAccountDto();
		
		target.setUserName(source.getUserName());
		target.setCustAcctNum(source.getCustAcctNum());
		target.setAvailableBalance(source.getAvailableBalance());
		target.setAcctStartDate(source.getAcctStartDate());
		target.setAcctCloseDate(source.getAcctCloseDate());
		target.setBranchIFSC(source.getBranchIFSC());
		target.setBranchName(source.getBranchName());
		target.setCustName(source.getCustName());
		target.setTenure(source.getTenure());
		target.setCustAcctStatus(source.getCustAcctStatus());
		target.setCustAcctType(source.getCustAcctType());
		target.setInterestRate(source.getInterestRate());
		target.setRegId(source.getRegId()); 
		
		return target;
	}


	public List<CustomerBeneficiaryDto> getListOfBnfcry(@Valid String userName) {
		List<CustomerAccount> custAcct = customerRepo.findByUserName(userName);
		
		long custAcctNum = 0;
		for (int i = 0;i<custAcct.size();i++) {
			System.out.println(custAcct.get(i).getCustAcctNum());
			if(custAcct.get(i).getCustAcctType().equalsIgnoreCase("Savings Account")) {
				custAcctNum = custAcct.get(i).getCustAcctNum();
		}
		}
		System.out.println("custAcct "+custAcctNum);
		
		return custBnfRepo.findByCustAcctNum(custAcctNum).stream().map(e -> bnfcryParse(e)).collect(Collectors.toList());
	}


	private CustomerBeneficiaryDto bnfcryParse(CustomerBeneficiary source) {
		CustomerBeneficiaryDto target = new CustomerBeneficiaryDto();
		
		target.setBnfcryId(source.getBnfcryId());
		target.setBnfcryAcctNum(source.getBnfcryAcctNum());
		target.setBnfcryAcctName(source.getBnfcryAcctName());
		target.setBnfcryBankName(source.getBnfcryBankName());
		target.setBnfcryBankIfsc(source.getBnfcryBankIfsc());
		target.setBnfcryMblNum(source.getBnfcryMblNum());
		
		return target;
	}

	private KycDetails getAcctInfo(long regId) {
		return null;//adminRepo.findById(regId).get();
	}

	
}
