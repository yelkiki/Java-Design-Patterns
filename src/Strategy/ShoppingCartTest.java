package Strategy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void testCreditCardPayment() {
        System.out.println("Running testCreditCardPayment...");
        cart.setPaymentMethod(new CreditCardPayment());
        boolean result = cart.checkout(100);
        assertTrue(result, "Credit card payment should be successful");
    }

    @Test
    public void testCashOnDeliveryPayment() {
        System.out.println("Running testCashOnDeliveryPayment...");
        cart.setPaymentMethod(new CashOnDeliveryPayment());
        boolean result = cart.checkout(200);
        assertTrue(result, "Cash on delivery payment should be successful");
    }
}
