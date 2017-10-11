package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.TeaBrand;

public interface TeaBrandDao {

	
	void updateVotes(Integer id);
	
	List<Integer> getVotes();
	
	List<TeaBrand> listTeabrands();
	
}
