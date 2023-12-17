package Practise;

import java.util.Scanner;

/* The variable "num" holds an integer input from a user
Write a conditional statement starting on line 9 that does the following:

- If num is positive, print "__ is positive"
- If num is negative, print "__ is negative"
- If num is equals to 0, then print "Entered number is equals to 0"

 */

public class tksc2Scanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num+" is positive");
        } else if (num < 0) {
            System.out.println(num+" is negative");
        }else {
            System.out.println("Enter " +num+" is equals to 0");
        }
    }
}
