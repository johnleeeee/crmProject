package com.lzq.dao.impl;

import com.lzq.dao.IEmployeeDao;
import com.lzq.pojo.Employee;

import java.util.List;

public class EmployeeDao extends BaseDao<Employee> implements IEmployeeDao {

    /**
     * 重写方法，解除懒加载
     * @return
     */
    /*@Override
       public List<Employee> getAll() {
        return (List<Employee>) getHibernateTemplate().find("from Employee e inner join fetch e.department");
    }*/
}
