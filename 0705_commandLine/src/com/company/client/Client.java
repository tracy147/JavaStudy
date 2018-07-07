package com.company.client;

import com.company.factory.BeanFactory;
import com.company.service.ICustomerService;

public class Client {

    public static void main(String[] args) {

        for(int i = 0; i <= 3; i++) {
            ICustomerService customerService = (ICustomerService) BeanFactory.getBean("CUSTOMERSERVIVCE");
            System.out.println(customerService.toString());
//            customerService.saveCustomer();
        }
    }
}
