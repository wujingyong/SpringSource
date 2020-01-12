package com.wjy.section7.jdkProxy;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=====before=======");
        System.out.println("=====args: " + JSON.toJSONString(args) + "========");
        Object invoke = method.invoke(target, args);
        System.out.println("=====result: " + JSON.toJSONString(invoke) + "========");
        System.out.println("=====after=======");
        return invoke;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
