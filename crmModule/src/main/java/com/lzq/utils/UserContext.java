package com.lzq.utils;

import java.util.Map;

import com.lzq.pojo.Employee;
import com.opensymphony.xwork2.ActionContext;

/**
 * 用户上下文，工具类, 往session设置登陆用户以及获取登陆用户
 * @author AdminTH
 *
 */
public class UserContext {

	// Struts中表示session的map集合
		
	
	// 存储到session中的登陆用户的key
	private static final String USER_INF = "user_info";
	
	
	// 设置登陆用户
	public static void setUser(Employee employee){
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put(USER_INF, employee);
	}
	
	// 退出
	public static void out() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove(USER_INF);
	}
	
	// 获取登陆用户
	public static Employee get(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		return (Employee) session.get(USER_INF);
	}
}














