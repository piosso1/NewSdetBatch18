package replit;

/*
Create a class 'Main' (please do not make it public as Repl will give you an error)
Inside class declare a String variable 'name' and integer variable 'roll_no'.
Create an object of the class and assign the value of 2 to roll_no and value of "John" to name
Your program should print the following:
Name is John and roll number is 2
 */
public class Main {

String name;
    int roll_no;

    public static void main(String[] args) {

        Main object = new Main();

        object.name="John";
        object.roll_no=2;

        System.out.println("Name is " + object.name + " and roll number is " + object.roll_no);
    }

}
