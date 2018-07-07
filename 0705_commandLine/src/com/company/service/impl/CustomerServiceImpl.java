package com.company.service.impl;

import com.company.dao.ICustomerDao;

import com.company.service.ICustomerService;
import com.company.dao.impl.*;

public class CustomerServiceImpl implements ICustomerService {

    public ICustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public void saveCustomer() {
        System.out.println("业务层调用持久层");

    }
}
