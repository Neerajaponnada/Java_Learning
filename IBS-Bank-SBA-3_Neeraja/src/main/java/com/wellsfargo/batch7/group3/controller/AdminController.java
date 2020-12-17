package com.wellsfargo.batch7.group3.controller;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch7.group3.dto.AccountStatementDto;
import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.exception.IBSException;
import com.wellsfargo.batch7.group3.service.impl.AdminServiceImpl;
import com.wellsfargo.batch7.group3.service.impl.CustomerImpl;

@Controller
@RequestMapping
public class AdminController  {

	@Autowired
	private AdminServiceImpl adminSerImpl;
	
	@Autowired
	private CustomerImpl customerImpl;
	
	@PostMapping("/register")
	public ModelAndView registerAction(@ModelAttribute("register") @Valid KycDetailsDto newUser, BindingResult result) throws IBSException {
		ModelAndView mv = null;
		if (result.hasErrors()) {
			System.out.println(result.getErrorCount()+" errors exist");
			System.out.println(result.getAllErrors());
			mv = new ModelAndView("registrationForm.jsp", "register", newUser);
		} else {
			adminSerImpl.register(newUser);
			mv = new ModelAndView("redirect:/registrationSuccess.jsp");
			mv.addObject("newUser", newUser );
		}
		return mv;
	}
	
	@GetMapping("/adminStmt")
	public ModelAndView filterAcctStmt(@ModelAttribute("adminStmt") @Valid AccountStatementDto filterStmtData) throws IBSException, ParseException {
		ModelAndView mv = null;
		System.out.println(filterStmtData.getCustAcctNum());
		System.out.println(filterStmtData.getStartDate());
		System.out.println(filterStmtData.getEndDate());
		System.out.println(filterStmtData.getUserName());
		
			mv = new ModelAndView("/adminGetCustTransactions.jsp","acctStmt",customerImpl.getFilteredStatement(filterStmtData));
//			mv.addObject("custAcctNum",customerImpl.getCustomerData(userName).get(0).getCustAcctNum());
			mv.addObject("userName", filterStmtData.getUserName());
			mv.addObject("custAcctNum", filterStmtData.getCustAcctNum());
		return mv;
	}
	
	@GetMapping(value = "/openRequests")
	public ModelAndView newOpenAccounts() throws IBSException {
		
		ModelAndView mv = null;
		List<KycDetailsDto> allOpenReq = adminSerImpl.getAllOpenReq();
		mv = new ModelAndView("redirect:/adminAllOpenRequests.jsp");
		mv.addObject("allOpenRequests", allOpenReq);
		mv = new ModelAndView("/adminAllOpenRequests.jsp","allOpenRequests",allOpenReq);
		return mv;
	}

	@GetMapping("/approve")
	public ModelAndView approveAction(@RequestParam("regId") long regId) throws IBSException {
		ModelAndView mv = null;
		mv = new ModelAndView("/adminAllOpenRequests.jsp","allOpenRequests",adminSerImpl.approveAcct(regId));
		String rejectAcct = "Reg Id " +regId + " is approved !!";
		mv.addObject("approvalStatus", rejectAcct);
		mv.addObject("allOpenRequests", adminSerImpl.getAllOpenReq());
		return mv;
	}
	
	@GetMapping("/reject")
	public ModelAndView rejectAction(@RequestParam("regId") long regId) throws IBSException {
		ModelAndView mv = null;
		mv = new ModelAndView("adminAllOpenRequests.jsp","allOpenRequests",adminSerImpl.rejectAcct(regId));
		String rejectAcct = "Reg Id " +regId + " is rejected !!";
		mv.addObject("approvalStatus", rejectAcct);
		mv.addObject("allOpenRequests", adminSerImpl.getAllOpenReq());
		return mv;
	}
	
//	@PostMapping("/getCustomerStatement")
//	public ModelAndView registerAction(@ModelAttribute("register") @Valid KycDetailsDto newUser, BindingResult result) throws IBSException {
//		
//		return mv;
//	}
//	
//	@PostMapping("/checkTransactions")
//	public ModelAndView registerAction(@ModelAttribute("register") @Valid KycDetailsDto newUser, BindingResult result) throws IBSException {
//		
//		return mv;
//	}
}
