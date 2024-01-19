package class22;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        // print yes if a name contains the
        // letter O otherwise no for all names
        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");

        for (String s : names){
            if (s.contains("o")){
                System.out.println("yes");
            }else {
                System.out.println("No");
            }

        }

    }
}
