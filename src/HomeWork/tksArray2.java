package HomeWork;

public class tksArray2 {
    public static void main(String[] args) {

        /*
        Create an array of chars and store grades into it: A,B,C,D.
        Then print a grade B (use 2 different ways of creating an array).
         */

        char[] grades = new char[4];
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'C';
        grades[3] = 'D';

        System.out.println(grades[1]);


        char[] grades2 = {'A', 'B', 'C', 'C', 'D'};

        System.out.println(grades2[1]);
    }



}
