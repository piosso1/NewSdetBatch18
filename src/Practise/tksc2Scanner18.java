package Practise;

import java.util.Scanner;

public class tksc2Scanner18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three distinct numbers
        System.out.println("Please enter 3 distinct numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Check for distinct numbers
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            // Find the largest number using nested if conditions
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("The largest number is " + num1);
                } else {
                    System.out.println("The largest number is " + num3);
                }
            } else {
                if (num2 > num3) {
                    System.out.println("The largest number is " + num2);
                } else {
                    System.out.println("The largest number is " + num3);
                }
            }
        } else {
            System.out.println("Please enter three distinct numbers.");
        }

    }
}
