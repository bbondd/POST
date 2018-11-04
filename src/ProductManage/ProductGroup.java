package ProductManage;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductGroup {
    private Scanner scanner = new Scanner(System.in);
    private LinkedList<Product> products = new LinkedList<>();

    public Product add(Product product) {
        products.add(product);
        return product;
    }

    public Product find(String productId) {
        for(Product product : products)
            if(product.id.equals(productId)) return product;
        return null;
    }

    public Product changeProductQuantity() {
        printProducts();
        System.out.print("Product number to change : ");
        Product product = products.get(Integer.parseInt(scanner.nextLine()));

        System.out.print("Change quantity by : ");
        int quantity = Integer.parseInt(scanner.nextLine());

        if(product != null && product.quantity + quantity >= 0) {
            product.quantity += quantity;
            System.out.println("Quantity change success");
            return product;
        }
        else {
            System.out.println("Quantity change fail");
            return null;
        }
    }

    public int getPriceSum() {
        int priceSum = 0;
        for(Product product : products)
            priceSum += product.price * product.quantity;

        return priceSum;
    }

    public void printProducts() {
        String stringBlock = "%15s";

        System.out.printf(stringBlock + stringBlock + stringBlock + stringBlock + stringBlock + '\n',
                "number", "name", "price", "quantity", "product id");

        for(int i = 0; i < products.size(); i++) {
            Product product = products.get(i);

            System.out.printf(stringBlock + stringBlock + stringBlock + stringBlock + stringBlock + '\n',
                    i, product.name, product.price, product.quantity, product.id);
        }


        System.out.println("price sum : " + getPriceSum());
    }

}
