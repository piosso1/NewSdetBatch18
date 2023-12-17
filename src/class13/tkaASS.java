package class13;

//Write a method to return whether given number is prime or not?
public class tkaASS {

    boolean primeNum(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
