package class5;

import java.util.Scanner;

public class tks4a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Your birth Month: ");


        String birthmont = sc.nextLine();
        String season = "season";

        if (birthmont.equalsIgnoreCase("March")
                || birthmont.equalsIgnoreCase("April")
                || birthmont.equalsIgnoreCase("May")){
            System.out.println("Spring");
            season="spring";

        } else if (birthmont.equalsIgnoreCase("June")
                || birthmont.equalsIgnoreCase("July")
                || birthmont.equalsIgnoreCase("August")) {
            System.out.println("Summer");
            season="summer";

        } else if (birthmont.equalsIgnoreCase("September")
                || birthmont.equalsIgnoreCase("October")
                || birthmont.equalsIgnoreCase("November")) {
            System.out.println("Autuim");
            season="Autuim";

        } else if (birthmont.equalsIgnoreCase("December")
                || birthmont.equalsIgnoreCase("January")
                || birthmont.equalsIgnoreCase("Febuary")) {
            System.out.println("Winter");
            season="Winter";

        }else {
            System.out.println("Invalid Season");
        }

        System.out.println("You were born in "+season+" season");

    }
}
