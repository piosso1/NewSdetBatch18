package replit;

//Write a program that sums all numbers that are on even index and on even row

public class ppt2DAaaryy6 {
    public static void main(String[] args) {

        int[][] number = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int count = 0;

        for (int[] row : number) {
            for (int number2 : row) {
                if (number2 < 0 && number2 % 2 == 0) {
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}
