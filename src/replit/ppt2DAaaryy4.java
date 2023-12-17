package replit;

/*
Write a program that calculates the sum of elements from each row in a 2D
array and adds them into array of integers
For example, if we run rowSums for the following 2D array:
 */

public class ppt2DAaaryy4 {
    public static void main(String[] args) {

        int[][] number
                = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };


        for (int i = 0; i < number.length; i++) {
            int sumrow = 0;
            for (int j = 0; j < number[i].length; j++) {
                sumrow = sumrow + number[i][j];
            }
            System.out.println(sumrow);
        }
    }
}