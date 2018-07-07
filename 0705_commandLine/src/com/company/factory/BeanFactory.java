package com.company.factory;

import com.company.dao.ICustomerDao;
import com.company.service.ICustomerService;

public class BeanFactory {

    public static ICustomerService getCustomerService() {
        try {
            return (ICustomerService) Class.forName("com.company.service.impl.CustomerServiceImpl").newInstance();
        } catch (Exception e) {
            throw new RuntimeException("erre message: " + e);
        }
    }

    public static ICustomerDao getICustomerDao() {
        try {
            return (ICustomerDao) Class.forName("com.company.dao.impl.CustomerDaoImpl").newInstance();
        } catch (Exception e) {
            throw new RuntimeException("erre message: " + e);
        }
    }
}

