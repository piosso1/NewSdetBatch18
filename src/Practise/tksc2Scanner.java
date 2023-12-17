package Practise;

/* class5
Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)

 */

import java.util.Scanner;

public class tksc2Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the person's height in inches: ");
        int heightInInches = sc.nextInt();

        if (heightInInches < 60) {
            System.out.println("Person is classified as short.");
        } else if (heightInInches >= 60 && heightInInches <= 72) {
            System.out.println("Person is classified as medium.");
        } else {
            System.out.println("Person is classified as tall.");
        }
    }
}
