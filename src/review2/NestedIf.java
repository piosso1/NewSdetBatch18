package review2;

public class NestedIf {
    public static void main(String[] args) {

        boolean allergy = true;
        String allergyType = "fish";

        if (allergy) {  //outer if
            System.out.println("Let's check what kind of allergy you have");

        }if (allergyType.equalsIgnoreCase("peanut")) {  //nested if or we call it inner if
            System.out.println("Please avoid food that contains peanuts");
        } else if (allergyType.equalsIgnoreCase("dairy")) {
            System.out.println("Please avoid food with dairy products");
        } else if (allergyType.equalsIgnoreCase("ollen")) {
            System.out.println("Please stay indoor when trees are blooming");

        }
    }
}
