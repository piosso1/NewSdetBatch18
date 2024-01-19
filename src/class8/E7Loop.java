package class8;

public class E7Loop {
    public static void main(String[] args) {

        char[] word = {'S', 'U', 'N', 'D', 'A', 'Y'};
        //Write a loop to print these letters in reverse order
        //yadnus

        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i]);
        }
    }
}
