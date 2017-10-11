package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.TeaBrand;

public interface TeaBrandService {

	void updateVotes(Integer id);
	
	List<Integer> getVotes();
	
	List<TeaBrand> listTeabrands();
}
