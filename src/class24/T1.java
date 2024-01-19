/*
Create a map of a building. Store floor number and its associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class T1 {
    public static void main(String[] args) {


        Map<Integer,String>  building = new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Amazon");
        building.put(3,"Yahoo");
        building.put(4,"Ebay");
        building.put(5,"Firefox");
        building.put(6,"CNN");
        building.put(7,"Syntax");
        System.out.println(building.size());
        building.replace(4,"Java");
        building.remove(7,"Syntax");
        System.out.println(building);

        building.forEach((t, s) -> System.out.println(s+" "+t));

    }
}
