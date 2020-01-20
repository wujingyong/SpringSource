package com.wjy.section10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbcTransaction {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section10/JdbcTransaction.xml");
        UserService userService = context.getBean(UserService.class);
//        int gg = userService.save(new User().setName("gg"));
//        System.out.println(gg);
        User select = userService.select(1);
        System.out.println(select);
    }
}
