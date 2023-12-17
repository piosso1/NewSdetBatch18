package HomeWork;

public class tksArray3 {
    public static void main(String[] args) {

        /*
        Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

         */


        String [] cars = {"Benz","Honda","Toyota","Kia","Ford","Bmw"};


        for (int i=0; i<cars.length; i++) {
            System.out.print(cars[i]+" ");
    }

        String [] cars2 = {"Benz","Honda","Toyota","Kia","Ford","Bmw"};

        int j = 0;
        while (j < cars2.length) {
            System.out.println(cars2[j]+" ");
            j++;
        }
}
}
