package personalHomeWork;

/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class result {

    public static void statmet(int num1, int num2){
        System.out.println("Overloaded method with int "+(num1-num2));
    }

    public static void statmet(double num1, double num2){
        System.out.println("Overloaded method with double "+(num1*num2));
    }

    public static void statmet(String Batch, int num1){
        System.out.println("Overloaded method with text "+Batch+num1);
    }

    public static void main(String[] args) {
        result.statmet(10,6);
        result.statmet(10.5,2.6);
        result.statmet("Batch ", 18);
    }
}
