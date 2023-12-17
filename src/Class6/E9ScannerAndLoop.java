package Class6;

import java.util.Scanner;

public class E9ScannerAndLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter the start point");
        int start=sc.nextInt();

        System.out.println("please enter the end");
        int end= sc.nextInt();

        System.out.println("Please enter step size as well");
        int step= sc.nextInt();


        while (start<=end) {
            System.out.print(start+" ");
            start=start+step;
        }
    }
}
