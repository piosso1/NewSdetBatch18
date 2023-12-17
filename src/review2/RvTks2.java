package review2;

public class RvTks2 {
    public static void main(String[] args) {

        double mortgRate = 4.4;
        double mortgPrice = 340000;

        if (mortgRate > 4.5) {
            System.out.println("User will not buy a house");
        }else {
            System.out.println("User will consider buying");
        }if (mortgPrice > 350000) {
            System.out.println("user will take a loan");
        }else {
            System.out.println("user will pay cash");
        }
    }
}
