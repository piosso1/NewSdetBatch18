package replit;

public class Arrays6 {
    public static void main(String[] args) {

        //Using the following array.
        //{45, 78, 12,  67, 55, 89, 23, 77, 88}
        //Create a for loop to extract values from that array so your output looks as below:

        int [] num = {45, 78, 12,  67, 55, 89, 23, 77, 88};

        int [] num2 = {num[1], num[4], num[7]};

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]+" ");
        }
    }
}
