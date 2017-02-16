package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String sendTo(){
		return "index";
	}
	
	
	@RequestMapping(value="/admin/adminDashboard", method=RequestMethod.GET)
	public String sendAdmin(){
		return "adminDashboard";
	}
	
}
