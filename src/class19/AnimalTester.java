package class19;

public class AnimalTester {
    public static void main(String[] args) {

        Animal a=new Dog("Jacky","Black",1,12);
        Animal e=new Cat("Jay","White",2,15);

        Dog d=(Dog)a;
        d.bark();
        Cat c=(Cat)e;
        c.meow();

        //double [] arr= {10,20};

        //Dog d1=new Dog("Jacky","Black",1,12);
        //Cat c1=new Cat("Lovly","white",1,12);
        //Animal a1=new Animal("Lovly","white",1,12);

        //Animal [] animals={d1,c1,a1};
    }
}

