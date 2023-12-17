package class7;

public class E2NestedLoops {
    public static void main(String[] args) {

        // outer loop control inner loop
        for (int row = 0; row < 3; row++) {

            // inner loop control it class
            for (int column = 0; column < 5; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
