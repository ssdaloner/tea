package com.zhiyou100.model;

public class User {

	
	private Integer id;
	
	private String number;

	public User() {
		super();
	}
	
	
	public User(Integer id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", number=" + number + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
}
