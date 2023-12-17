package Practise;

import java.util.Scanner;

public class tksc1 {
    public static void main(String[] args) {

        System.out.println("Please Enter First Name");
        Scanner firstname = new Scanner(System.in);
        String fname = firstname.nextLine();

        System.out.println("Please Enter Last Name");
        Scanner lasttname = new Scanner(System.in);
        String lname = lasttname.nextLine();

        System.out.println(fname+" "+lname);
    }
}
