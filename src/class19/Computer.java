package class19;

/*
Create a class call Computer that will hold 4 subclasses as Apple Lenovo,HP,Dell
*Define common behaviour within and some fields in the parent class and override some
of the methods in child classes
*Define some methods specific to child classes
*Create objects of the child classes and store them into array. Loop through each object
and execute available methods
 */

public class Computer {
    private String name;
    private int price;
    private int memory;

    public Computer(String name, int price, int memory){
        this.name = name;
        this.price = price;
        this.memory = memory;
    }

    public void printInfo(){
        System.out.println(name+" "+price+" "+memory);
    }

    public void browseInternet(){
        System.out.println("Surf the web");
    }

    public void playVideo(){
        System.out.println("Watch movies");
    }
}

class Apple extends Computer {

    public Apple(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void playVideo(){
        System.out.println("play musical videos");
    }
}

class Lenovo extends Computer {

    public Lenovo(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void browseInternet(){
        System.out.println("Surf lenoovo website");
    }
}
class HP extends Computer {
    public HP(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void browseInternet(){
        System.out.println("Connect to hp wifi");
    }
}
class Dell extends Computer{
    public Dell (String name, int price, int memory) {
        super(name, price, memory);
    }
    public void playVideo(){
        System.out.println("Play training class videos");
    }
}
