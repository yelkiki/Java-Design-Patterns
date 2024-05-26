package Strategy;

// Concrete Strategy
public class CashOnDeliveryPayment implements PaymentProcessor {
    public boolean processPayment(float amount) {
        // Cash on delivery payment processing logic
        System.out.println("Processing cash on delivery payment of " + amount);
        return true; // Simulate successful payment
    }
}
