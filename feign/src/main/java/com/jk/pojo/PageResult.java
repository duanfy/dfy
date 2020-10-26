package com.jk.pojo;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 3141335290631498224L;
	//总条数
	private Long total;
	//每页展示数据
	private List rows;
	//当前页
	private Integer currPage;
	//每页展示个数
	private Integer pageSize;
	//总页数
	private Long totalPage;
	
	
	public PageResult(Long total, List rows, Integer currPage,
                      Integer pageSize, Long totalPage) {
		super();
		this.total = total;
		this.rows = rows;
		this.currPage = currPage;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
	}
	
	public PageResult() {
		super();
	}

	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public Integer getCurrPage() {
		return currPage;
	}
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	@Override
	public String toString() {
		return "PageResult [total=" + total + ", rows=" + rows + ", currPage="
				+ currPage + ", pageSize=" + pageSize + ", totalPage="
				+ totalPage + "]";
	}
	
	
}
