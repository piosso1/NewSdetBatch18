package class22;

import java.util.ArrayList;

public class T3b {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("carlos");
        words.add("patrick");
        words.add("bestie");
        words.add("kamela");

        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);
    }
}
