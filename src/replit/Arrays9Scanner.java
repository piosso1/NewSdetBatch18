package replit;

import java.util.Scanner;

public class Arrays9Scanner {
    public static void main(String[] args) {

        //Create an int array of integers with a size of 5 and input values with Scanner.
        //Don't print prompt questions for a user.
        //Using loop print out each element of the array that should look like the output below

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input:");
            numbers[i] = sc.nextInt();
        }

        // Output in reverse order
        System.out.println("Output:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * 10);
        }
    }
}
