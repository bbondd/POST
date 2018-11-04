package TransactionManage;

import ProductManage.ProductGroup;

import java.util.Scanner;

public class TransactionManager {
    Scanner scanner = new Scanner(System.in);
    public boolean transaction(ProductGroup basket) {
        basket.printProducts();

        System.out.println("1. card payment");
        System.out.println("2. cash payment");

        PaymentManager.PaymentAuthorizer paymentAuthorizer;
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                paymentAuthorizer = new PaymentManager.CardPaymentAuthorizer();
                break;
            case 2:
                paymentAuthorizer = new PaymentManager.CashPaymentAuthorizer();
                break;
            default:
                paymentAuthorizer = null;
                break;
        }

        if(paymentAuthorizer.pay(basket.getPriceSum())) {
            System.out.println("Payment complete");
            return true;
        }
        else {
            System.out.println("Payment fail");
            return false;
        }
    }
}
