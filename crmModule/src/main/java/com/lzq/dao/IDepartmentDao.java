package com.lzq.dao;

import com.lzq.pojo.Department;

import java.io.Serializable;
import java.util.List;

public interface IDepartmentDao {

    /**
     * 保存
     * @param department
     */
    void save(Department department);

    /**
     * 更新
     * @param department
     */
    void update(Department department);

    /**
     * 删除
     * @param id
     */
    void delete(Serializable id);
    /**
     * 部门主键查询
     * @param id
     */
    Department findById(Serializable id);

    /**
     * 查询全部
     * @return
     */
    List<Department> getAll();
}
