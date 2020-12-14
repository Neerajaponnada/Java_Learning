package com.wellsfargo.batch7.group3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HomeController  {

//	@Autowired
//	private ICustomerService customerService;
//	
//	@Autowired
//	private IAdminService adminService;
	
	@GetMapping({ "", "/", "/home" })
	public ModelAndView homeAction() {
		ModelAndView mv = null;
		mv = new ModelAndView("redirect:/index.jsp");
		return mv;
	}
		

}