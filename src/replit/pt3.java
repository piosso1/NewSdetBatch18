package replit;

/*
3.  Create Java program to store 2 values for expected and actual hours.
 Your program should check
if actual hours are more than  expected the program should print
“You will love the course and you will succeed”,
otherwise “Course will be very hard for you!”  */

public class pt3 {
    public static void main(String[] args) {

        int acthrs = 1;
        int exphrs = 2;

        if (acthrs > exphrs) {
            System.out.println("You will love the course and you will succeed");
        }else {
            System.out.println("Course will be very hard for you!");
        }

    }
}
