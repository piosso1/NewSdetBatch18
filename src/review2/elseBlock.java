package review2;

public class elseBlock {
    public static void main(String[] args) {

        int temp = 91;

        if (temp > 91) {
            System.out.println("I will go to the beach");
        } else { //otherwise
            System.out.println("I will stay at home and practice java");
        }

        String month = "Novermber";

        if (month.equalsIgnoreCase("November")) {
            System.out.println("It is thanksgiving holiday");
        }else {
            System.out.println("There are holidays");
        }

    }
}