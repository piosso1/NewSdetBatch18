package class16;

 public class Person {

    private String name;
    private int age;
    double weight;

    public Person(int age) {
        this.age = age;

    }
    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
 }


class Student extends Person{

    char grade;

    public Student(int age) {

        super(age);
    }
    void study(){

    }
}

class StudentTester {
    public static void main(String[] args) {
        Student s = new Student(12);
        s.printInfo();
    }
}
