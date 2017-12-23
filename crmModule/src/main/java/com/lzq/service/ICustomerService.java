package com.lzq.service;

import com.lzq.pojo.Customer;

import java.util.List;

public interface ICustomerService extends IBaseService<Customer>{
    // 显示作为的客户
    List<Customer> getByStatus(int status);
}
