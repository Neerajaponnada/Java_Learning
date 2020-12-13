package com.wellsfargo.batch7.group3.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.exception.IBSException;
import com.wellsfargo.batch7.group3.service.IAdminService;
import com.wellsfargo.batch7.group3.service.ICustomerService;

@Controller
public class AdminController  {

//	@Autowired
//	private ICustomerService customerService;
	
	@Autowired(required=false)
	private IAdminService adminService;
//	
	@GetMapping({ "", "/", "/home" })
	public String homeAction() {
		System.out.println("Hello !! we are in index page now");
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public ModelAndView registerAction(@ModelAttribute("register") @Valid KycDetailsDto user, BindingResult result) throws IBSException {
		ModelAndView mv = null;
		if (result.hasErrors()) {
			System.out.println("Has errors");
			System.out.println(result.getErrorCount());
			System.out.println(result.getAllErrors());
			mv = new ModelAndView("registrationForm.jsp", "register", user);
		} else {
			System.out.println("In else");
			adminService.register(user);
			mv = new ModelAndView("redirect:/registrationSuccess.jsp");
		}
		

		return mv;
	}
//	
//	@PostMapping("/register")
//	public ResponseEntity<KycDetailsDto> register(@RequestBody @Valid KycDetailsDto userInfo,BindingResult result) throws IBSException{
//		if(result.hasErrors()) {
//			throw new IBSException(from(result));
//		}
//		return new ResponseEntity<>(adminService.register(userInfo),HttpStatus.OK);
//	}
//
//	
//	public static String from(BindingResult result) {
//		StringBuilder sb = new StringBuilder();
//		
//		for(ObjectError err : result.getAllErrors()) {
//			sb.append(err.getDefaultMessage()+",");
//		}
//		
//		return sb.toString();
//	} 
}
