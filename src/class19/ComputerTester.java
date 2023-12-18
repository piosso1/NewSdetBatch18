package class19;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] comp = {new Apple("Apple",1000,250),
                new Lenovo("Lenovo", 1000,250),
                new HP("HP", 1000,250),
                new Dell("Dell",2000, 250)};
        for (int i = 0; i < comp.length; i++) {

            Computer c = comp[i];
            c.printInfo();
            c.playVideo();
            c.browseInternet();
        }
        }
    }
