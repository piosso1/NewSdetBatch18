package replit;

//Write a program that prints the highest value in the array.

public class ppt2DAaaryy2 {
    public static void main(String[] args) {

        int [] number = {5,4,8};
        int highest = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > highest){
                highest = number[i];
            }
        }
        System.out.println(highest);
    }
}
