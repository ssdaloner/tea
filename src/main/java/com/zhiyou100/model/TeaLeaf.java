package com.zhiyou100.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TeaLeaf extends Tea implements Comparable<TeaLeaf>{

	public TeaLeaf() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	@Override
	public String toString() {
		return "TeaLeaf [teagradeId=" + teagradeId + ", votes=" + votes + ", createTime=" + createTime + ", count="
				+ count + ", pageIndex=" + pageIndex + ", gradeName=" + gradeName + ", r=" + r + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gradeName == null) ? 0 : gradeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeaLeaf other = (TeaLeaf) obj;
		if (gradeName == null) {
			if (other.gradeName != null)
				return false;
		} else if (!gradeName.equals(other.gradeName))
			return false;
		return true;
	}




	/**
	 * 茶叶品级
	 */
	private Long teagradeId;
	/**
	 * 得票数
	 */
	private Integer votes;
	
	/**
	 * 茶叶创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
	private Date createTime;
	/**
	 * 茶叶总页数
	 */
	private Integer count;
	/**
	 * 页码
	 */
	private Integer pageIndex;
	
	public Integer getCount() {
		return count;
	}




	public void setCount(Integer count) {
		this.count = count;
	}




	public Integer getPageIndex() {
		return pageIndex;
	}




	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}




	public static TeaSortType getSortType() {
		return sortType;
	}




	public static void setSortType(TeaSortType sortType) {
		TeaLeaf.sortType = sortType;
	}




	public static boolean isDesc() {
		return desc;
	}




	public static void setDesc(boolean desc) {
		TeaLeaf.desc = desc;
	}




	private String gradeName;
	
	private double r;
	
	
	
	public static TeaSortType sortType;
	public static boolean desc;

	public Long getTeagradeId() {
		return teagradeId;
	}

	public void setTeagradeId(Long teagradeId) {
		this.teagradeId = teagradeId;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public int compareTo(TeaLeaf o) {
        int result = 0;
		
		// 处理排序类别
		switch (TeaLeaf.sortType) {
		case SIZE: {
			
			result = (int) (this.teagradeId - o.teagradeId);
		}
			break;
		case INSTALL_TIME: {
			
			result = this.createTime.compareTo(o.createTime);
		}
			break;

		default:
			break;
		}
		
		// 处理升降序
		if (TeaLeaf.desc) {
			
			result *= -1; // result = result * -1
		}
		
		return result;
	}
	
}
