package Mediator;

//Item Class
public class Item {
 private String id;
 private String name;
 private float price;

 public Item(String id, String name, float price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 // getters and setters
 public String getId() {
     return id;
 }

 public void setId(String id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public float getPrice() {
     return price;
 }

 public void setPrice(float price) {
     this.price = price;
 }
}
