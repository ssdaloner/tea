package com.zhiyou100.model;

import java.sql.Date;

public class Tea {

	/**
	 * 茶叶ID
	 */
	private Long id;
	/**
	 * 茶叶名（品级名）
	 */
	private String name;
	/**
	 * 茶叶形状
	 */
	private float shape;
	/**
	 * 茶叶颜色
	 */
	private float color;
	/**
	 * 茶叶纯度
	 */
	private float purity;
	/**
	 * 茶叶汤色
	 */
	private float soupColor;
	/**
	 * 茶叶香气
	 */
	private float sweetSmell;
	/**
	 * 茶叶滋味
	 */
	private float smell;
	/**
	 * 叶底
	 */
	private float leafButtom;
	public Tea(Long id, String name, float shape, float color, float purity, float soupColor, float sweetSmell,
			float smell, float leafButtom) {
		super();
		this.id = id;
		this.name = name;
		this.shape = shape;
		this.color = color;
		this.purity = purity;
		this.soupColor = soupColor;
		this.sweetSmell = sweetSmell;
		this.smell = smell;
		this.leafButtom = leafButtom;
	}
	public Tea() {
		super();
	}
	@Override
	public String toString() {
		return "Tea [id=" + id + ", name=" + name + ", shape=" + shape + ", color=" + color + ", purity=" + purity
				+ ", soupColor=" + soupColor + ", sweetSmell=" + sweetSmell + ", smell=" + smell + ", leafButtom="
				+ leafButtom + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getShape() {
		return shape;
	}
	public void setShape(float shape) {
		this.shape = shape;
	}
	public float getColor() {
		return color;
	}
	public void setColor(float color) {
		this.color = color;
	}
	public float getPurity() {
		return purity;
	}
	public void setPurity(float purity) {
		this.purity = purity;
	}
	public float getSoupColor() {
		return soupColor;
	}
	public void setSoupColor(float soupColor) {
		this.soupColor = soupColor;
	}
	public float getSweetSmell() {
		return sweetSmell;
	}
	public void setSweetSmell(float sweetSmell) {
		this.sweetSmell = sweetSmell;
	}
	public float getSmell() {
		return smell;
	}
	public void setSmell(float smell) {
		this.smell = smell;
	}
	public float getLeafButtom() {
		return leafButtom;
	}
	public void setLeafButtom(float leafButtom) {
		this.leafButtom = leafButtom;
	}
	
}
