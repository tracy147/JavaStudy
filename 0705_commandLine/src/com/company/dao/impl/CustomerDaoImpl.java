package com.company.dao.impl;

import com.company.dao.ICustomerDao;

public class CustomerDaoImpl implements ICustomerDao {
    @Override
    public void saveCustomer() {
        System.out.println("保存客户信息");
    }
}
