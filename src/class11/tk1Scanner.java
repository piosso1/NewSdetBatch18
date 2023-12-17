package class11;

/*
        Store username, password and confirm password from a user and check following requirements:

        Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”

*/



import java.util.Scanner;

public class tk1Scanner {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username");
        String username = sc.next();

        System.out.println("Enter Password");
        String password = sc.next();

        System.out.println("Confirm Password");
        String confirmpassword = sc.next();

        if (username.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8){
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmpassword)) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }
    }
}