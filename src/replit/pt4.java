package replit;

/*
Create a Java program and declare int variable that will
hold a month number. Based on the value of the variable
your program should print the name of the month.
 */

public class pt4 {
    public static void main(String[] args) {

        int month = 4;
        switch (month) {
               case 1:
                   System.out.println("jan");
                   break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            default:
                System.out.println("invalid month");
           }
    }
}
