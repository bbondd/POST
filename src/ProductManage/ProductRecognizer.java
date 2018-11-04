package ProductManage;

import java.util.Scanner;

public class ProductRecognizer {
    public interface ProductIdReader {
        String getProductId();
    }

    public static class BarcodeReader implements ProductIdReader {
        Scanner scanner = new Scanner(System.in);

        @Override
        public String getProductId() {
            return barcodeToProductID();
        }

        private String getBarcode() {
            System.out.print("Product barcode number : ");
            return scanner.nextLine();
        }

        private String barcodeToProductID() {
            return getBarcode();
        }

    }
}
