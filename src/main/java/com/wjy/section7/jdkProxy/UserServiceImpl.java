package com.wjy.section7.jdkProxy;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("=========add=========");
    }

    @Override
    public Person delete(String str, Person person) {
        System.out.println("=====delete=====");
        return person.setName(str);
    }
}
