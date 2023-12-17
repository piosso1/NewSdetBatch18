package replit;
/*
Create a Java program and name it Temperature Check.
Create a variable to store temperature. Your program should check
if temperature is below 32 then it should print “Water will freeze
with temperature __”, otherwise “Water will NOT freeze with
temperature __”.
*/

public class pt1 {
    public static void main(String[] args) {

        int temp = 33;

        if (temp < 32) {
            System.out.println("Water will freeze with temperature " +temp);
        }else {
            System.out.println("Water will NOT freeze with temperature " +temp);
        }
    }
}
