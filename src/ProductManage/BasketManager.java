package ProductManage;

public class BasketManager {
    public ProductGroup stock = StockManager.getStock(),
            basket = new ProductGroup();
    ProductRecognizer.ProductIdReader productIdReader =
            new ProductRecognizer.BarcodeReader();

    public Product addProduct() {
        String productId = productIdReader.getProductId();

        Product product = basket.find(productId);
        if(product == null)
            return basket.add(stock.find(productId).clone());

        product.quantity += 1;
        return product;
    }
}
