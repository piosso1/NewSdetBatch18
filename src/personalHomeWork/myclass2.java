package personalHomeWork;

/*
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result
 */

public class myclass2 {

    private int statmet(int num1, int num2){
        return num1 + num2;
    }

    private double statmet(double num1, double num2){
        return num1 * num2;
    }

    private int statmet(int num1, int num2, double num3){
        return (int) (num1 - num2 + num3);
    }

    public static void main(String[] args) {
        myclass2 result = new myclass2();

        int re = result.statmet(10,6);
        int re2 = result.statmet(10,5);
        double re3 = result.statmet(15,9,3.5);

        System.out.println("Result: "+re);
        System.out.println("Result: "+re2);
        System.out.println("Result: "+re3);
    }
}
