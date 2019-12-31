package com.wjy.section2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllTest {
    @Test
    public void testLoad() {
        BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("section2/bean.xml"));
        MyTestBean myTestBean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
        assertEquals ("testStr", myTestBean.getTestStr());
    }

    @Test
    public void test() {
        String a = "abcde.aa";
        int de = a.indexOf("de", 7);
        System.out.println(de);
    }
}
