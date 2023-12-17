package Practise;

/*
Create a Java program that will ask if user has a credit card or not.
If you user does not have a credit card then offer them.
If they do have one ask what is balance on the card?
If balance of the card is larger than 1000, tell them to pay off immediately, otherwise you can tell them that they can spend more.
 */

import java.util.Scanner;

public class tksc2Scanner6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you have credit card (yes or no)");
        String cardOrNot = sc.next();
        
        if (cardOrNot.equalsIgnoreCase("no")) {
            System.out.println("Would you apply for credit card?");
            String applyForCard = sc.next();

            if (applyForCard.equalsIgnoreCase("yes")) {
                System.out.println("You can apply for a credit card now");
            }else {
                System.out.println("No problem");
            }
        } else if (cardOrNot.equalsIgnoreCase("yes")) {
            System.out.println("What's your balance");
            double balance = sc.nextDouble();

            if (balance > 1000) {
                System.out.println("pay off immediately");
            }else {
                System.out.println("You can spend more");
            }
        }else {
            System.out.println("Invalid response");
        }



    }
}
