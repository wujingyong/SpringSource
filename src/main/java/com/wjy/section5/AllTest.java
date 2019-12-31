package com.wjy.section5;

import com.wjy.section5.practice5_7_4.TestAware;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

class AllTest {
    @Test
    public void carFactoryBeanTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("section5/bean.xml");
        CarFactoryBean carFactoryBean = (CarFactoryBean) applicationContext.getBean("&car");
        carFactoryBean.getCarInfo();
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }

    @Test
    void practice5_6_2Test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("section5/practice5_6_2.xml");
        applicationContext.getBean("testA");
    }

    @Test
    void practice5_7_4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("section5/practice5_7_4.xml");
        TestAware testAware = (TestAware) applicationContext.getBean("testAware");
        testAware.test();
    }
}
