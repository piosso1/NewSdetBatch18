class Main {
    /*Create a Class Main
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
    String Breed;
    String name;
    String color;


    void bark(){System.out.println(name+" can bark");}
    void run(){System.out.println(name+" can run");}
    void play(){System.out.println(name+" can play");}



    public static void main(String[] args) {

        Main Husky = new Main();
        Husky.name = "Husky";



        Husky.bark();
        Husky.run();
        Husky.play();

        Main Bulldog = new Main();
        Bulldog.name  = "Bulldog";

        Bulldog.bark();
        Bulldog.run();
        Bulldog.play();

        Main Labrador = new Main();
        Labrador.name  = "Labrador";

        Labrador.bark();
        Labrador.run();
        Labrador.play();
    }
}
