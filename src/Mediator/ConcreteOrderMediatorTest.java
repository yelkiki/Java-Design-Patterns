package Mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcreteOrderMediatorTest {

    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;
    private OrderMediator mediator;

    @BeforeEach
    public void setUp() {
        inventory = new Inventory();
        payment = new Payment();
        shipping = new Shipping();
        mediator = new ConcreteOrderMediator(inventory, payment, shipping);

        inventory.setMediator(mediator);
        payment.setMediator(mediator);
        shipping.setMediator(mediator);
    }

    @Test
    public void testProcessOrder() {
        Order order = new Order("1");
        order.addItem(new Item("1", "Laptop", 1000));

        mediator.processOrder(order);

        // You can add more assertions here to verify the process
        // For now, we are just checking if no exception is thrown
        assertTrue(true);
    }
}