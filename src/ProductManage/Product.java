package ProductManage;

public class Product {
    String name, id;
    int price, quantity;

    Product(String name, String id, int price, int quantity) {
        this.name = name; this.id = id; this.price = price; this.quantity = quantity;
    }

    public Product clone() {
        return new Product(name, id, price, quantity);
    }
}
