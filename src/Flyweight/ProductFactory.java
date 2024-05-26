package Flyweight;

import java.util.HashMap;

public class ProductFactory {
    private static final HashMap<String, Product> productMap = new HashMap<>();

    public static Product getProduct(String id, String name) {
        Product product = productMap.get(id);
        if (product == null) {
            product = new ConcreteProduct(id, name);
            productMap.put(id, product);
            System.out.println("Creating new product: " + name);
        } else {
            System.out.println("Reusing existing product: " + name);
        }
        return product;
    }
}
