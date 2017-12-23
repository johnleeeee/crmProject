package com.lzq.interceptor;

import com.lzq.pojo.Employee;
import com.lzq.utils.UserContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 登陆验证拦截器
 * @author AdminTH
 *
 */
public class AuthInterceptor extends AbstractInterceptor{

	public String intercept(ActionInvocation invocation) throws Exception {
		// 获取session中登陆用户
		Employee emp = UserContext.get();
		// 如果登陆， 就放行（去到下一个拦截器、Action）
		if (emp != null) {
			return invocation.invoke();
		}
		
		// 如果没有登陆，就不放行，跳转到“input”登陆视图
		return "input";
	}

}
