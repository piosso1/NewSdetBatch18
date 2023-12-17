package Practise;

import java.util.Scanner;

/*Create a program that will ask a user to input boolean value "Input the boolean value"

If the input is true or false, then the output should look like below:

 */

public class tksc2Scanner8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the boolean value");
        boolean trueInput = sc.nextBoolean();

        System.out.println("The value is " +trueInput);
        boolean falseInput = sc.nextBoolean();

        System.out.println("The value is "+falseInput);
    }

}
