package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.TeaLeafDao;
import com.zhiyou100.model.Selector;
import com.zhiyou100.model.TeaLeaf;
import com.zhiyou100.service.TeaService;

@Service
public class TeaServiceImpl implements TeaService{

	@Autowired
	private TeaLeafDao dao;
	
	public List<TeaLeaf> listTeaLeaf(Selector selector) {
		
		selector.setPageIndex((selector.getPageIndex()-1)*7);
		
		return dao.listTeaLeaf(selector);
	}

	public void addTeaLeaf(TeaLeaf tea) {
		
		dao.addTeaLeaf(tea);
		
	}

	
	public Integer getPageCount() {
		
		int m=dao.getCount();
		
		int n=7;
		
		return (m+n-1)/n;
	}

	public Integer getCountBy(Integer gradeId) {
		
		return dao.getCountBy(gradeId);
	}

	public TeaLeaf getTea(int id) {
		
		return dao.getTea(id);
	}

	
	
}
