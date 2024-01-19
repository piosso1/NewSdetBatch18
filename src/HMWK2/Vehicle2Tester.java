package HMWK2;

public class Vehicle2Tester {
    public static void main(String[] args) {

        Vehicle2[] arr = {new Car1("Toyota", "Corrola", "full tank"),
                new Truck1("Mac", "Granite", "full tank"),
                new Motorcycle1("Yamaha", "XSR900", "half tank")};
        for (Vehicle2 vh : arr) {
            vh.startEngine();
            vh.stopEngine();
            vh.fuelUp();
        }
    }
}