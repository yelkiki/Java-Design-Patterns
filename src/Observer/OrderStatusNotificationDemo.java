package Observer;

// Demo Class
public class OrderStatusNotificationDemo {
    public static void main(String[] args) {
        Order order = new Order("1");
        User user = new User();
        Admin admin = new Admin();
        
        order.addObserver(user);
        order.addObserver(admin);
        
        order.setStatus("Shipped");
    }
}
