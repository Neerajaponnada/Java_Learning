package com.wellsfargo.batch7.group3.service.impl;

import java.text.SimpleDateFormat;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wellsfargo.batch7.group3.dto.CustomerAccountDto;
import com.wellsfargo.batch7.group3.dto.CustomerTrasactionsDto;
import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.dto.ServiceProviderDto;
import com.wellsfargo.batch7.group3.entities.KycDetails;
import com.wellsfargo.batch7.group3.exception.IBSException;
import com.wellsfargo.batch7.group3.repository.AdminRepository;
import com.wellsfargo.batch7.group3.repository.CustomerRepository;
import com.wellsfargo.batch7.group3.repository.ServiceProviderRepository;
import com.wellsfargo.batch7.group3.service.IAdminService;

public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private ServiceProviderRepository serviceProviderRepo;
	
	@Transactional
	@Override
	public KycDetailsDto register(KycDetailsDto newUser) throws IBSException {
		System.out.println("In register");
		if (newUser!= null) {
			System.out.println("1");
			newUser = kycParse(adminRepo.save(kycParse(newUser)));
			}
		return newUser;
	}

	@Override
	public CustomerAccountDto createCustomerId(CustomerAccountDto custAcct) throws IBSException {
		return null;
	}

	@Override
	public ServiceProviderDto createServiceProviderId(ServiceProviderDto svcAcct) throws IBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerTrasactionsDto chkCustStatement(CustomerTrasactionsDto custAcct) throws IBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerTrasactionsDto fundDepositEntry(CustomerTrasactionsDto custAcct) throws IBSException {
		// TODO Auto-generated method stub
		return null;
	}

	public static KycDetailsDto kycParse(KycDetails source) {
		System.out.println("Outer kyc Parse - 1");
		KycDetailsDto target = new KycDetailsDto();
		target.setFirstname(source.getFirstname());
		target.setLastname(source.getLastname());
		target.setGender(source.getGender());
		target.setDateOfBirth(new SimpleDateFormat("dd-MM-yyyy").format(source.getDateOfBirth()));
		target.setEmailId(source.getEmailId());
		target.setMobileNum(source.getMobileNum());
		target.setAddress(source.getAddress());
		target.setCity(source.getCity());
		target.setPinCode(source.getPinCode());
		target.setTypeOfAcctHolder(source.getTypeOfAcctHolder());
		target.setCustAcctType(source.getCustAcctType());
		target.setKycIdentityType(source.getKycIdentityType());
		target.setKycUploadInd(source.getKycUploadInd());
		
		return target;
	}
	
	public static KycDetails kycParse(KycDetailsDto source) {
		System.out.println("Inner kyc Parse - 1");
		KycDetails target = new KycDetails();
		target.setFirstname(source.getFirstname());
		target.setLastname(source.getLastname());
		target.setGender(source.getGender());
		//target.setDateOfBirth(new SimpleDateFormat("dd-MM-yyyy").format(source.getDateOfBirth()));;
		target.setEmailId(source.getEmailId());
		target.setMobileNum(source.getMobileNum());
		target.setAddress(source.getAddress());
		target.setCity(source.getCity());
		target.setPinCode(source.getPinCode());
		target.setTypeOfAcctHolder(source.getTypeOfAcctHolder());
		target.setCustAcctType(source.getCustAcctType());
		target.setKycApprovalStatus("Applied");
		target.setKycIdentityType(source.getKycIdentityType());
		target.setKycUploadInd(source.getKycUploadInd());
		
		
		
		return target;
	}

}
