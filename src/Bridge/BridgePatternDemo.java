package Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SMSSender();
        NotificationSender pushSender = new PushSender();

        Notification accountNotification = new AccountNotification(emailSender);
        Notification orderNotification = new OrderNotification(smsSender);
        Notification pushNotification = new OrderNotification(pushSender);

        accountNotification.send("Your account has been created.");
        orderNotification.send("Your order has been shipped.");
        pushNotification.send("You have a new order notification.");
    }
}
