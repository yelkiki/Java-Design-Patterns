package Mediator;

//Concrete Colleague
public class Payment extends OrderComponent {
 public boolean process(Order order) {
     // Payment processing logic
     System.out.println("Processing payment for order: " + order.getId());
     return true;
 }
}
