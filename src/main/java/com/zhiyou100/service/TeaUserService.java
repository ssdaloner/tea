package com.zhiyou100.service;

import com.zhiyou100.model.TeaUser;

public interface TeaUserService {

    Integer getUser(Integer userId);
	
	void addUser(TeaUser teaUser);
	
}
