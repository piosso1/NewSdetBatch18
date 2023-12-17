package Practise;

import java.util.Scanner;

public class tksswitchSTM2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the age of the child
        System.out.println("Enter the age of the Child:");

        // Read the age input from the user
        int age = scanner.nextInt();

        // Determine the message based on the age using a switch statement
        switch (age) {
            case 1:
                System.out.println("You can Crawl");
                break;
            case 2:
                System.out.println("You can Talk");
                break;
            case 3:
                System.out.println("You can Dance");
                break;
            case 4:
                System.out.println("You can get Trouble");
                break;
            default:
                System.out.println("I don't know how old you are");
        }
    }
}
