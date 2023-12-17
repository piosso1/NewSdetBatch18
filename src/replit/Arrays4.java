package replit;

public class Arrays4 {
    public static void main(String[] args) {

        //Write a program that creates an array of strings with the following values
        // {"This", "is", "array", "of", "strings"} and prints all values in one line.
        //**Output:**
        //This is array of strings

        String [] val = {"This", "is", "array", "of", "strings"};

        for (String word : val) {
            System.out.print(word+" ");
        }
    }
}
