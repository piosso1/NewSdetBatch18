package class8;

public class T1 {
    public static void main(String[] args) {

        String[] names = {"Aidos","Zeeshan","Abid","Sharif","Zeeshan"};

        int count=0;
        for (int i=0; i< names.length; i++ ) {
            if (names[i].equals("Zeeshan")){
                count++;
                System.out.println("Z0");
            }
        }
    }
}
