package replit;

public class ForLoopNestedIf2 {
    public static void main(String[] args) {

        //Create a for loop that prints out even numbers from 2 to 14 using if condition
        //Must include the number 14 in the output

        for (int i = 2; i <= 14; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}