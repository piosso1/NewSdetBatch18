package class2;

public class T1Variables {

    /*
Create a Java program and name it Variables
In your program create different type of variables to store student’s
 information(first name, last name, city, state, phone number) and then
 print value of those variables in the format:
My First name is ___ and my  last name is ____
I live in city__ and state____
And my phone number is ____
 */

    public static void main(String[] args) {

        String fName="Patrick";
        String lName="Udo";
        String city="Uyo";
        String state="Akwa Ibom, Nigeria";
        String phoneNumber="+2347068660122";
        System.out.println("My First name is "+fName+" and my  last name is "+lName);
        System.out.println("I live in city "+city+" and state "+state);
        System.out.println("And my phone number is "+phoneNumber);

        System.out.println("my name is"+fName+"and my last name"+lName);

        city="Calabar";
        state="Cross River";
        phoneNumber="+2347068660111";
        System.out.println("My name is "+fName+" and I moved to new city "+city+"and new state "+state);
        System.out.println("My new phone number is "+phoneNumber);

    }
}
