package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EmailNotification implements NotificationChannel, DisposableBean {

    @Override
    public void send(String message) {System.out.println("Sending Email: " + message);}

    @PostConstruct
    public void connectEmail() {
        System.out.println("Connecting to Email Server...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disconnecting from Email Server...");
    }

}
