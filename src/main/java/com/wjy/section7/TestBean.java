package com.wjy.section7;

import com.wjy.section6.MyClassPathXmlApplicationContext;
import lombok.Data;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Data
public class TestBean {
    private String test;

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("section7/AopConfig.xml");
        TestBean bean = classPathXmlApplicationContext.getBean(TestBean.class);
        bean.test();
    }
}
