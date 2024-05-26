package Mediator;

//Concrete Mediator
public class ConcreteOrderMediator implements OrderMediator {
 private Inventory inventory;
 private Payment payment;
 private Shipping shipping;

 public ConcreteOrderMediator(Inventory inventory, Payment payment, Shipping shipping) {
     this.inventory = inventory;
     this.payment = payment;
     this.shipping = shipping;
 }

 public void processOrder(Order order) {
     System.out.println("Processing order: " + order.getId());
     if (inventory.checkStock(order)) {
         if (payment.process(order)) {
             shipping.ship(order);
         }
     }
 }
}

