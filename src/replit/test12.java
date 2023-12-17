package replit;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] days = {" ", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] weekdays = new String[7];

        for (int i = 1; i <= 7; i++) {
            System.out.println("Please enter day " + i + " of the week");
            weekdays[i - 1] = sc.nextLine();
        }

        // Print the entered days of the week
        System.out.println("Entered days of the week:");
        for (String day : days) {
            System.out.println(day);
        }
    }
}
