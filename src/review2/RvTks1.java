package review2;

public class RvTks1 {
    public static void main(String[] args) {

        boolean hasDegree = false;
        double gpa = 3.5;

        if (hasDegree) {
            System.out.println("Congratulation");

            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            }else {
                System.out.println("You should have studied harder");
            }
        }else {
            System.out.println("You should get a degree");
        }
    }
}
