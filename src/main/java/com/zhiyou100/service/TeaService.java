package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.Selector;
import com.zhiyou100.model.TeaLeaf;

public interface TeaService {

	/**
	 * 获取茶叶信息
	 * @return
	 */
	List<TeaLeaf> listTeaLeaf(Selector selector);
	
	/**
	 * 添加茶叶
	 * @return
	 */
	void addTeaLeaf(TeaLeaf tea);
	/**
	 * 分的总页数
	 * @return
	 */
	Integer getPageCount();
	/**
	 * 等级个数
	 */
	Integer getCountBy(Integer gradeId);
	
	TeaLeaf getTea(int id);
}
