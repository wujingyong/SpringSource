package com.wjy.section13.springJms;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.Destination;

public class HelloWorldSender {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section13/spring-activemq.xml");
        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
        Destination des = (Destination) context.getBean("activeMQQueue");
        jmsTemplate.send(des, session -> session.createTextMessage("helloWorld"));
    }
}
