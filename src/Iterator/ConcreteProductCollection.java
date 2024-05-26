package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteProductCollection implements ProductCollection {
    private List<Product> products;

    public ConcreteProductCollection() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    @Override
    public ProductIterator createIterator() {
        return new ConcreteProductIterator(products);
    }
}
