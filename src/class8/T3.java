package class8;

public class T3 {
    public static void main(String[] args) {


        int [] numbers = {101,100,25,30,25,50,300};
        //to count how many number are divisible by 5 and how many are divisible by 2

        int divide5 = 0;
        int divide2 = 0;
        for (int n : numbers) {
            if (n % 5 == 0) {
                divide5++;
            }
            if (n % 2 == 0) {
                divide2++;
            }
        }
        System.out.println("number divide by 5: "+divide5);
        System.out.println("number divide by 2: "+divide2);
    }
}
