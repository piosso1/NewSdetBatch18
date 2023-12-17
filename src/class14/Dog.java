package class14;

public class Dog {

    String name;

    void printInfo(){
        System.out.println(name);
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "jacki";
        d1.printInfo();
    }
}
