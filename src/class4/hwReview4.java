package class4;

import java.util.Scanner;

public class hwReview4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("issue a driver license to him");
        } else {
            System.out.println("get a learners permit");
        }
    }
}