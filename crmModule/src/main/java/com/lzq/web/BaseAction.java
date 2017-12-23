package com.lzq.web;

import java.util.Map;

import com.lzq.service.*;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * BaseAction, 
 * 	1. 所有的表示域的map在接收接收
 *  2. 所有的Service，都在这里接收IOC容器注入结果
 */
public class BaseAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{

	// map
	protected Map<String, Object> request;	// 保存struts在运行时期注入的表示request的map
	protected Map<String, Object> session;	// 保存struts在运行时期注入的表示session的map
	protected Map<String, Object> application;	// 保存struts在运行时期注入的表示application的map
	
	// Service
	// 注入Service对象
	protected IDepartmentService departmentService;
	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	protected IEmployeeService employeeService;
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	protected ICustomerService customerService;
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	protected ITraceHistoryService traceHistoryService;	// 客户跟进
	public void setTraceHistoryService(ITraceHistoryService traceHistoryService) {
		this.traceHistoryService = traceHistoryService;
	}
	protected ITransferHistoryService transferHistoryService;	// 客户移交
	public void setTransferHistoryService(ITransferHistoryService transferHistoryService) {
		this.transferHistoryService = transferHistoryService;
	}



	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

}
