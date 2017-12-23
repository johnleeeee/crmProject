package com.lzq.service.impl;

import com.lzq.dao.IDepartmentDao;
import com.lzq.pojo.Department;
import com.lzq.service.IDepartmentService;

import java.io.Serializable;
import java.util.List;

/**
 * 部门业务层操作类
 */
public class DepartmentService implements IDepartmentService {

    private IDepartmentDao departmentDao ;

    public void setDepartmentDao(IDepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    /**
     * 保存
     * @param department
     */
    public void save(Department department) {
        departmentDao.save(department);
    }

    public void update(Department department) {
        departmentDao.update(department);
    }

    public void delete(Serializable id) {
        departmentDao.delete(id);
    }

    public Department findById(Serializable id) {
        return departmentDao.findById(id);
    }

    public List<Department> getAll() {
        return departmentDao.getAll();
    }
}
