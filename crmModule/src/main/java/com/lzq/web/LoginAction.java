package com.lzq.web;

import com.lzq.pojo.Employee;
import com.lzq.utils.UserContext;

/**
 * 登陆
 */
public class LoginAction extends BaseAction{
	
	// 封装登陆员工信息
	private Employee employee;
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}

	// 登陆
	public String login()  {
		// 调用service登陆
		Employee emp = employeeService.login(employee);
		// 判断
		if (emp != null) {
			// 登陆成功, 保存到session
			UserContext.setUser(emp);
			return SUCCESS;
		}else {
			// 登陆失败，需要更多的输入(input)
			return INPUT;
		}
	}
	
	// 退出
	public String out()  {
		// 退出
		UserContext.out();
		// 退出后去到登陆页面
		return INPUT;  
	}
}








