package class22.HMWK;

/*
Create an arraylist of cars and retrieve all
the values using 2 different ways.
 */

import java.util.ArrayList;

public class arrayListT1 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Toyota");
        cars.add("Mercedes benz");
        cars.add("BMW");
        cars.add("Honda");

        for (int i = 0; i < cars.size(); i++) {
            cars.get(i);
        }
        System.out.println(cars);

        System.out.println("**************");
        for (String c : cars){
            System.out.println(c);
        }
    }
}
