package Practise;

/*
HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.
 */

import java.util.Scanner;

public class tksc2Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operator (+, -, *, /)");
        char operator = sc.next().charAt(0);

        double result;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '/') {
            if (num2 != 0);
            result = num1 / num2;
        }else {
            System.out.println("invalid Operator");
            return;
        }
        System.out.println("Result: "+result);

    }
}
