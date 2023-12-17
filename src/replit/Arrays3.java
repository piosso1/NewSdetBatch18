package replit;

public class Arrays3 {
    public static void main(String[] args) {


        //Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}
        //Print the values so the output should look like below
        //**Output:**
        //syntax

        //// Create an array of characters
        char [] ar = {'s', 'a', 'y', ' ', 'b', 'n', 'c', 't', ' ', 'd', 'a', 'e', 'x'};

//// Extract "syntax" from the array
        char [] outputval = {ar[0], ar[2], ar[5], ar[7], ar[1], ar[12]};

//// Convert the char array to a string
        String syntaxArray = new String(outputval);

        System.out.println(outputval);

    }
}
