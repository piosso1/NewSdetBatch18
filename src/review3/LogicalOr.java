package review3;

public class LogicalOr {
    public static void main(String[] args) {

        boolean rain = false;
        boolean cold = true;

        if (cold || rain) {
            System.out.println("I am staying home");
        }

        String welcomeMessage = "Welcome Admin";
        boolean dasboardFormDisplayed = true;

        if (welcomeMessage.equals("Welcome Admin") || dasboardFormDisplayed) {
            System.out.println("Admin user is successfully logged in");
        }else {
            System.out.println("Cannot login using admin credentials");
        }
    }
}
