package Bridge;

public class SMSSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
