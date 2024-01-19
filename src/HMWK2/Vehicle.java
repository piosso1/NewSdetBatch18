package HMWK2;

/*
Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car, Truck, Motorcycle, and Bicycle.
Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array. Iterate through the array to demonstrate polymorphism.
2)Banking System Task: Design a BankAccount class with subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount.
 */

public class Vehicle {

    private int speed;
    private String color;
    private String fuelType;

    public Vehicle(int speed, String color, String fuelType){
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;
    }
    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void vehicleDetails(){
        System.out.println(speed+" "+color+" "+fuelType);
    }
}
class Car2 extends Vehicle {

    private String accelerate;

    public Car2(int speed, String color, String fuelType, String accelerate) {
        super(speed, color, fuelType);
        this.accelerate = accelerate;
    }

    public void vehicleDetails() {
        System.out.println(getSpeed() + " " + getColor() + " " + getFuelType() + " " + accelerate);
    }
}
class Truck extends Vehicle {

    private String loadCargo;

    public Truck(int speed, String color, String fuelType, String loadCargo) {
        super(speed, color, fuelType);
        this.loadCargo = loadCargo;
    }

    public void vehicleDetails() {
        System.out.println(getSpeed() + " " + getColor() + " " + getFuelType() + " " + loadCargo);
    }
}
class Motorcycle extends Vehicle{

    private String brake;

    public Motorcycle(int speed, String color, String fuelType, String brake){
        super(speed, color, fuelType);
        this.brake = brake;
    }
    public void vehicleDetails(){
        System.out.println(getSpeed()+" "+getFuelType()+" "+brake);
    }
}

class Bicycle extends Vehicle{
    public Bicycle(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void vehicleDetails(){
        System.out.println(getSpeed()+" "+getColor()+" "+getFuelType());
    }
}
class VehicleTester{
    public static void main(String[] args) {

        Car2 c1 = new Car2(230, "Black","pms","Move fast");
        Truck t1 = new Truck(110, "White","AGO", "leaded cargo");
        Motorcycle m1 = new Motorcycle(105, "Blue", "pms", "match brake");
        Bicycle b1 = new Bicycle(95, "gray", "fuel not in use");
        Vehicle v1 = new Vehicle(250, "Red", "lng");

        Vehicle [] arr = {c1,c1,t1,m1,b1,v1};

        Vehicle vehicle = arr[1];
        vehicle.vehicleDetails();

    }
}

