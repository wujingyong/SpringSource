package com.wjy.section13;

import org.apache.activemq.spring.ActiveMQConnectionFactory;

import javax.jms.*;

public class Sender {
    public static void main(String[] args) throws Exception {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        Connection connection = activeMQConnectionFactory.createConnection();
        Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
//        Destination destination = session.createQueue("my-queue");
        Destination destination = session.createQueue("HelloWorldQueue");
        MessageProducer producer = session.createProducer(destination);
        for (int i = 0; i < 3; i++) {
            TextMessage textMessage = session.createTextMessage("测试消息发送" + i);
            Thread.sleep(1000);
            producer.send(textMessage);
            session.commit();
        }
        session.close();
        connection.close();
    }
}
