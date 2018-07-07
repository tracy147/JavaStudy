package com.company;

import com.company.factory.BeanFactory;
import com.company.service.ICustomerService;

public class Main {

    public static void main(String[] args) {
        ICustomerService customerService = BeanFactory.getCustomerService();
        customerService.saveCustomer();
    }
}
