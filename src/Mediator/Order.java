package Mediator;

import java.util.ArrayList;
import java.util.List;

// Order Class
public class Order {
    private String id;
    private List<Item> items = new ArrayList<>();
    private float totalPrice;

    public Order(String id) {
        this.id = id;
    }

    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
