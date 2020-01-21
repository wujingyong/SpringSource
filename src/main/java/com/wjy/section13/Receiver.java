package com.wjy.section13;

import org.apache.activemq.spring.ActiveMQConnectionFactory;

import javax.jms.*;

public class Receiver {
    public static void main(String[] args) throws Exception {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        Connection connection = activeMQConnectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue("my-queue");
        MessageConsumer consumer = session.createConsumer(destination);
        while (true) {
            TextMessage receive = (TextMessage) consumer.receive();
            session.commit();
            System.out.println("收到的消息：" + receive.getText());
        }
//        session.close();
//        connection.close();
    }
}
