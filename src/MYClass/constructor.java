package MYClass;

public class constructor {

    // Instance variables
    private String name;
    private int age;

    // Constructor with parameters
    public constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Another constructor with different parameters
    public constructor(String name) {
        this.name = name;
        // Age is not initialized in this constructor
        // You can provide default values or leave it uninitialized
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using constructors
        constructor obj1 = new constructor("John", 25);
        constructor obj2 = new constructor("Alice");

        // Calling methods to display information
        obj1.displayInfo();
        obj2.displayInfo();
    }
}
