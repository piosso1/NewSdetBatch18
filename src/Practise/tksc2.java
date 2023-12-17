package Practise;

import java.util.Scanner;

public class tksc2 {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        Scanner age = new Scanner(System.in);
        int num = age.nextInt();


        System.out.println("Your age after 10 years is "+(num+10));

    }
}
