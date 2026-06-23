import java.util.*;
class Product1 {
    private int productId;
    private String productName;
    private int quantity;
    private int price;
    public Product(int productId, String productName, int quantity, int price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString() {
        return "ID: " + productId +
               ", Name: " + productName +
               ", Quantity: " + quantity +
               ", Price: " + price;
    }
}

class InventoryManagementSystem {

    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void add(int id, String name, int quantity, int price) {
        Product p1 = new Product(id, name, quantity, price);
        inventory.put(id, p1);
    }

    public static void show() {
       inventory.values().forEach(p -> System.out.println(p));
    }

    public static void updatePrice(int id, int price) {
        Product p = inventory.get(id);

        if (p != null) {
            p.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    public static void updateQuantity(int id, int quantity) {
        Product p = inventory.get(id);

        if (p != null) {
            p.setQuantity(quantity);
        } else {
            System.out.println("Product not found!");
        }
    }

    public static void main(String args[]) {

        add(100, "Soap", 6, 5);
        add(101, "Biscuit", 16, 50);
        System.out.println("Before Update:");
        show();
        updatePrice(100, 7);
        updateQuantity(101, 15);
        System.out.println("\nAfter Update:");
        show();
    }
}