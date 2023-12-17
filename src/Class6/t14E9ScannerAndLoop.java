package Class6;

public class t14E9ScannerAndLoop {
    public static void main(String[] args) {

        int add = 0;
        for (int i = 1; i <= 10; i++) {
            add = add + i;
        }
        System.out.println(add);
//write a loop to add first 10 numbers from
        //1 to 10 =1+2+3+4+5+6+7+8+9+10=55
        int sum=0;
        int i=1;
        while (i<=10) {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);

    }
}