package class3;

public class E2TypeCasting {
    public static void main(String[] args) {

        double price=12.3;
        double quantity=3;
        double totalPrice=price*quantity;
        int ftotal = (int)totalPrice;
        // we can get rid of decimal part by
        // type casting
        System.out.println(ftotal);
        System.out.println((int)totalPrice);
    }
}
