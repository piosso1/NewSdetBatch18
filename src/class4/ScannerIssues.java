package class4;

import java.util.Scanner;

public class ScannerIssues {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=  sc.nextInt();
        System.out.println("Please Enter your full name");
        // always use anyvariable you declear .nextLine() to clear or break when you .nextline
        sc.nextLine();
        String fullName=sc.nextLine();
        System.out.println("Your name is "+fullName+" and you are " +age+ " year old");
    }
}
