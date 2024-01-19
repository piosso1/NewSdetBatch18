package class22;

//Create an arrayList of words.
// Remove every word that ends with “e”.

import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) {


        ArrayList<String> words=new ArrayList<>();
        words.add("carlos");
        words.add("patrick");
        words.add("bestie");
        words.add("kamela");

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("e")){
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);

    }
}
