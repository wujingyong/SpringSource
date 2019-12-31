package com.wjy.section6;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
    public MyClassPathXmlApplicationContext(String configLocation) throws BeansException {
        super(configLocation);
    }

    @Override
    protected void initPropertySources() {
        ConfigurableEnvironment environment = getEnvironment();
        environment.setRequiredProperties("VAR");
    }
}
