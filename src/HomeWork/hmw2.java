package HomeWork;

/*
Create a method that will take a String as a
parameter and returns reversed String. Method should be available
to all classes within your project and accessible by class name.
 */

public class hmw2 {

    // Public and static method for reversing a string
    public static String hmw2(String input) {
        if (input == null) {
            return null; // Handle null input gracefully
        }

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Reverse the character array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
