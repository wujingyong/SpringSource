package com.wjy.section7.staticAop;

import com.wjy.section7.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticAopTest {
    public static void main(String[] args) {
        //jvm中加入 -javaagent:/Users/young/opt/data/mavenRep/org/springframework/org.springframework.instrument/3.2.0.RELEASE/org.springframework.instrument-3.2.0.RELEASE.jar
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section7/staticProxy/staticAspectTest.xml");
        TestBean bean = context.getBean(TestBean.class);
        bean.test();
    }
}
