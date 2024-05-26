package Mediator;

//Colleague Interface
public abstract class OrderComponent {
 protected OrderMediator mediator;

 public void setMediator(OrderMediator mediator) {
     this.mediator = mediator;
 }
}
