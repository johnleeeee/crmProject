package com.lzq.service.impl;

import com.lzq.dao.ICustomerDao;
import com.lzq.pojo.Customer;
import com.lzq.service.ICustomerService;

import java.io.Serializable;
import java.util.List;

public class CustomerService implements ICustomerService {
	
	// 注入dao
	private ICustomerDao customerDao;
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void delete(Serializable id) {
		customerDao.delete(id);
	}

	public Customer findById(Serializable id) {
		return customerDao.findById(id);
	}

	public List<Customer> getAll() {
		List<Customer> list = customerDao.getAll();
		return list;
	}

	public void save(Customer t) {
		customerDao.save(t);
	}

	public void update(Customer t) {
		customerDao.update(t);
	}

	/**
	 *
	 * @param status
	 * @return
	 */
	public List<Customer> getByStatus(int status) {
		String hql = "from Customer where status=?";
		return customerDao.getByCondition(hql, status);
	}

}







