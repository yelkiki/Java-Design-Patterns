package Flyweight;

public class ProductManagementDemo {
    public static void main(String[] args) {
        ProductCategory electronics = new ProductCategory("Electronics", "Electronic items");
        ProductCategory furniture = new ProductCategory("Furniture", "Furniture items");

        Product product1 = ProductFactory.getProduct("1", "Laptop");
        product1.setCategory(electronics);

        Product product2 = ProductFactory.getProduct("2", "Table");
        product2.setCategory(furniture);

        Product product3 = ProductFactory.getProduct("1", "Laptop");

        System.out.println("Product 1 category: " + product1.getCategory().getName());
        System.out.println("Product 2 category: " + product2.getCategory().getName());
        System.out.println("Product 3 category: " + product3.getCategory().getName());
    }
}
