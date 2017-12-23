package com.lzq.service.impl;

import com.lzq.dao.IEmployeeDao;
import com.lzq.pojo.Employee;
import com.lzq.service.IEmployeeService;

import java.io.Serializable;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeDao employeeDao ;
    public void setEmployeeDao(IEmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    public void delete(Serializable id) {
        employeeDao.delete(id);
    }

    public Employee findById(Serializable id) {
        return employeeDao.findById(id);
    }

    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    /**
     * 登录
     * @param employee
     * @return
     */
    public Employee login(Employee employee) {
        String hql = "from Employee where name=? and password=?";
        List<Employee> list = employeeDao.getByCondition(hql, employee.getName(), employee.getPassword());
        if(list != null && list.size()>0){
            //登录成功
            return list.get(0);
        }
        //登录失败
        return null;
    }
}
