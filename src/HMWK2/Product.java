package HMWK2;

/*
Construct a class Product with attributes like product_name, price, and quantity.
Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated
 */

public class Product {

    private String productName;
    private int price;
    private int quantity;

  public Product(String productName, int price, int quantity){
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
}

public int getQuantity(){
      return quantity;
}

public int totalCost(){
    if (quantity <= 0){
        System.out.println("Invalid number of product quantity ");
        return 0;
    }
    return quantity * price;
  }
}

class DiscountedProduct extends Product{

    private double discountRate;

    public DiscountedProduct(String productName, int price, int quantity, double discountRate){
        super(productName, price, quantity);
        this.discountRate = discountRate;
    }

    public int totalCost() {
        if (getQuantity() <= 0){
            System.out.println("Invalid number of product quantity ");
            return 0;
        }
        int discountCost = (int) (super.totalCost()-discountRate);


        return discountCost;
    }
}
class ProductTester {
    public static void main(String[] args) {

        Product p = new Product("Bread", 100, 3);
        int price = p.totalCost();
        System.out.println("Bread price is "+price);
        DiscountedProduct d = new DiscountedProduct("Bread", 100, 3, 30);
        int discountPrice = d.totalCost();
        System.out.println("Bread price with discount is "+discountPrice);

    }
}