package Mediator;

//Concrete Colleague
public class Shipping extends OrderComponent {
 public void ship(Order order) {
     // Shipping logic
     System.out.println("Shipping order: " + order.getId());
 }
}
