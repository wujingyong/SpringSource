package com.wjy.section13.springJms;

import lombok.SneakyThrows;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMessageListener implements MessageListener {
    @SneakyThrows
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        System.out.println(textMessage.getText());
    }
}
