package HMWK2;

/*
Create a class Car with properties like make, model, and year.
Implement a method calculate_rental_price based on the number of rental days.
Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price method in LuxuryCar to include additional charges.
Demonstrate the functionality by creating instances of each class and calling their methods
 */

public class Car {
    private String make;
    private String model;
    private int rentalDayPrice;
    private int year;

    public Car(String make, String model, int year, int rentalDayPrice){
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalDayPrice = rentalDayPrice;
    }
    public int  calculateRentalPrice(int numberOfDays){
        if (numberOfDays <= 0){
            System.out.println("Invalid number of rental days");
            return 0;
        }
        return numberOfDays * rentalDayPrice;
    }
}
class LuxuryCar extends Car {

    private int cautionCharge;

    public LuxuryCar(String make,String model, int year, int rentalDayPrice, int cautionCharge) {
        super(make, model, year, rentalDayPrice);
        this.cautionCharge = cautionCharge;
    }

    public int calculateRentalPrice(int numberOfDays) {
        if (numberOfDays <= 0) {
            System.out.println("Invalid number of rental days");
            return 0;
        }
        return super.calculateRentalPrice(numberOfDays) + cautionCharge;
    }
}

class EconomyCar extends Car{

    public EconomyCar (String make, String model, int year, int rentalDayPrice){
        super(make, model, year, rentalDayPrice);
    }
    public int  calculateRentalPrice(int numberOfDays){
        if (numberOfDays <= 0){
            System.out.println("Invalid number of rental days");
            return 0;
        }
        return super.calculateRentalPrice(numberOfDays);
    }
}
class CarTester{
    public static void main(String[] args) {

        LuxuryCar lc = new LuxuryCar("Toyota", "Camry", 2023, 120, 200);
        int luxuryCarPrice = lc.calculateRentalPrice(10);
        System.out.println("Luxury Car Rental Price: "+luxuryCarPrice);
        EconomyCar ec = new EconomyCar("Honda", "Civic", 2021, 100);
        int economyCarPrice = ec.calculateRentalPrice(10);
        System.out.println("EconomyCar Price: "+economyCarPrice);

    }
}

