package Practise;

/*
Prompt user with questions: "Please enter your favorite car make"

- if user enters  BMW -->  carOrigin = "german car"
- if user enters  Toyota -->  carOrigin = " japanese car"
- if user enters  Maserati -->  carOrigin = "italian car"
- anything else besides those values --> carOrigin = "unknown"
```
The output of your program should be:
"Your favorite car is
 */

import java.util.Scanner;

public class tksswitchSTM5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their favorite car make
        System.out.println("Please enter your favorite car make:");

        // Read the input car make from the user
        String favoriteCarMake = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        // Determine the car's origin based on the favorite car make using a switch statement
        String carOrigin;

        switch (favoriteCarMake) {
            case "bmw":
                carOrigin = "german car";
                break;
            case "toyota":
                carOrigin = "japanese car";
                break;
            case "maserati":
                carOrigin = "italian car";
                break;
            default:
                carOrigin = "unknown";
        }

        // Output the result
        System.out.println("Your favorite car is a " + carOrigin);
    }
}
