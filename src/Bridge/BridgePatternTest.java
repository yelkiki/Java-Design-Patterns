package Bridge;

import org.junit.jupiter.api.Test;


public class BridgePatternTest {

    @Test
    public void testEmailNotification() {
        NotificationSender emailSender = new EmailSender();
        Notification notification = new AccountNotification(emailSender);
        notification.send("Test email notification");
        // Assuming you have a way to verify email sending, you would assert here
    }

    @Test
    public void testSMSNotification() {
        NotificationSender smsSender = new SMSSender();
        Notification notification = new OrderNotification(smsSender);
        notification.send("Test SMS notification");
        // Assuming you have a way to verify SMS sending, you would assert here
    }

    @Test
    public void testPushNotification() {
        NotificationSender pushSender = new PushSender();
        Notification notification = new OrderNotification(pushSender);
        notification.send("Test push notification");
        // Assuming you have a way to verify push notification sending, you would assert here
    }
}
