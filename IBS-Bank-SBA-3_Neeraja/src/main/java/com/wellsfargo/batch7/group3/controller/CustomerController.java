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
import org.springframework.web.servlet.ModelAndView;

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
				mv = new ModelAndView("redirect:/accountSummary.jsp");
			}
			mv.addObject("loginUser", loginUser);
		}
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
