package AbstractFactory;

//Factory Creator
public class FactoryCreator {
 public static AbstractFactory getFactory(String choice) {
     if (choice.equalsIgnoreCase("Desktop")) {
         return new DesktopUIFactory();
     } else if (choice.equalsIgnoreCase("Mobile")) {
         return new MobileUIFactory();
     }
     return null;
 }
}
