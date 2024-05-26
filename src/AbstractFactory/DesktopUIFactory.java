package AbstractFactory;

//Concrete Factory for Desktop
public class DesktopUIFactory extends AbstractFactory {
 public Button createButton() {
     return new DesktopButton();
 }
 
 public TextField createTextField() {
     return new DesktopTextField();
 }
}
