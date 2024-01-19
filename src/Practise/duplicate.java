package Practise;

/*
how to count duplicate elements in array in java without using mapping
 */

public class duplicate {
    public static void main(String[] args) {

        String[] array = {"back", "donte", "girl", "back"};

        System.out.println("Duplicate elements in the array:");

        // Loop through each element
        for (int i = 0; i < array.length; i++) {
            // Check for duplicates
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;  // Print only once for each duplicate
                }
            }
        }
    }
}
