package com.wjy.aspectj;

public aspect TxAspect {
    void around(): call(void sayHello()){
        System.out.println("begin");
        proceed();
        System.out.println("end");
    }
}
