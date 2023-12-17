package Practise;

/*
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
**Output**:
Today you will be learning
 */

import java.util.Scanner;

public class tksLOPTS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user with the question
        System.out.println("Is it weekend? (true/false):");
        boolean isWeekend = scanner.nextBoolean();

        // Determine the subject based on the answer
        String subject = isWeekend ? "Java" : "manual testing";

        // Output the result
        System.out.println("Today you will be learning " + subject);
    }
}
