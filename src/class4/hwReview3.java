package class4;

import java.util.Scanner;

public class hwReview3 {

    public static void main(String[] args) {
        System.out.println("What is the amount of loan needed");
        Scanner sc = new Scanner(System.in);
        double loan = sc.nextDouble();
        if (loan <= 200000) {
            System.out.println("You can get this loan");
        }else {
            System.out.println("you will be rejected");
        }


    }
}
