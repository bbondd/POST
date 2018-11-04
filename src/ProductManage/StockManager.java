package ProductManage;

import java.util.Scanner;

public class StockManager {
    private static ProductGroup stock;
    private Scanner scanner = new Scanner(System.in);
    public static ProductGroup getStock() {
        return stock;
    }

    public StockManager(ProductGroup stock) {
        this.stock = stock;
    }

    public Product addNewProduct() {
        System.out.print("Product name : ");
        String name = scanner.nextLine();
        System.out.print("Product Id : ");
        String id = scanner.nextLine();
        System.out.print("Product price : ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Product quantity : ");
        int quantity = Integer.parseInt(scanner.nextLine());

        Product product = new Product(name, id, price, quantity);
        return stock.add(product);
    }
}
