package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.TeaBrandDao;
import com.zhiyou100.model.TeaBrand;
import com.zhiyou100.service.TeaBrandService;

@Service
public class TeaBrandServiceImpl implements TeaBrandService{

	@Autowired
	private TeaBrandDao dao;
	
	
	public void updateVotes(Integer id) {
		
		dao.updateVotes(id);
		
		
	}

	public List<Integer> getVotes(){
		
		return dao.getVotes();
	}

	public List<TeaBrand> listTeabrands() {
		
		return dao.listTeabrands();
	}

}
