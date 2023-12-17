package replit;

public class ppt2DAaaryy {
    public static void main(String[] args) {

        //Write a program to double the values of every element in the array and print it out

        double [][] number = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]*2+" ");
            }
            System.out.println();
        }

    }
}
