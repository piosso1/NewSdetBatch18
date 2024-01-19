package HMWK2;

/*
E-Commerce System Task: Build a Product class with subclasses like Electronics, Clothing, Furniture, and Books.
Define attributes like price, name, and SKU in the Product class.
Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop through to display or calculate prices and taxes

 */


public class Product2 {

    private String name;
    private double price;
    private String SKU;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  Product2 (String name, double price, String SKU){
        this.name = name;
        this.price = price;
        this.SKU = SKU;
    }

    public void displayProducttInfo(){
        System.out.println("Product: "+name+", "+"Price: "+price+", "+"SKU: "+SKU);
    }

}
class Electronics extends Product2{
    private String applyWarranty;
    private double taxRate;
    private boolean calculateTax = true;

        public  Electronics (String name, double price, String SKU, String applyWarranty, double taxRate){
        super(name, price, SKU);
        this.applyWarranty = applyWarranty;
        this.taxRate = taxRate;
    }
    public double getTaxRate() {
        return taxRate;
    }

    @Override
    public void displayProducttInfo() {
        super.displayProducttInfo();
        System.out.println("tax: "+taxRate+", "+"warranty: "+applyWarranty);
    }
    public void calculateTax (){
        if (calculateTax){
            setPrice(getPrice() + getPrice() * taxRate);
            calculateTax = true;
        }
    }

}
class Clothing extends  Product2{

    private String type;

    public  Clothing (String name, double price, String SKU, String type){
        super(name, price, SKU);
        this.type = type;
    }

    @Override
    public void displayProducttInfo() {
        super.displayProducttInfo();
        System.out.println("Type: "+type);
    }
}
class Furniture extends Product2{

    private String funitureType;
    private double taxRate;
    private String applyWarranty;
    private boolean calculateTax = true;

    public  Furniture (String name, double price, String SKU, String applyWarranty, String funitureType, double taxRate){
        super(name, price, SKU);
        this.funitureType = funitureType;
        this.taxRate = taxRate;
        this.applyWarranty = applyWarranty;
    }

    @Override
    public void displayProducttInfo() {
        super.displayProducttInfo();
        System.out.println("Tax: "+taxRate+" "+"Funiture Type : "+funitureType);
    }
    public void calculateTax (){
        if (calculateTax){
            setPrice(getPrice() + getPrice() * taxRate);
            calculateTax = true;
        }
    }
}
class Books extends Product2 {
    private String Author;

    public Books(String name, double price, String SKU, String Author) {
        super(name, price, SKU);
        this.Author = Author;
    }

    @Override
    public void displayProducttInfo() {
        super.displayProducttInfo();
        System.out.println("Book Author : "+Author);
    }
}

class Product2Tester{
    public static void main(String[] args) {

        Electronics el = new Electronics("laptop",20000,"lap1122","2 years",0.2);
        Clothing cl = new Clothing("jeans",5000, "men2200", "mensjeans");
        Furniture fu = new Furniture("chair", 25000, "ch88900", "1 year","Dinning chairs",0.3);
        Books bo = new Books("learn java", 2500, "bo0099", "Patrick Udo");

        Product2[] arr = {el, cl, fu, bo};



        for (Product2 pdt : arr ){
            pdt.displayProducttInfo();

            if (pdt instanceof  Electronics){
                ((Electronics) pdt).calculateTax();
            } else if (pdt instanceof Furniture) {
                ((Furniture)pdt).calculateTax();
            }
            pdt.displayProducttInfo();
            System.out.println("------------------------------");
        }

    }
}