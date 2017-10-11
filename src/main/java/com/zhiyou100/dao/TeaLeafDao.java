package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.Selector;
import com.zhiyou100.model.TeaLeaf;

public interface TeaLeafDao {

	List<TeaLeaf> listTeaLeaf(Selector selector);
	
	void addTeaLeaf(TeaLeaf leaf);
	
	Integer getCount();
	
	Integer getCountBy(int gradeId);
	
	TeaLeaf getTea(int id);
	
}
