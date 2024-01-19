package class22;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

        // if a name contains the letter O replace it with java
        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");

        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i);
            if (s.contains("o")){
                names.set(i,"java");
            }
        }
        System.out.println(names);
    }
}
