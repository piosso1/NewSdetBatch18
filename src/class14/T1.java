package class14;

/*
create a static method wit int return type , call it dValue which takes a number as input
multiply it by 2 and return the value
 */

public class T1 {

    static int dValue(int num){
        return num*2;
    }

    public static void main(String[] args) {
        System.out.println(T1.dValue(10));
    }
}
