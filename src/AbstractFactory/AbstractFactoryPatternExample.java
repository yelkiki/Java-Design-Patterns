package AbstractFactory;

//Demo Class
public class AbstractFactoryPatternExample {
 public static void main(String[] args) {
     AbstractFactory desktopFactory = FactoryCreator.getFactory("Desktop");
     Button desktopButton = desktopFactory.createButton();
     desktopButton.render();

     AbstractFactory mobileFactory = FactoryCreator.getFactory("Mobile");
     Button mobileButton = mobileFactory.createButton();
     mobileButton.render();
 }
}
