package Mediator;

//Demo Class
public class MediatorPatternDemo {
 public static void main(String[] args) {
     Inventory inventory = new Inventory();
     Payment payment = new Payment();
     Shipping shipping = new Shipping();
     OrderMediator mediator = new ConcreteOrderMediator(inventory, payment, shipping);

     inventory.setMediator(mediator);
     payment.setMediator(mediator);
     shipping.setMediator(mediator);

     Order order = new Order("1");
     order.addItem(new Item("1", "Laptop", 1000));

     mediator.processOrder(order);
 }
}
