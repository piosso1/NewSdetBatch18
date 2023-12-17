package Practise;

/* Write a java program that prints out true if ( x * y ) returns a positive value. Else prints out false if  (x * y) returns a negative value.
Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number" - for the 2nd number.
Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
If the result of a multiplication is positive print true, otherwise print false

 */

import java.util.Scanner;

public class tksc2Scanner14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the first number");
        double x = scanner.nextDouble();


        System.out.println("Please enter the second number");
        double y = scanner.nextDouble();


        boolean isPositive = (x * y) > 0;


        System.out.println(isPositive);
    }
}
