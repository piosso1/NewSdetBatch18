package Practise;
/*
A school has following rules for grading system:
        a. 1 to 25 - F
        b. 25 to 45 - E
        c. 45 to 50 - D
        d. 50 to 60 - C
        e. 60 to 80 - B
        f. Above 80 - A
        Ask the user to enter marks and print the corresponding grade

 */
import java.util.Scanner;

public class tksLOPTS2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks
        System.out.println("Please enter your mark:");
        int marks = scanner.nextInt();

        // Determine the grade based on the provided rules
        char grade;
        if (marks >= 1 && marks <= 25) {
            grade = 'F';
        } else if (marks > 25 && marks <= 45) {
            grade = 'E';
        } else if (marks > 45 && marks <= 50) {
            grade = 'D';
        } else if (marks > 50 && marks <= 60) {
            grade = 'C';
        } else if (marks > 60 && marks <= 80) {
            grade = 'B';
        } else if (marks > 80) {
            grade = 'A';
        } else {
            System.out.println("Please enter valid mark");
            scanner.close();
            return;
        }

        // Output the result
        System.out.println("Your grade is " + grade);
    }
}
