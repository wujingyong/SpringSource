package com.wjy.section13.springJms;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

public class HelloWorldReciver {
    public static void main(String[] args) throws JMSException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section13/spring-activemq.xml");
        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
        Destination activeMQQueue = (Destination) context.getBean("activeMQQueue");
        TextMessage receive = (TextMessage) jmsTemplate.receive(activeMQQueue);
        String text = receive.getText();
        System.out.println(text);

    }
}
