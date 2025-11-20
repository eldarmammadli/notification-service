package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PushNotification implements NotificationChannel, DisposableBean {

    @Override
    public void send(String message) {System.out.println("Sending Push Notification: " + message);}

    @PostConstruct
    public void connectPush() {
        System.out.println("Connecting to Push Server...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disconnecting from Push Server...");
    }

}
