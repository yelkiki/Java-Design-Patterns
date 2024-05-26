package Bridge;

public class OrderNotification extends Notification {
    public OrderNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        sender.sendNotification("Order Notification: " + message);
    }
}
