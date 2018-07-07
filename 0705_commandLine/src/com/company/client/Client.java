package com.company.client;

import com.company.factory.BeanFactory;
import com.company.service.ICustomerService;

public class Client {

    public static void main(String[] args) {
        ICustomerService customerService = (ICustomerService) BeanFactory.getBean("CUSTOMERSERVIVCE");
        customerService.saveCustomer();
    }
}
