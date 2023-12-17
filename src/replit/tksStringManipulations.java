package replit;

/*
Write a for loop that will loop through every character of a word and print out each character,
each on a separate line Sample inputs/outputs:
In: hello
h
e
l
l
o
 */

import java.util.Scanner;

public class tksStringManipulations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter words:");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
}
