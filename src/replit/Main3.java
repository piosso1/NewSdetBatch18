package replit;

/*
Create a Class Main
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
 */

public class Main3 {

    String Breed;
    String name;
    String color;


    void bark(){System.out.println("can bark");}
    void run(){System.out.println("can run");}
    void play(){System.out.println("can play");}



    public static void main(String[] args) {

        Main3 Husky = new Main3();
        Husky.name = "Husky";


        Husky.bark();
        Husky.run();
        Husky.play();

        Main3 Bulldog = new Main3();
        Bulldog.bark();
        Bulldog.run();
        Bulldog.play();

        Main3 Labrador = new Main3();
        Labrador.bark();
        Labrador.run();
        Labrador.play();
    }
}
