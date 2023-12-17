package class5;

import java.util.Scanner;



public class tks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");

        int day = sc.nextInt();

        if (day >= 1 && day <=5) {
            System.out.println("weekday");
        } else if (day >= 6 && day <= 7) {
            System.out.println("weekend");

        }else {
            System.out.println("Invalid day");
        }
    }
}
