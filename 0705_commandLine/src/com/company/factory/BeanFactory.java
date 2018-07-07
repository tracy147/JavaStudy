package com.company.factory;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BeanFactory {

    //1. 只能用于读取.properties文件，别的文件读不了；
    //2. 只能读，不能写；
    //3. 只能读取类路径下的，不是类路径的读不了
    private static ResourceBundle bundle = ResourceBundle.getBundle("bean");

    private static Map<String, Object> beans = new HashMap<>();

    static {
        try {
            Enumeration<String> keys = bundle.getKeys();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                String beanPath = bundle.getString(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("creat bean failed.");
        }
    }


    public static Object getBean(String beanName) {
        return beans.get(beanName);
    }
}

