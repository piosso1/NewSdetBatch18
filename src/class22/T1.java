package class22;

/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Kamla"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
