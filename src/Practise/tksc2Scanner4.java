package Practise;

/*Allow user to enter grade (A, B, or C etc...) and then provide
explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
At the end your program should print which grade was entered by a user with explanation
 */

import java.util.Scanner;

public class tksc2Scanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your grade:");
        String entergrade = sc.next().toUpperCase();

        String grade;

        if (entergrade.equals("A")) {
            grade = "Excellent";
        } else if (entergrade.equals("B")) {
            grade = "Good";
        } else if (entergrade.equals("C")) {
            grade = "Average";
        } else if (entergrade.equals("D")) {
            grade = "Bad";
        }else {
            grade = "Not Acceptable";
        }
        System.out.println("Your entered grade is "+grade);

    }
}
