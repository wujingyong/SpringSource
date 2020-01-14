package com.wjy.section8;

import com.alibaba.fastjson.JSON;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringJdbcTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section8/jdbc.xml");
        UserService userService = context.getBean(UserService.class);
//        int save = userService.save(new User().setName("名字").setAge(13).setSex("男"));
//        System.out.println(save);
//        save = userService.save(new User().setName("bb").setAge(11).setSex("girl"));
//        System.out.println(save);
        List<User> users = userService.getUsers();
        users.forEach(e -> System.out.println(JSON.toJSONString(e)));

    }
}
