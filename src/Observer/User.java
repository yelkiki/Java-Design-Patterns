package Observer;

// Concrete Observer
public class User implements OrderObserver {
    public void update(Order order) {
        // Notify user about the order status
        System.out.println("User notified. Order ID: " + order.getId() + ", Status: " + order.getStatus());
    }
}
