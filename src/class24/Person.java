/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
Example of key is 1 , 2 ,3 etc.
[8:43 PM]
 */

package class24;

public class Person {

    private String name;
    private String lastName;

    private Integer age;
    private double salary;

    public Person(String name, String lastName, Integer age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void personinfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
