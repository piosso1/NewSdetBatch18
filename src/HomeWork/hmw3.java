package HomeWork;

/*
Create a method that will accept a String as a parameter and
return a new String that consist only of vowels. Method should be available
inside the class only where it was declared and executed by calling it is name.
 */

public class hmw3 {


    // Private method for extracting vowels from a string
    private static String extractVowels(String input) {
        if (input == null) {
            return null; // Handle null input gracefully
        }

        // Define a set of vowels
        String vowels = "aeiouAEIOU";

        // Initialize an empty string to store the extracted vowels
        String result = "";

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                // If it's a vowel, concatenate it to the result string
                result += ch;
            }
        }

        // Return the result string
        return result;
    }

    // Main method for testing the functionality
    public static void main(String[] args) {
        // Example usage
        String input = "Hello World";
        String vowelsOnly = extractVowels(input);
        System.out.println(vowelsOnly); // Output: eoO
    }
}
