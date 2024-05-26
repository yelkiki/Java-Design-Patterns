package Mediator;

//Concrete Colleague
public class Inventory extends OrderComponent {
 public boolean checkStock(Order order) {
     // Check stock logic
     System.out.println("Checking stock for order: " + order.getId());
     return true;
 }
}
