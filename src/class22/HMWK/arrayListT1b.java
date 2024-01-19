package class22.HMWK;

import java.util.ArrayList;

public class arrayListT1b {
    public static void main(String[] args) {


        ArrayList<String> cars=new ArrayList<>();
        cars.add("Toyota");
        cars.add("Mercedes benz");
        cars.add("BMW");
        cars.add("Honda");

        for (String c : cars){
            //System.out.println(cars);
        }
        System.out.println(cars);
    }
}
