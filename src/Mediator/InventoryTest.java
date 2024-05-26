package Mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    private Inventory inventory;
    private OrderMediator mediator;

    @BeforeEach
    public void setUp() {
        inventory = new Inventory();
        mediator = new ConcreteOrderMediator(inventory, new Payment(), new Shipping());
        inventory.setMediator(mediator);
    }

    @Test
    public void testCheckStock() {
        Order order = new Order("1");
        order.addItem(new Item("1", "Laptop", 1000));
        assertTrue(inventory.checkStock(order));
    }
}
