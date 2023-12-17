package personalHomeWork;

/*
create a class named Vehicle. If no arguments are passed while
creating an object of the class, it should print "I love vehicles".
If a String representing the type of vehicle (like "Car", "Bike") is passed,
it should print "I love [VehicleType]". For example, if "Car" is passed, it should print "I love Car"
 */

public class Vehicle {

    public String Car;

    public Vehicle(){
        this.Car = "I love vehicles";
        System.out.println("I love "+Car);
    }

    public Vehicle(String Car){
        this.Car = Car;
        System.out.println("I love "+Car);
    }

    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        Vehicle veh2 = new Vehicle("Car");
    }
}
