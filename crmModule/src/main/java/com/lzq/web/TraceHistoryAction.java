package com.lzq.web;

import com.lzq.pojo.Customer;
import com.lzq.pojo.Employee;
import com.lzq.pojo.TraceHistory;
import com.lzq.utils.UserContext;

import java.util.List;

/**
 * 客户跟进历史，控制层
 * @author AdminTH
 *
 */
public class TraceHistoryAction extends BaseAction{
	
	private TraceHistory traceHistory;
	public void setTraceHistory(TraceHistory traceHistory) {
		this.traceHistory = traceHistory;
	}
	public TraceHistory getTraceHistory() {
		return traceHistory;
	}
	
	
	// 封装客户信息
	private Customer customer;
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * 1. 进入客户跟进历史页面
	 */
	public String viewEdit(){
//		查询所有的营销人员   (跟进的客户，在jsp页面从session获取，就是当前登陆用户)
//		List<Employee> listEmp = employeeService.getAll();
//		request.put("listEmp", listEmp);
		
		// 跟进的客户，需要从jsp页面传入；   营销人员就是当前的登陆用户
		if (customer != null) {
			customer = customerService.findById(customer.getId());
		}
		return "edit";
	}

	/**
	 * 2. 客户跟进
	 */
	public String save() {
		// 根跟进记录对象，封装数据
		//--> 封装跟进客户
		traceHistory.setCustomer(customer);
		//--> 封装跟进的营销人员 (从session获取Employee对象，即为当前的登陆用户)
		Employee employee = UserContext.get();
		traceHistory.setEmployee(employee);
		
		// 保存跟进记录
		traceHistoryService.save(traceHistory);
		
		return "save";
	}
	
	/**
	 * 3. 跟进记录记录，列表
	 */
	public String list() {
		// 所有客户跟进
		List<TraceHistory> listTraceHistory = traceHistoryService.getAll();
		request.put("listTraceHistory", listTraceHistory);
		return "list";
	}
}












