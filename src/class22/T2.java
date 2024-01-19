package class22;

/*
Create an arrayList of drinks call it. If any
drink has letter “a” or “e” replace the whole word with water.
 */

import java.util.ArrayList;

public class T2 {
    public static void main(String[] args) {

        ArrayList<String> drink=new ArrayList<>();
        drink.add("coke");
        drink.add("peppsi");
        drink.add("finta");
        drink.add("sprite");

        for (int i = 0; i < drink.size(); i++) {
            String d = drink.get(i);
            if (d.contains("a")|| d.contains("e")){
                drink.set(i,"water");
            }
        }
        System.out.println(drink);
    }
}
