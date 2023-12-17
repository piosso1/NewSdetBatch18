package Practise;

import java.util.Scanner;

public class tksc2Scanner17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user to enter any number
        System.out.println("Please enter any number:");
        int number = sc.nextInt();

        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println("Value is even.");

            // Check if the even number is greater than 1000
            if (number > 1000) {
                System.out.println("Even number is large.");
            } else {
                System.out.println("Even value is just right.");
            }
        } else {
            System.out.println("Value is odd.");

            // Check if the odd number is greater than 1000
            if (number > 1000) {
                System.out.println("Odd number is large.");
            } else {
                System.out.println("Odd value is just right.");
            }
        }

    }
}
