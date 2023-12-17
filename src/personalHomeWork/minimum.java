package personalHomeWork;

/*
Create a method to find the minimum of two numbers.
Method will be passed two parameters and will return the minimum number.
Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5
 */

public class minimum {

    public static int minnum(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static double minnum(double num1, double num2) {
        return Math.min(num1, num2);
    }

    public static void main(String[] args) {
        int minResult = minnum(10,5);
        System.out.println("minimum number(int): "+minResult);

        double minDouble = minnum(2.5,3.5);
        System.out.println("minimum number(double): "+minDouble);
    }
}