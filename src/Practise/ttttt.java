package Practise;

import java.util.Scanner;

public class ttttt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare boolean variable isSunny
        boolean isSunny;

        // Ask the user "Is it sunny outside?" and store the answer
        System.out.println("Is it sunny outside? (true/false)");
        isSunny = scanner.nextBoolean();

        if (isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");

            // Declare int variable temperature
            int temperature;

            // Ask the user "What is the temperature outside?" and store the answer
            System.out.println("What is the temperature outside?");
            temperature = scanner.nextInt();

            // Check the temperature condition
            if (temperature > 85) {
                System.out.println("I am going to the beach");
            } else {
                System.out.println("I am going to the park");
            }
        } else {
            System.out.println("I stay home and practice Java");
        }

        scanner.close();
    }
}
