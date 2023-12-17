package replit;

/*
Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
 */

public class Main11 {
    public static void main(String[] args) {


        String str1 = "John";
        String str2 = "Jane";
        String str3 = "Jimmy";
        String str4 = "Mike";
        String str5 = "Emily";

        System.out.println(str1.substring(0,3));
        System.out.println(str2.substring(0,3));
        System.out.println(str3.substring(0,3));
        System.out.println(str4.substring(0,3));
        System.out.println(str5.substring(0,3));

    }
}
