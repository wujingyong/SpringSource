package com.wjy.section3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLockUp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("section3/lookUpTest.xml");
        GetBeanTest getBeanTest = (GetBeanTest) applicationContext.getBean("getBeanTest");
        getBeanTest.showMe();
    }

}
