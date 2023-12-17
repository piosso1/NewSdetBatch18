package Practise;

/*
Take 2 boolean inputs from a user:



"Are you thirsty?"

"Are you sleepy?"

If user is thirsty and not sleepy--> drink=water

If user is thirsty and sleepy--> drink=coffee

If user is not thirsty and sleepy --> drink=tea

Otherwise drink="nothing"

```
Output:
```

- Looks like you need to drink \_\_\_
 */

import java.util.Scanner;

public class tksc2Scanner22CheckBack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter boolean inputs
        System.out.println("Are you thirsty? (true/false):");
        boolean isThirsty = scanner.nextBoolean();

        System.out.println("Are you sleepy? (true/false):");
        boolean isSleepy = scanner.nextBoolean();

        // Determine the drink based on the conditions
        String drink;
        if (isThirsty && !isSleepy) {
            drink = "water";
        } else if (isThirsty && isSleepy) {
            drink = "coffee";
        } else if (!isThirsty && isSleepy) {
            drink = "tea";
        } else {
            drink = "nothing";
        }

        // Output the result
        System.out.println("Looks like you need to drink: " + drink);
    }
}
