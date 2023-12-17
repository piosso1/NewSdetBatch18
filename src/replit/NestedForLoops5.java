package replit;

public class NestedForLoops5 {
    public static void main(String[] args) {

        //Write a program to print out the pattern:
        // **Expected output:**
        // 1 2 3 4 5
        // 1 2 3 4 5

        for (int ro = 0; ro < 2; ro++) {


            for (int col = 1; col <= 5; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
