package class22.HMWK;

public class Product {

    private String productID;
    private String productName;
    private double price;
    private int stockQuantity;

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Product(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void restock(int restockAmount){
        if (restockAmount > 0){
            stockQuantity += restockAmount;
            System.out.println("unit added to stock "+productName);
        }else {
            System.out.println("Invalid restock amount");
        }
    }

    public double sell(int SellAmount){
        if (SellAmount > 0 && SellAmount <= stockQuantity){
            stockQuantity -= SellAmount;
            double totalSalePrice = SellAmount * price;
            System.out.println("unit: "+productName+" sold: "+totalSalePrice);
            return totalSalePrice;
        } else if (SellAmount > stockQuantity) {
            System.out.println("We don't have enough stock available for "+productName);
        }else {
            System.out.println("Invalid sell amount");
        }
        return 0.0;
    }
    public void printProductDetails(){
        System.out.println("Product Details:");
        System.out.println("Name: "+productName);
        System.out.println("Price: "+price);
        System.out.println("Stock Quantity: "+stockQuantity);
    }

}


