//package com.wellsfargo.batch7.group3.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.jms.JmsProperties.DeliveryMode;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.ObjectError;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
//import com.wellsfargo.batch7.group3.exception.IBSException;
//import com.wellsfargo.batch7.group3.service.IAdminService;
//import com.wellsfargo.batch7.group3.service.ICustomerService;
//
//@Controller
//@RequestMapping("/pages")
//public class CustomerController {
//
//	@Autowired
//	private ICustomerService customerService;
//	
//	@Autowired
//	private IAdminService adminService;
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
//}
