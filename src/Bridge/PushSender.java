package Bridge;

public class PushSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
