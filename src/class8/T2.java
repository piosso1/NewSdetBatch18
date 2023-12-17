package class8;

public class T2 {
    public static void main(String[] args) {

        int [] numbers = {10,15,20,18,9,60,22,30};
        // show the sum of even numbers and odd numbers
        // separately

        int sumeodd = 0;
        int sumeven = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                sumeven=sumeven+n;
            }else {
                sumeodd=sumeodd+n;
            }
        }
        System.out.println("sum of odd numbers: "+sumeodd);
        System.out.println("sum of even numbers: "+sumeven);
    }
}
