package replit;

//Write a program that creates a String array with size 7.
//Ask the user to input Days of a week beginning with Sunday using Scanner class.
//Add these inputs to your array and then print all values from that array
//Example:
//Please enter day 1 of the week
//Sunday
//Please enter day 2 of the week
//Monday
//Please enter day 3 of the week
//Tuesday etc

import java.util.Scanner;

public class Arrays7Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] days = {" ", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] weekdays = new String[7]; // Create an array to store the weekdays.

        // Prompt the user to enter days of the week
        for (int i = 1; i <= 7; i++) {
            System.out.println("Please enter day " + i + " of the week");
            weekdays[i - 1] = sc.nextLine(); // Store user input in the array
        }

        // Print the entered days of the week
        System.out.println("Entered days of the week:");
        for (String day : days) {
            System.out.println(day);
        }
        }
    }

