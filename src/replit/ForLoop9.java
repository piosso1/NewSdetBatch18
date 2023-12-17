package replit;

import java.util.Scanner;

public class ForLoop9 {
    public static void main(String[] args) {

        // Given the following inputs:
        //int x;
        //Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int x = sc.nextInt();

        System.out.print("Numbers 0 to " + (x-1) + ": ");

        for (int i = x-1; i > 0-1; i--) {
            System.out.print(i +" ");
        }
        }
    }

