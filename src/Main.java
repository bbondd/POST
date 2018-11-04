import ProductManage.BasketManager;
import ProductManage.ProductGroup;
import ProductManage.StockManager;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static Scanner getScanner() {
        return scanner;
    }

    public static void main(String[] args) {

        ProductGroup stock = new ProductGroup();
        StockManager stockManager = new StockManager(stock);
        BasketManager basketManager = new BasketManager();

        stockManager.addNewProduct();
        StockManager.getStock().printProducts();
        basketManager.stock.printProducts();

        basketManager.addProduct();
        basketManager.basket.printProducts();


    }
}
