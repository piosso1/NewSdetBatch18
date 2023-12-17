package class5;

public class E5LogicalOperators {
    public static void main(String[] args) {

        boolean is4gAvbl = true;
        boolean isWifiAvbl = false;

        if (isWifiAvbl || is4gAvbl) {
            System.out.println("You can browse the internet");
        }else {
            System.out.println("Can't use internet");
        }
    }
}
