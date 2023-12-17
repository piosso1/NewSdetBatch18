package HomeWork;

public class tksArray6 {
    public static void main(String[] args) {

        /*
        From an array of integer elements find the largest number.
         */

        int [] numbers={12,35,37,85,81,95,19};

        int largestNumber = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println(largestNumber);
    }
}
