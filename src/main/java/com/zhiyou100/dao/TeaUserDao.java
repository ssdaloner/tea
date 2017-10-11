package com.zhiyou100.dao;

import com.zhiyou100.model.TeaUser;

public interface TeaUserDao {

	Integer getUser(Integer userId);
	
	void addUser(TeaUser teaUser);
}
