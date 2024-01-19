package class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class T1 {
    public static void main(String[] args) {

        List<String> alist = new ArrayList<>();
        alist.add("John");
        alist.add("Jane");
        alist.add("James");
        alist.add("Jasmine");
        alist.add("Jane");
        alist.add("James");
        Set<String> names = new LinkedHashSet<>(alist);
        alist.clear();
        alist.addAll(names);
        System.out.println(alist);
    }
}
