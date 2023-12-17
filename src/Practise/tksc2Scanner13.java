package Practise;

/* Write a program to take values of length and width from the user.

Based on value define whether the shape is a square or rectangle.

 */

import java.util.Scanner;

public class tksc2Scanner13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the length");
        double length = scanner.nextDouble();


        System.out.println("Please enter the width:");
        double width = scanner.nextDouble();


        if (length == width) {
            System.out.println("The shape of your object is square");
        } else {
            System.out.println("The shape of your object is rectangle");
        }

    }
}
