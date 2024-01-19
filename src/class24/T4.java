/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet
 */

package class24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class T4 {
    public static void main(String[] args) {

        Map<Integer,String> bestBuyStore = new LinkedHashMap<>();
        bestBuyStore.put(2248,"laptop");
        bestBuyStore.put(3385,"TV");
        bestBuyStore.put(4469,"Iron");
        bestBuyStore.put(1100,"playstation");
        bestBuyStore.put(5511,"printer");

        Set<Map.Entry<Integer,String>> item = bestBuyStore.entrySet();
        for (Map.Entry<Integer,String> e : item){
            if (e.getKey() > 0){
                System.out.println(e.getKey()+" = "+e.getValue());
            }
        }
    }
}
