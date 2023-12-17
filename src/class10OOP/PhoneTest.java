package class10OOP;

public class PhoneTest {
    public static void main(String[] args) {

        Phone iphone=new Phone();
        iphone.make="Apple";
        iphone.color="White";
        iphone.price=1200;
        System.out.println(iphone.make);
        System.out.println(iphone.model);
        System.out.println(iphone.price);
        System.out.println(iphone.color);
        iphone.takepics();
        iphone.call();
        iphone.playvideos();

        System.out.println("******************");

        Phone samsung=new Phone();
        samsung.make="Samsung";
        samsung.model="S23 Ultra";
        samsung.color="Black";
        samsung.price=1000;
        System.out.println(samsung.make);
        System.out.println(samsung.model);
        System.out.println(samsung.price);
        System.out.println(samsung.color);

    }
}
