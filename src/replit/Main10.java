package replit;

import java.util.Scanner;

/*
Based on the user inputs program should give a correct answer.
If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
"Proceed with Chrome browser"
If browser is firefox, FIREFOX or FireFOX it should print the:
"Proceed with Firefox browser"
If browser is IE, ie or iE it should print the:
"Proceed with IE browser"
If any other browser it should print the:
"Invalid browser"
 */

public class Main10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter browser name: ");
        String browserType = sc.nextLine();

        String lowerInput = browserType.toLowerCase();

        if (lowerInput.contains("chrome")){
            System.out.println("Proceed with Chrome browser");
        } else if (lowerInput.contains("firefox")) {
            System.out.println("Proceed with Firefox browser");
        } else if (lowerInput.contains("ie")) {
            System.out.println("Proceed with IE browser");
        }else {
            System.out.println("Invalid browser");
        }
        sc.close();
    }
}
