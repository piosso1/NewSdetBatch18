package class11;

public class E9StringDemo {
    public static void main(String[] args) {

        String str = "Today is Saturday";

        System.out.println(str.substring(0,5));
        System.out.println(str.substring(6,str.length()));

        String str2 = "Java is fun";
        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(5,7));
    }
}
