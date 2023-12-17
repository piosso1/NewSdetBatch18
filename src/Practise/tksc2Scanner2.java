package Practise;

/*
Ask user to enter a number and then categorize if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000
 */

import java.util.Scanner;

public class tksc2Scanner2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 10) {
            System.out.println("The number is categorized as small.");
        } else if (number >= 11 && number <= 100) {
            System.out.println("The number is categorized as medium.");
        } else if (number >= 101 && number <= 1000) {
            System.out.println("The number is categorized as large.");
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
