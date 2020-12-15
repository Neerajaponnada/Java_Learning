package com.wellsfargo.batch7.group3.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.JmsProperties.DeliveryMode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch7.group3.dto.CustomerAccountDto;
import com.wellsfargo.batch7.group3.dto.CustomerBeneficiaryDto;
import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.dto.LoginDataDto;
import com.wellsfargo.batch7.group3.exception.IBSException;
import com.wellsfargo.batch7.group3.repository.CustomerRepository;
import com.wellsfargo.batch7.group3.service.IAdminService;
import com.wellsfargo.batch7.group3.service.ICustomerService;
import com.wellsfargo.batch7.group3.service.impl.AdminServiceImpl;
import com.wellsfargo.batch7.group3.service.impl.CustomerImpl;

@Controller
public class CustomerController {

	@Autowired
	private CustomerImpl customerImpl;
	
	@Autowired
	private AdminServiceImpl adminSerImpl;
	
	@PostMapping("/login")
	public ModelAndView loginAction(@ModelAttribute("login") @Valid LoginDataDto loginUser, BindingResult result) throws IBSException {

		ModelAndView mv = null;
		
		List<CustomerAccountDto> custData = null;
		
		System.out.println(loginUser.getUserName()+" , "+loginUser.getPassword()+" , "+loginUser.getRole());
		if (result.hasErrors()) {
			mv = new ModelAndView("loginPage.jsp", "loginUser", loginUser);
		} else {
			if((loginUser.getRole()).equalsIgnoreCase("admin")) {
				System.out.println("In admin");
				adminSerImpl.adminLogin(loginUser);
				mv = new ModelAndView("redirect:/adminHome.jsp");
				
			} else {
				System.out.println("In customer");
				customerImpl.userLogin(loginUser);
				custData = customerImpl.getCustomerData(loginUser.getUserName());
				mv = new ModelAndView("accountSummary.jsp", "customerInfo", custData);
			}
			mv.addObject("loginUser", loginUser);
			mv.addObject("userName", loginUser.getUserName());
		}
		String userName = loginUser.getUserName();
		 // session.setAttribute("userName", userName);
		return mv;
	}
	
	@GetMapping("/acctSummary")
	public ModelAndView acctSummaryAction(@RequestParam("userName") @Valid String userName) throws IBSException {
		ModelAndView mv = null;
		mv = new ModelAndView("accountSummary.jsp", "customerInfo", customerImpl.getCustomerData(userName));
		mv.addObject("userName", userName);
		return mv;
	}
	
	@GetMapping("/addBnfPage")
	public ModelAndView addBnfPage(@RequestParam("userName") String userName) throws IBSException {
		ModelAndView mv = null;
		System.out.println("in addBnfPage - " +userName);
		mv = new ModelAndView("addBeneficiary.jsp", "userName", userName);
		return mv;
	}
	
	@GetMapping("/fundsTransferHome")
	public ModelAndView fundsTransferHome(@RequestParam("userName") @Valid String userName) throws IBSException {
		ModelAndView mv = null;
		System.out.println("in fundsTransferHome");
		mv = new ModelAndView("/fundsTransferHome.jsp","bncfryList",customerImpl.getListOfBnfcry(userName));
		System.out.println("1  " +customerImpl.getListOfBnfcry(userName).get(0).getBnfcryAcctName());

		mv.addObject("userName", userName);
		return mv;
	}
	
	@PostMapping("/transferFunds")
	public ModelAndView transferFunds(@RequestParam("bnfcryId") long bnfcryId) throws IBSException {
		ModelAndView mv = null;
		
		return mv;
	}
	
	@PostMapping("/addBnfcry")
	public ModelAndView addBnfcry(@ModelAttribute("addBnf") @Valid CustomerBeneficiaryDto addBnfcry, @RequestParam("userName")  String userName, 
														BindingResult result) throws IBSException {
		ModelAndView mv = null;
		System.out.println("in addBnfcry");
		customerImpl.addBeneficiary(addBnfcry,userName);
		List<CustomerBeneficiaryDto> benList = customerImpl.getListOfBnfcry(userName);
		mv = new ModelAndView("/fundsTransferHome.jsp","bncfryList",benList);
		System.out.println("2  "+benList.get(0).getBnfcryAcctName());
		mv.addObject("userName", userName);
		return mv;
	}
	
	public static String from(BindingResult result) {
		StringBuilder sb = new StringBuilder();
		
		for(ObjectError err : result.getAllErrors()) {
			sb.append(err.getDefaultMessage()+",");
		}
		
		return sb.toString();
	} 
}
