package com.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.LoginDetail;
import com.repository.UserDao;

@Service
@Transactional
public class LoginService {
	@Autowired
	UserDao userDao;
	
	public LoginDetail doLogin(String userName,String password){
		
		return  userDao.findByUserNameAndPassword(userName, password);
	}
}
