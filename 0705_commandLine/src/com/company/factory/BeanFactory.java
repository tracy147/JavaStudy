package com.company.factory;

import java.util.ResourceBundle;

public class BeanFactory {

    //1. 只能用于读取.properties文件，别的文件读不了；
    //2. 只能读，不能写；
    //3. 只能读取类路径下的，不是类路径的读不了
    private static ResourceBundle bundle = ResourceBundle.getBundle("bean");

    public static Object getBean(String beanName){

        try {
            return Class.forName(bundle.getString(beanName)).newInstance();
        } catch (Exception e) {
            throw new RuntimeException("erre message: " + e);
        }
    }
}

