package class4;

public class hw2Class3 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2) {

            if (num1 > num3) {
                System.out.println(num1);
            }
        } else if (num2 > num3) {
            if (num2 > num1) {
                System.out.println(num2);
            }
        }
        if (num3 > num1) {
            if (num3 > num2) {
                System.out.println(num3);
            }
        } else if (num1 == num2) {
            System.out.println("double figure");
        }
    }
    }