package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SMSNotification implements NotificationChannel, DisposableBean {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }

    @PostConstruct
    public void connectSMS() {
        System.out.println("Connecting to SMS Gateway...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disconnecting from SMS Gateway...");
    }

}
