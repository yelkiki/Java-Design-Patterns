package Observer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {

    private Order order;
    private TestObserver userObserver;
    private TestObserver adminObserver;

    @BeforeEach
    public void setUp() {
        order = new Order("1");
        userObserver = new TestObserver();
        adminObserver = new TestObserver();

        order.addObserver(userObserver);
        order.addObserver(adminObserver);
    }

    @Test
    public void testNotifyObservers() {
        order.setStatus("Shipped");

        assertEquals("Shipped", userObserver.receivedStatus);
        assertEquals("Shipped", adminObserver.receivedStatus);
    }

    private class TestObserver implements OrderObserver {
        String receivedStatus;

        @Override
        public void update(Order order) {
            this.receivedStatus = order.getStatus();
        }
    }
}
