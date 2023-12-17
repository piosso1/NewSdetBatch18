package Practise;

/*The variable "name" holds a String user input
        Write a conditional statement starting on line 9 that does the following:
        - If name is equal to "Chen", print "teacher"
        - For any other input, print "student"

 */

import java.util.Scanner;

public class tksc2Scanner11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = sc.nextLine();

        if (name.equalsIgnoreCase("Chen")) {
            System.out.println("teacher");
        }else {
            System.out.println("student");
        }
    }
    }

