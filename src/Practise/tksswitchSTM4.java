package Practise;

import java.util.Scanner;

public class tksswitchSTM4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a number between 1-12
        System.out.println("Input a number between 1-12:");

        // Read the input number from the user
        int monthNumber = scanner.nextInt();

        // Determine the month based on the input number using a switch statement
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
