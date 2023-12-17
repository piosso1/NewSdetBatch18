package class4;

import java.util.Scanner;

public class hwReview5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your city");
        String city = sc.nextLine();
        System.out.println("Please Enter the temperature in F "+city);
        double temp = sc.nextDouble();
        double tempInCelsius = (temp-32)*5.0/9.0;;
        System.out.println("Temperature in "+city+" is "+tempInCelsius+"C");

    }
}
