package HMWK2;

/*
Vehicle Management System: Design a base class Vehicle with methods like startEngine(),
stopEngine(), fuelUp(), and fields like make, model, and fuelLevel. Create subclasses
like Car, Truck, and Motorcycle, each with specific implementations for the methods,
considering their unique characteristics.

 */


public abstract class Vehicle2 {

    private String make;
    private String model;
    private String fuelLevel;

    public Vehicle2(String make, String model, String fuelLevel) {
        this.make = make;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void fuelUp();
}
class Car1 extends Vehicle2{

    public Car1(String make, String model, String fuelLevel){
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("Start the the car engine and steam the car first before you drive");
    }

    @Override
    public void stopEngine() {
        System.out.println("make sure you off the car when stopping to enable the engine to stop working");
    }

    @Override
    public void fuelUp() {
        System.out.println("Stop at the gas station to fuel up your car tank");
        System.out.println("------------------------------");
    }
}
class Truck1 extends Vehicle2 {

    public  Truck1(String make, String model, String fuelLevel){
        super(make, model, fuelLevel);
    }
    @Override
    public void startEngine() {
        System.out.println("truck engine takes time before it start");
    }

    @Override
    public void stopEngine() {
        System.out.println("steam the truck engine before you stop the engine");
    }

    @Override
    public void fuelUp() {
        System.out.println("fuel up AGO in truck tank before driving");
        System.out.println("------------------------------");
    }
}
class Motorcycle1 extends Vehicle2{

    public Motorcycle1(String make, String model, String fuelLevel){
        super(make, model, fuelLevel);
    }
    @Override
    public void startEngine() {
        System.out.println("you have to kick start the motorcycle before the engine can start");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop motorcycle at the gas station");
    }

    @Override
    public void fuelUp() {
        System.out.println("buy gas at the gas station to fuel your motorcycle");

    }
}


