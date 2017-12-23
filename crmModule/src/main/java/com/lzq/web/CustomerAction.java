package com.lzq.web;

import com.lzq.pojo.Customer;

import java.util.List;

/*
 * 员工模块
 * 1. 进入添加员工页面
 * 2. 列表功能
 * 3. 添加员工信息
 * 4. 修改功能
 */
public class CustomerAction extends BaseAction {
	
	public CustomerAction(){
		System.out.println("----------->CustomerAction.CustomerAction()");
	}
	
	
	// 封装请求数据
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	// 1. 进入添加“客户”页面
	public String viewEdit(){
		
		/********判断是否是进入编辑页面，如果是那就根据主键查询，最后jsp在数据回显**********/
		if (customer != null) {
			// 主键查询
			customer = customerService.findById(customer.getId());
		}
		
		// 跳转到添加页面
		return "viewEdit";
	}
	
	// 2. 员工列表
	public String list(){
		// 查询所有员工信息
		List<Customer> listCustomer = customerService.getAll();
		// 保存
		request.put("listCustomer", listCustomer);
		return "list";
	}
	
	// 3. 添加客户信息
	public String save() {
		// 新增的客户，1
		customer.setStatus(1);
		customerService.save(customer);
		return list();
	}
	
	// 4. 修改
	public String update() {
		customerService.update(customer);
		return list();
	}

	// 作废 / 认领
	public String updateStatus() {
		// 先根据客户主键查找
		Customer c = customerService.findById(customer.getId());
		// 设置客户状态
		c.setStatus(customer.getStatus());
		// 更新
		customerService.update(c);
		return list();
	}

	//  客户资源池列表显示, 只显示作废的客户
	public String findByStatus() {
		List<Customer> listCustomer = customerService.getByStatus(0);
		request.put("listCustomer", listCustomer);
		return "listByStatus";
	}
}













