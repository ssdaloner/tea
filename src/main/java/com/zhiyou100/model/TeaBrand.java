package com.zhiyou100.model;

public class TeaBrand {

	
	private Long id;
	
	private Integer votes;

	public TeaBrand(Long id, Integer votes) {
		super();
		this.id = id;
		this.votes = votes;
	}

	public TeaBrand() {
		super();
	}

	@Override
	public String toString() {
		return "TeaBrand [id=" + id + ", votes=" + votes + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}
	
	
}
