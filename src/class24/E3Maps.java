package class24;

import java.util.*;

public class E3Maps {
    public static void main(String[] args) {

        Map<String,Integer> maps = new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        System.out.println(maps);
        System.out.println(maps.keySet());
        System.out.println(maps.values());
        //Return the keys in the form of a set
        //Set<String> keys = maps.keySet();
        Collection<String> keys = maps.keySet();
        ArrayList<String> arrayList = new ArrayList<>(keys);
        for (String k : keys){
            System.out.println(k);
        }
    }
}
