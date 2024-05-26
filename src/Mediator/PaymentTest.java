package Mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    private Payment payment;
    private OrderMediator mediator;

    @BeforeEach
    public void setUp() {
        payment = new Payment();
        mediator = new ConcreteOrderMediator(new Inventory(), payment, new Shipping());
        payment.setMediator(mediator);
    }

    @Test
    public void testProcess() {
        Order order = new Order("1");
        order.addItem(new Item("1", "Laptop", 1000));
        assertTrue(payment.process(order));
    }
}