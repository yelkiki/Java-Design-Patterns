package Iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        ConcreteProductCollection productCollection = new ConcreteProductCollection();
        productCollection.addProduct(new Product("1", "Laptop"));
        productCollection.addProduct(new Product("2", "Table"));
        productCollection.addProduct(new Product("3", "Chair"));

        ProductIterator iterator = productCollection.createIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("Product ID: " + product.getId() + ", Product Name: " + product.getName());
        }
    }
}
