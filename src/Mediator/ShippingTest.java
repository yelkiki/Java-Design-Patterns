package Mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShippingTest {

    private Shipping shipping;
    private OrderMediator mediator;

    @BeforeEach
    public void setUp() {
        shipping = new Shipping();
        mediator = new ConcreteOrderMediator(new Inventory(), new Payment(), shipping);
        shipping.setMediator(mediator);
    }

    @Test
    public void testShip() {
        Order order = new Order("1");
        order.addItem(new Item("1", "Laptop", 1000));
        shipping.ship(order);

        // No exception should be thrown
        assertTrue(true);
    }
}