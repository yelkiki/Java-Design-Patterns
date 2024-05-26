package Flyweight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductManagementTest {

    @Test
    public void testProductCreationAndReuse() {
        ProductCategory electronics = new ProductCategory("Electronics", "Electronic items");
        ProductCategory furniture = new ProductCategory("Furniture", "Furniture items");

        Product product1 = ProductFactory.getProduct("1", "Laptop");
        product1.setCategory(electronics);

        Product product2 = ProductFactory.getProduct("2", "Table");
        product2.setCategory(furniture);

        Product product3 = ProductFactory.getProduct("1", "Laptop");

        assertNotNull(product1);
        assertNotNull(product2);
        assertNotNull(product3);

        assertSame(product1, product3);
        assertEquals("Electronics", product1.getCategory().getName());
        assertEquals("Furniture", product2.getCategory().getName());
        assertNotSame(product1, product2);
    }

    @Test
    public void testProductFactoryCaching() {
        Product product1 = ProductFactory.getProduct("3", "Chair");
        Product product2 = ProductFactory.getProduct("4", "Desk");

        Product product3 = ProductFactory.getProduct("3", "Chair");

        assertNotNull(product1);
        assertNotNull(product2);
        assertNotNull(product3);

        assertSame(product1, product3);
        assertNotSame(product1, product2);
    }
}
