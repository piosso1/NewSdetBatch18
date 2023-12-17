package MYClass;

public class MyClass {

    // Method without parameters and without a return value
    public void simpleMethod() {
        // Method body
        System.out.println("This is a simple method.");
    }

    // Method with parameters and without a return value
    public void methodWithParameters(int number, String text) {
        // Method body with parameters
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    // Method with parameters and with a return value
    public int add(int a, int b) {
        // Method body with return statement
        return a + b;
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Calling methods
        myObject.simpleMethod();

        myObject.methodWithParameters(42, "Hello!");

        int result = myObject.add(5, 7);
        System.out.println("Result of addition: " + result);
    }
}