package Flyweight;

public class ConcreteProduct implements Product {
    private String id;
    private String name;
    private ProductCategory category;

    public ConcreteProduct(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public ProductCategory getCategory() {
        return this.category;
    }
}
