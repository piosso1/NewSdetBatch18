package Practise;

/*Write a program to take user name, age and mobile number
First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"

 */

import java.util.Scanner;
public class tksc2Scanner7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("user name");
        String usrnem = sc.nextLine();

        System.out.println("Enter your mobile number(please use xxx-xxx-xxxx format):");
        String mobileNumber=sc.nextLine();


        System.out.println("Enter your age");
                int age = sc.nextInt();

                if (age < 0 || age > 120) {
                    System.out.println("Invalid age");
                    return;
                } else if (age < 18) {
                    System.out.println("You are a minor");
                }

        System.out.println("Your name is "+usrnem+", your age is "+age+" and your mobile number is "+mobileNumber);
    }
}



