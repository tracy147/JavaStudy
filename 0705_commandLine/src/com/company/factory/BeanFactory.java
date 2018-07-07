package com.company.factory;

import com.company.service.ICustomerService;

public class BeanFactory {

    public ICustomerService getCustomerService() {
        try {
            return (ICustomerService) Class.forName("com.company.dao.impl.CustomerServiceImpl").newInstance();
        } catch (Exception e) {
            throw new RuntimeException("erre message: " + e);
        }
    }
}

