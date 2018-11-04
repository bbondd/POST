package TransactionManage;

import ProductManage.ProductGroup;

import java.util.Random;

public class Receipt {
    ProductGroup basket;
    PaymentManager.PaymentAuthorizer paymentAuthorizer;
    String id;
    Random random = new Random();

    Receipt(ProductGroup basket, PaymentManager.PaymentAuthorizer paymentAuthorizer) {
        this.basket = basket;
        this.paymentAuthorizer = paymentAuthorizer;
        id = Integer.toString(random.nextInt());
    }
}
