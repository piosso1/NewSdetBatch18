package Practise;

import java.util.Scanner;

public class tksc2Scanner19CkeckBack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user if they need a loan (true or false)
        System.out.println("Do you need a loan? (true/false):");
        boolean needsLoan = scanner.nextBoolean();

        if (needsLoan) {
            // If true, ask for the credit score
            System.out.println("What is your credit score?");
            int creditScore = scanner.nextInt();

            // Determine eligibility based on the credit score
            String eligibility;
            if (creditScore < 600) {
                eligibility = "Not eligible";
            } else if (creditScore >= 600 && creditScore <= 700) {
                eligibility = "Maybe eligible";
            } else if (creditScore >= 701 && creditScore <= 800) {
                eligibility = "Eligible";
            } else {
                eligibility = "Definitely eligible";
            }

            // Print the eligibility
            System.out.println("The eligibility is: " + eligibility);
        } else {
            // If false, eligibility is unknown
            System.out.println("The eligibility is: Unknown");
        }
    }
}
