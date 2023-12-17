package replit;

/*
Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'
carColor='White'
carYear=2018
carMake='Toyota'
**Expected Output:**

Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
 */

public class main2 {

String carColor;

int carYear;

String carMake;


    public static void main(String[] args) {


        main2 bmw = new main2();
        main2 toyota = new main2();

        bmw.carColor="Black";
        bmw.carYear=2019;
        bmw.carMake="Bmw";
        
        toyota.carColor="White";
        toyota.carYear=2018;
        toyota.carMake="Toyota";

        System.out.println("Car is "+bmw.carColor+" and car year is "+bmw.carYear+" and car model is "+bmw.carMake);
        System.out.println("Car is "+toyota.carColor+" and car year is "+toyota.carYear+" and car model is "+toyota.carMake);
    }
}
