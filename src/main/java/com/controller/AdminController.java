package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.LoginDetail;
import com.repository.UserDao;
import com.services.AdminServices;

@RestController
public class AdminController {
	@Autowired
	AdminServices adminServices;
	
	
	@RequestMapping(value="/getUsers", method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public  @ResponseBody ResponseEntity<List<LoginDetail>> adminHandler(){
		return new ResponseEntity<List<LoginDetail>>(adminServices.getUserDetails(),HttpStatus.OK);
	}
}
