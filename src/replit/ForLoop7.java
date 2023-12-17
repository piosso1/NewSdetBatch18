package replit;

import java.util.Scanner;

public class ForLoop7 {
    public static void main(String[] args) {

        //Given the following inputs:
        //int x;
        //Write a for loop that will print out a series of numbers starting
        // at 0 and ending at the x(value must be taken from a user), exclusive


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        System.out.print("Numbers 0 to " + (x - 1) + ": ");

        for (int i = 0; i < x; i++) {
            System.out.print(i + " ");
        }
    }
}
