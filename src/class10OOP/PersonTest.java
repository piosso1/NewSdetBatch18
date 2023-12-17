package class10OOP;

public class PersonTest {
    public static void main(String[] args) {

        Person person1=new Person();

        person1.name="Patrick";
        person1.age=40;
        person1.height=6.5;
        person1.gender="male";
        person1.nationality="Nigeria";
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.gender);
        System.out.println(person1.nationality);
        person1.talk();
        person1.learn();
        person1.drive();
    }
}
