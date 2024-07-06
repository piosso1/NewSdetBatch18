package interview;

import java.util.Arrays;

public class variables {
    public static void main(String[] args) {

        //Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
        //without a temporary variable?
        int a = 20;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

        System.out.println("---------");

        String boy = "daniel";
        String girl = "hanna";

        //boy = girl;
        //girl = boy;
        boy = boy + girl;
        girl = boy.substring(0,boy.length() - girl.length());

        boy = boy.substring(girl.length());


        System.out.println(boy);
        System.out.println(girl);

        System.out.println("---------");

        //Write a java program to check whether a given number is prime or not?
        int number = 3;
        boolean isPrime = true;

        if (number > 1){
            for (int i = 2; i <number ; i++) {
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }else {
            isPrime = false;
        }
        System.out.println("number "+number+" is prime? "+isPrime);

        System.out.println("---------");

        //Write a Java Program to print the first 10 numbers of Fibonacci series.

        int x,y,z;
        x=0;
        y=1;

        for (int i = 0; i < 10; i++) {
            System.out.println(x+" ");

            z = x+y;
            x = y;
            y = z;
        }

        System.out.println("---------");
        //Write a java program to find the second largest number in the array? Maximum and
        //minimum number in the array?

        int[] numbers = {32,61,16,89,74,25};
        Arrays.sort(numbers);
        System.out.println("Smallest: "+numbers[0]);
        System.out.println("Biggest: "+numbers[numbers.length-1]);
        System.out.println("Second Largest: "+numbers[numbers.length-2]);

        //2. Another way without using any inbuilt function
        int[] numbers2 = {1, 110, -1, 90, 16, 89, 74, 89, 25, 100};
        int smallest1 = numbers[0];
        int largest = 0;
        int largest2 = 0;

        for (int i = 0; i < numbers2.length; i++) {
            int element = numbers2[i];

            if (element>largest){
                largest2 = largest;
                largest = element;
            } else if (element > largest2 && element != largest) {
                largest2 = element;
            }
            if (element<smallest1){
                smallest1=element;
            }
        }
        System.out.println("Smallest1: "+smallest1);
        System.out.println("Largest: "+largest);
       System.out.println("Largest2: "+largest2);
    }
}
