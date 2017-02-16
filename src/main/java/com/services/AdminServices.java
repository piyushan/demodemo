package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.LoginDetail;
import com.repository.UserDao;

@Service
public class AdminServices {
		@Autowired
		UserDao userDao;
	
		public List<LoginDetail> getUserDetails(){
			List<LoginDetail> loginDetails =  userDao.findAll();
			for (LoginDetail loginDetail : loginDetails) {
				loginDetail.setPassword("*****");
			}
			return loginDetails;
		}
}
