package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class NotificationServiceTest {

    @Test
    void testSendAll() {
        List<NotificationChannel> channels = new ArrayList<>();
        channels.add(new EmailNotification());
        channels.add(new SMSNotification());
        channels.add(new PushNotification());

        NotificationService service = new NotificationService(channels);
        service.sendAll("Welcome to Notification Service! You have 3 new messages.");

        assert true;
    }
}
