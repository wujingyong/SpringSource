package com.wjy.section9.spring_mybatis;

import com.wjy.section9.User;
import com.wjy.section9.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section9/spring_mybatis/spring-mybatis.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User user = userMapper.getUser(3);
        SqlSessionFactory bean = context.getBean(SqlSessionFactory.class);
        System.out.println(user);
    }

    @Test
    public void test() {
        String str = "null";
        Assert.notNull(str, "xxx不能为空");
        List<String> list = new ArrayList<>();
        list.add(str);
        Assert.notEmpty(list, "数组不能为空");
        System.out.println(str);
    }
}
