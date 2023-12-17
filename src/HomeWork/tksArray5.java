package HomeWork;

public class tksArray5 {
    public static void main(String[] args) {


        /*
        Create an array on integers and calculate the sum of all elements in an array
         */

        int [] numbers={26,57,38,62,-2};

                int sum=0;
        for (int l=0;l<5;l++) {
            sum=sum+numbers[l];
        }
        System.out.println(sum);
    }
}
