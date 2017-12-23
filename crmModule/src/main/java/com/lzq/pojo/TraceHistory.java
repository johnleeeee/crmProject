package com.lzq.pojo;

import java.util.Date;

/**
 * 核心模块： 客户资跟进历史
 */
public class TraceHistory {

	private Long id;				// 主键
	
	private Customer customer;   	// 跟进的客户（外键）
	private Employee employee; 		// 员工/营销人员(外键)
	
	private String subject;			// 跟进主题
	private String content;			// 跟进内容
	private String traceMethod;		// 跟进方式（qq/email等）
	private Date traceTime;			// 跟进时间
	private int traceResult;		// 跟进效果	 123分别表示优良差

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTraceMethod() {
		return traceMethod;
	}

	public void setTraceMethod(String traceMethod) {
		this.traceMethod = traceMethod;
	}

	public Date getTraceTime() {
		return traceTime;
	}

	public void setTraceTime(Date traceTime) {
		this.traceTime = traceTime;
	}

	public int getTraceResult() {
		return traceResult;
	}

	public void setTraceResult(int traceResult) {
		this.traceResult = traceResult;
	}
}






