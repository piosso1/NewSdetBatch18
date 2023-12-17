package Practise;

/*
By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.
First Output: "Enter name of the instructor"
case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Moazzam as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
Other than these four names if the user provides any other names --> " Invalid instructor selected"
 */

import java.util.Scanner;

public class tksswitchSTM {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name of the instructor
        System.out.println("Enter name of the instructor:");

        // Read the name input from the user
        String instructorName = scanner.nextLine();

        // Determine the responsibility based on the instructor's name using a switch statement
        switch (instructorName.toLowerCase()) {
            case "asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            case "moazzam":
                System.out.println("Will take care of SDLC Assignment");
                break;
            case "weqas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            case "asel":
                System.out.println("Will take care of every Assignment");
                break;
            default:
                System.out.println("Invalid instructor selected");
        }
    }
}
