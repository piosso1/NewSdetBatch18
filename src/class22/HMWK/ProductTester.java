package class22.HMWK;

public class ProductTester {
    public static void main(String[] args) {

        Product Iphone = new Product("ip0012", "iphone", 2000, 5);

        Iphone.setPrice(2500);
        Iphone.setStockQuantity(3);
        Iphone.setProductName("iphone ProMax");
        Iphone.restock(26);
        Iphone.sell(25);

        Iphone.printProductDetails();
    }
}
