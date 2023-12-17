package class5;

public class E4LogicalOperators {
    public static void main(String[] args) {

        boolean bringFlower = true;
        boolean bringChocolates = false;
        boolean allMyMistake = false;

        if (bringFlower || bringChocolates || allMyMistake) {
            System.out.println("HomeMinister is Happy" );
        }else {
            System.out.println("HomeMinister is angry");
        }
    }
}
