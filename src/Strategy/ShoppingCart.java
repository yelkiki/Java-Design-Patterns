package Strategy;

// Context
public class ShoppingCart {
    private PaymentProcessor paymentMethod;

    public void setPaymentMethod(PaymentProcessor method) {
        this.paymentMethod = method;
    }

    public boolean checkout(float amount) {
        if (paymentMethod == null) {
            System.out.println("Payment method is not set!");
            return false;
        }
        return paymentMethod.processPayment(amount);
    }
}
