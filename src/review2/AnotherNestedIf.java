package review2;

public class AnotherNestedIf {
    public static void main(String[] args) {


        boolean isFriday = false;
        int day = 7;

        if (isFriday) {
            System.out.println("It is a movie night");

            if (day == 13) {
                System.out.println("Lets watch a scary movie");
            }else {
                System.out.println("Let's watch something funny");
            }

        }else {
            System.out.println("No movies, go back to studies");
        }
    }
}
