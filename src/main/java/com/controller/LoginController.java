package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.LoginDetail;
import com.services.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@RequestMapping(value="/login", method=RequestMethod.POST,consumes="application/json")
	public @ResponseBody ResponseEntity<LoginDetail> doLogin(@RequestBody LoginDetail loginDetail){
	
		loginDetail = loginService.doLogin(loginDetail.getUserName(),loginDetail.getPassword());
		
		return new ResponseEntity<LoginDetail>( loginDetail ,HttpStatus.OK);		
	}
	
	


}
