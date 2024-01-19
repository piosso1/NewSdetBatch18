/*
Create a map of countries(5) with its capital that will store countries
in alphabetical order. Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.
 */

package class24;

import java.util.Map;
import java.util.TreeMap;

public class T2 {
    public static void main(String[] args) {

        Map<String,String> country = new TreeMap<>();
        country.put("US","Washington");
        country.put("Nigeria","Abuja");
        country.put("China","Beijing");
        country.put("Brazil","Brasilia");
        country.put("Afghanistan","Kabul");
        country.forEach((k,v)-> System.out.println(v));
        country.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
