package Iterator;

import java.util.List;

public class ConcreteProductIterator implements ProductIterator {
    private List<Product> products;
    private int position;

    public ConcreteProductIterator(List<Product> products) {
        this.products = products;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < products.size();
    }

    @Override
    public Product next() {
        if (this.hasNext()) {
            return products.get(position++);
        }
        return null;
    }
}
