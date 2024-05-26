package Bridge;

public class AccountNotification extends Notification {
    public AccountNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        sender.sendNotification("Account Notification: " + message);
    }
}
