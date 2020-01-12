package com.wjy.section7.jdkProxy;

import com.wjy.section3.Student;

public class ProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
        UserService proxy = (UserService)myInvocationHandler.getProxy();
        proxy.add();
        proxy.delete("字符", new Person().setName("名字").setAge(12));
    }
}
