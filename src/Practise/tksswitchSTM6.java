package Practise;

/*
Ask the user to enter any number from 1-7.
Based on the number define the day of the week
**Example Output:**
Input a number between 1-7
Friday
**Example Output:**
Input a number between 1-7
Invalid
 */

import java.util.Scanner;

public class tksswitchSTM6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.println("Input a number between 1-7:");

        // Read the input number from the user
        int dayNumber = scanner.nextInt();

        // Define the day of the week based on the input number
        String dayOfWeek;

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid";
        }

        // Output the result
        System.out.println(dayOfWeek);
    }
}
