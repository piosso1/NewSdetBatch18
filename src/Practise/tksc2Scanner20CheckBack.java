package Practise;

import java.util.Scanner;

public class tksc2Scanner20CheckBack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two strings
        System.out.println("Please enter the first string:");
        String word1 = scanner.nextLine();

        System.out.println("Please enter the second string:");
        String word2 = scanner.nextLine();

        // Prompt the user to enter two integers
        System.out.println("Please enter the first integer:");
        int int1 = scanner.nextInt();

        System.out.println("Please enter the second integer:");
        int int2 = scanner.nextInt();

        // Make the comparisons
        if (int1 == int2 && word1.equals(word2)) {
            System.out.println("Output: AND");
        } else if (int1 == int2 || word1.equals(word2)) {
            System.out.println("Output: OR");
        } else {
            System.out.println("Output: NONE");
        }
    }
}
