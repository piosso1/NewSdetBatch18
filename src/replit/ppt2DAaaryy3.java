package replit;

/*
Write a program that will print the sum of all elements in 2D array.
 */

public class ppt2DAaaryy3 {
    public static void main(String[] args) {

        int[][] somnum = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };

        int sum = 0;
        for (int i = 0; i < somnum.length; i++) {
            for (int j = 0; j < somnum[i].length; j++) {
                sum = sum+somnum[i][j];

            }
        }
        System.out.print(sum);
    }
}
