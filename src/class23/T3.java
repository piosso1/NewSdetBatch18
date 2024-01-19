package class23;

import java.util.HashSet;
import java.util.Set;

/*
Create a Set of cities in which you want to
make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */
public class T3 {
    public static void main(String[] args) {

        Set<String>city = new HashSet<>();
        city.add("Uyo");
        city.add("Atlanta");
        city.add("Lagos");
        city.add("London");
        city.add("Taxas");

        city.removeIf(c->c.startsWith("A"));

        System.out.println(city);
    }
}
