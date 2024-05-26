package Bridge;

public abstract class Notification {
    protected NotificationSender sender;

    protected Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void send(String message);
}
