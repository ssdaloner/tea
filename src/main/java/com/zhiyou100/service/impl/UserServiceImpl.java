package com.zhiyou100.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.UserDao;
import com.zhiyou100.model.User;
import com.zhiyou100.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	public void addUser(User user) {
		
		dao.addUser(user);
		
	}

	public User getUser(User user) {
		
		return dao.getUser(user);
	}

}
