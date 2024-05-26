package Strategy;

// Concrete Strategy
public class CreditCardPayment implements PaymentProcessor {
    public boolean processPayment(float amount) {
        // Credit card payment processing logic
        System.out.println("Processing credit card payment of " + amount);
        return true; // Simulate successful payment
    }
}
