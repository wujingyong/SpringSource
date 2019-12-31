package com.wjy.section6;

import com.wjy.section2.MyTestBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

class AllTest {
    @Test
    void section6_3() {
        ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("section6/bean.xml");
        MyTestBean myTestBean = (MyTestBean) applicationContext.getBean("myTestBean");
    }
}
