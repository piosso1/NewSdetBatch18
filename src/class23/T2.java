package class23;

import java.util.TreeSet;

public class T2 {
    public static void main(String[] args) {

        TreeSet<String>countries = new TreeSet<>();
        countries.add("Nigeria");
        countries.add("Ghana");
        countries.add("Uk");
        countries.add("US");
        countries.add("Canada");
        System.out.println(countries);

        for (String country : countries){
            System.out.println(country);
        }
    }
}
