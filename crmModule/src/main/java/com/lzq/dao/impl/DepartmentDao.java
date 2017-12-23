package com.lzq.dao.impl;

import com.lzq.dao.IDepartmentDao;
import com.lzq.pojo.Department;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

/**
 * 部门持久化操作类
 */
public class DepartmentDao extends BaseDao<Department> implements IDepartmentDao {

}
