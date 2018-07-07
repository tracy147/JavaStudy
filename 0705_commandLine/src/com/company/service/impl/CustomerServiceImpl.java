package com.company.service.impl;

import com.company.dao.ICustomerDao;

import com.company.factory.BeanFactory;
import com.company.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

    private ICustomerDao customerDao = (ICustomerDao) BeanFactory.getBean("CUSTOMERDAO");

    @Override
    public void saveCustomer() {
        System.out.println("业务层调用持久层");
        customerDao.saveCustomer();

    }
}
