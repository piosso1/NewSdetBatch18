package Practise;

import java.util.Scanner;
/*
Write a program that takes a user's name and prints it.
**Example Output:**
Hello, please enter your name
Your name is Sumair

 */

public class tksc2Scanner9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, please enter your name");
        String userName = sc.nextLine();

        System.out.println("Your name is "+userName);
    }
}
