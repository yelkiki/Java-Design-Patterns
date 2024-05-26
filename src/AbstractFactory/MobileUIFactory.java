package AbstractFactory;

//Concrete Factory for Mobile
public class MobileUIFactory extends AbstractFactory {
 public Button createButton() {
     return new MobileButton();
 }
 
 public TextField createTextField() {
     return new MobileTextField();
 }
}
