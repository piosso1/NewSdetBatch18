package class24;

import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {

        Map<Integer,Person> persn = new TreeMap<>();
        persn.put(1,new Person("patrick","udo",25,30000));
        persn.put(2,new Person("uduak","akpan",20,32000));
        persn.put(3,new Person("best","ekpo",26,31000));
        persn.put(4,new Person("edi","mike",27,35000));

        persn.forEach((key,value)->{
            System.out.println("id: "+key);
            value.personinfo();
        });
    }
}
