package personalHomeWork;
/*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private
and define printInfo methods as well create the object of each class and call the methods
 */

public class Bird {

    private int number;
    private String beautiful;
    private String color;
    private String canFly;

    public Bird(int number, String beautiful, String color, String canFly){
        this.number = number;
        this.beautiful = beautiful;
        this.color = color;
        this.canFly = canFly;
    }

    public void printInfo(){
        System.out.println(number+" "+beautiful+" "+color+" "+" "+canFly);
    }
}

class sparrow extends Bird{


    public sparrow(int number,String beautiful, String color, String canFly){
        super(number, beautiful, color, canFly);
    }

    public void printInfo(){
        super.printInfo();
    }
}

class parrot extends Bird{

    public parrot(int number,String beautiful, String color, String canFly){
        super(number, beautiful, color, canFly);
    }

    public void printInfo(){
        super.printInfo();
    }
}

class BirdTester{
    public static void main(String[] args) {
        parrot birdDetails = new parrot(2,"Beautiful", "Black and White", "Can fly");
        birdDetails.printInfo();
    }
}
