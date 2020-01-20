package com.wjy.secton12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section11/RMIClient.xml");
        HelloRMIService myClient = context.getBean("myClient", HelloRMIService.class);
        int add = myClient.getAdd(1, 2);
        System.out.println(add);
    }
}
