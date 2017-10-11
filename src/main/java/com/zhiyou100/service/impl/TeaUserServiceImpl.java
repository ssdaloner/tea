package com.zhiyou100.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.TeaUserDao;
import com.zhiyou100.model.TeaUser;
import com.zhiyou100.service.TeaUserService;

@Service
public class TeaUserServiceImpl implements TeaUserService{

	@Autowired
	private TeaUserDao dao;
	
	
	public Integer getUser(Integer userId) {
		
		
		return dao.getUser(userId);
	}

	public void addUser(TeaUser teaUser) {
		
		dao.addUser(teaUser);
		
	}

}
