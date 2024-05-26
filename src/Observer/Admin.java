package Observer;

// Concrete Observer
public class Admin implements OrderObserver {
    public void update(Order order) {
        // Notify admin about the order status
        System.out.println("Admin notified. Order ID: " + order.getId() + ", Status: " + order.getStatus());
    }
}
