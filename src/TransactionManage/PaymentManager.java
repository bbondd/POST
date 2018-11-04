package TransactionManage;

import java.util.Scanner;

public class PaymentManager {
    static Scanner scanner = new Scanner(System.in);

    public interface PaymentAuthorizer {
        boolean pay(int priceSum);
        String paymentName();
    }

    public static class CardPaymentAuthorizer implements PaymentAuthorizer {
        @Override
        public boolean pay(int priceSum) {
            System.out.print("price sum : " + priceSum);
            System.out.print("card number : ");
            String cardNumber = scanner.nextLine();

            return true;
        }

        @Override
        public String paymentName() {
            return "card";
        }
    }

    public static class CashPaymentAuthorizer implements PaymentAuthorizer {
        @Override
        public boolean pay(int priceSum) {
            System.out.print("price sum : " + priceSum);
            System.out.print("paid money : ");
            int paidMoney = Integer.parseInt(scanner.nextLine());

            if(paidMoney < priceSum) {
                System.out.print("not enough money");
                return false;
            }
            else {
                int change = paidMoney - priceSum;
                System.out.print("change : " + change);
                return true;
            }
        }

        @Override
        public String paymentName() {
            return "cash";
        }
    }

}
