package replit;

import java.util.Scanner;

public class ForLoop8 {
    public static void main(String[] args) {


        //You should input:
        //int end;
        //Write a for loop that will print out a series of numbers starting
        // at 0 and ending at the doubled value of end(value must be taken from a user), exclusive.
        //Each number should be on the same line, separated by a space.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int x = sc.nextInt();
        if (x > 0) {
            System.out.print("Numbers 0 to " + (x -1) + ": ");
            for (int i = 0; i < x * 2; i++) {


                System.out.print(i + " ");
            }
        } else if (x >=0) {
            System.out.println("Numbers 0 to " + (x) + ": "+x);

        }else {
            System.out.println("no output");
    }
    }
}