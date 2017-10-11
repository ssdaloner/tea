package com.zhiyou100.model;

public class ReponseVo<T> {
	
	/**
     * 操作的执行结果
     */
    private int errorCode;
    
    /**
     * 执行结果的文字描述
     */
    private String message;
    
    /**
     * 返回给客户端的数据
     */
    private T data;
    /**
     * 页码
     */
    private int page;
    
    /**
     * 最终等级
     */
    private String grade;
    /**
     * 集合大小
     */
    private int count;

	public ReponseVo(int errorCode, String message, T data, int page, int count) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.data = data;
		this.page = page;
		this.count = count;
	}

	public ReponseVo() {
		super();
	}
    
	public ReponseVo(int errorCode, String message, T data, String grade) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.data = data;
		this.grade = grade;
	}

	public ReponseVo(int errorCode, String message, T data, int page) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.data = data;
		this.page = page;
	}
	
	public ReponseVo(int errorCode, String message, T data) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ReponseVo [errorCode=" + errorCode + ", message=" + message + ", data=" + data + "]";
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}



	


	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
    
	

}
