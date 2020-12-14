package com.wellsfargo.batch7.group3.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.wellsfargo.batch7.group3.dto.CustomerAccountDto;
import com.wellsfargo.batch7.group3.dto.CustomerTrasactionsDto;
import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.dto.LoginDataDto;
import com.wellsfargo.batch7.group3.dto.ServiceProviderDto;
import com.wellsfargo.batch7.group3.entities.KycDetails;
import com.wellsfargo.batch7.group3.entities.LoginInfo;
import com.wellsfargo.batch7.group3.exception.IBSException;
import com.wellsfargo.batch7.group3.repository.AdminRepository;
import com.wellsfargo.batch7.group3.repository.CustomerRepository;
import com.wellsfargo.batch7.group3.repository.LoginRepository;
import com.wellsfargo.batch7.group3.repository.ServiceProviderRepository;
import com.wellsfargo.batch7.group3.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private LoginRepository loginRepo;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private ServiceProviderRepository serviceProviderRepo;
	
	@Transactional
	@Override
	public KycDetailsDto register(KycDetailsDto newUser) throws IBSException {
		
		LoginDataDto loginObj = new LoginDataDto();

		loginObj.setUserName(newUser.getUserName());
		loginObj.setPassword(newUser.getPassword());
		loginObj.setRole("Customer");
		
		if(adminRepo.existsByUserName(newUser.getUserName())) {
				throw new IBSException("UserName "+newUser.getUserName()+" already exists");
		} else {
			if(adminRepo.existsByMobileNum(newUser.getMobileNum())) {
				throw new IBSException("User already exists with same mobile #"+newUser.getMobileNum());
			}
		} 
		
		if (newUser!= null) {
			newUser = kycParse(adminRepo.save(kycParse(newUser)));
			loginRepo.save(loginParse(loginObj));
			}
		return newUser;
	}

	@Transactional
	@Override
	public LoginDataDto adminLogin(@Valid LoginDataDto loginUser) throws IBSException {
		
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
		System.out.println(" in getLoginData loop");
		LoginDataDto loginObj = new LoginDataDto();

		loginObj.setUserName(loginRepo.findByUserName(userName).getUserName());
		loginObj.setPassword(loginRepo.findByUserName(userName).getPassword());
		loginObj.setRole(loginRepo.findByUserName(userName).getRole());
		return loginObj;
	}
	
	@Override
	public CustomerAccountDto createCustomerId(CustomerAccountDto custAcct) throws IBSException {
		return null;
	}

	@Override
	public ServiceProviderDto createServiceProviderId(ServiceProviderDto svcAcct) throws IBSException {
		return null;
	}

	@Override
	public CustomerTrasactionsDto chkCustStatement(CustomerTrasactionsDto custAcct) throws IBSException {
		return null;
	}

	@Override
	public CustomerTrasactionsDto fundDepositEntry(CustomerTrasactionsDto custAcct) throws IBSException {
		return null;
	}
	
	private LoginInfo loginParse(LoginDataDto source) {
		LoginInfo loginObj = new LoginInfo();

		loginObj.setUserName(source.getUserName());
		loginObj.setPassword(source.getPassword());
		loginObj.setRole("Customer");
		
		return loginObj;
	}

	public static KycDetailsDto kycParse(KycDetails source) {
		//System.out.println("Outer kyc Parse - 1");
		KycDetailsDto target = new KycDetailsDto();
		target.setUserName(source.getUserName());
		target.setFullName(source.getFullName());
		target.setPassword(source.getPassword());
		target.setGender(source.getGender());
		target.setDateOfBirth(source.getDateOfBirth());
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
		//System.out.println("Inner kyc Parse - - 1");
		KycDetails target = new KycDetails();
		target.setUserName(source.getUserName());
		target.setFullName(source.getFullName());
		target.setPassword(source.getPassword());
		target.setGender(source.getGender());
		target.setDateOfBirth(source.getDateOfBirth());;
		target.setEmailId(source.getEmailId());
		target.setMobileNum(source.getMobileNum());
		target.setAddress(source.getAddress());
		target.setCity(source.getCity());
		target.setPinCode(source.getPinCode());
		target.setTypeOfAcctHolder(source.getTypeOfAcctHolder());
		target.setCustAcctType(source.getCustAcctType());
		target.setKycApprovalStatus("Open");
		target.setKycIdentityType(source.getKycIdentityType());
		target.setKycUploadDoc(source.getKycUploadDoc());
		target.setAdminCommentsKYC("User registered");
		if(source.getKycUploadDoc() != null) {
			target.setKycUploadInd("Y");		
		} else {
			target.setKycUploadInd("N");
		}
		
		
		
		return target;
	}

//	public List<KycDetailsDto> getAllOpenReq() {
//		List<KycDetails> openReqObj = null;
//		openReqObj = adminRepo.findAll();
//		System.out.println(adminRepo.findAll().get(0).getUserName());
//		System.out.println(adminRepo.findAll().get(1).getUserName());
//
//		List<KycDetailsDto> openReqList = null;
//		openReqList = adminRepo.findAll().stream().map(e -> openReqParse(e)).collect(Collectors.toList());
//		
//		//loanRepository.findAll().stream().map(e -> loanParse(e)).collect(Collectors.toList());
//		
//		return openReqList;
//	}
	
	public List<KycDetailsDto> getAllOpenReq() {
		List<KycDetailsDto> obj1 = adminRepo.findAllByKycApprovalStatus("Open").stream().map(e -> openReqParse(e)).collect(Collectors.toList());
		return obj1;
	}
	
	public static KycDetailsDto openReqParse(KycDetails source) {
		KycDetailsDto target = new KycDetailsDto();
		
		target.setRegId(source.getRegId());
		target.setUserName(source.getUserName());
		target.setMobileNum(source.getMobileNum());
		target.setTypeOfAcctHolder(source.getTypeOfAcctHolder());
		target.setCustAcctType(source.getCustAcctType());
		
		return target;
	}

	@Modifying
	@Override
	public KycDetailsDto approveAcct(long regId) {
		KycDetails acctObj = getAcctInfo(regId);
		acctObj.setAdminCommentsKYC("Account approved by Admin");
		acctObj.setKycApprovalStatus("Approved");
		
		return rejectParse(adminRepo.save(acctObj));
	}
	
	@Modifying
	@Override
	public KycDetailsDto rejectAcct(long regId) {
		KycDetails acctObj = getAcctInfo(regId);
		acctObj.setAdminCommentsKYC("Account rejected by Admin");
		acctObj.setKycApprovalStatus("Rejected");
		
		return rejectParse(adminRepo.save(acctObj));
	}
	
	private KycDetails getAcctInfo(long regId) {
		return adminRepo.findById(regId).get();
	}
	

	private KycDetailsDto rejectParse(KycDetails save) {
		KycDetailsDto kycReject = new KycDetailsDto();
		kycReject.setAdminCommentsKYC("Account rejected by Admin");
		kycReject.setKycApprovalStatus("Rejected");
		
		return kycReject;
	}

	

}
