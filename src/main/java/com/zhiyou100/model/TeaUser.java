package com.zhiyou100.model;

public class TeaUser {

	private Integer id;
	
	private Integer userId;
	
	private Integer teabrandId;

	public TeaUser(Integer id, Integer userId, Integer teabrandId) {
		super();
		this.id = id;
		this.userId = userId;
		this.teabrandId = teabrandId;
	}

	public TeaUser() {
		super();
	}

	@Override
	public String toString() {
		return "TeaUser [id=" + id + ", userId=" + userId + ", teabrandId=" + teabrandId + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTeabrandId() {
		return teabrandId;
	}

	public void setTeabrandId(Integer teabrandId) {
		this.teabrandId = teabrandId;
	}
	
	
	
}
