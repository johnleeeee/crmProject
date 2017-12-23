package com.lzq.service;

import com.lzq.pojo.Department;
import com.lzq.pojo.Employee;

import java.io.Serializable;
import java.util.List;

public interface IEmployeeService extends IBaseService<Employee> {
    /**
     * 登录业务处理方法
     * @param employee
     * @return
     */
    Employee login(Employee employee);
}

