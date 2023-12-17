package replit;

import java.util.Scanner;

public class Arrays8Scanner {
    public static void main(String[] args) {

        //Create an array of integers that will store 5 elements taken from a user
        //Don't print any prompt message for the user
        //Then print out all the elements you have created in the first loop in reverse order.

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input:");
            numbers[i] = sc.nextInt();
        }

        // Output in reverse order
        System.out.println("Output:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
