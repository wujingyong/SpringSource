package com.wjy.section7;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectJTest {
    @Pointcut("execution(* com.wjy.section7.TestBean.test())")
    public void pointcut(){};

    @Before("pointcut()")
    public void before() {
        System.out.println("before .....");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("after ......");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("proceedingJoinPoint before ......");
        proceedingJoinPoint.proceed();
        System.out.println("proceedingJoinPoint after ......");
    }


}
