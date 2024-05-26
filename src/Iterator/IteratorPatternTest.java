package Iterator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IteratorPatternTest {

    @Test
    public void testProductIterator() {
        ConcreteProductCollection productCollection = new ConcreteProductCollection();
        Product product1 = new Product("1", "Laptop");
        Product product2 = new Product("2", "Table");
        Product product3 = new Product("3", "Chair");

        productCollection.addProduct(product1);
        productCollection.addProduct(product2);
        productCollection.addProduct(product3);

        ProductIterator iterator = productCollection.createIterator();

        assertTrue(iterator.hasNext());
        assertEquals(product1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(product2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(product3, iterator.next());
        assertFalse(iterator.hasNext());
    }
}
