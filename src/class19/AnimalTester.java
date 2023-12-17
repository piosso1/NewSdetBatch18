package class19;

public class AnimalTester {
    class Cat extends Animal{

        public Cat(String name, String color, int age, double weight) {
            super(name, color, age, weight);
        }

        public void meow(){
            System.out.println("Meow meow.....");
        }
    }
}
