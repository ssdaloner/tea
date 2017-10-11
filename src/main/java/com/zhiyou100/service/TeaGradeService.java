package com.zhiyou100.service;

import java.util.ArrayList;
import java.util.List;

import com.zhiyou100.model.TeaLeaf;
import com.zhiyou100.model.Teagrade;

public interface TeaGradeService {

	List<Teagrade> listTeagrade();
	
	Long getTeagradeId(TeaLeaf teaLeaf);
	
	TeaLeaf method1(Teagrade teagrade, TeaLeaf tLeaf);
	
	TeaLeaf method2(ArrayList<TeaLeaf> al);
	
	ArrayList<TeaLeaf> method3(List<Teagrade> aList, TeaLeaf tLeaf);
}
