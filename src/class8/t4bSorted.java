package class8;

public class t4bSorted {
    public static void main(String[] args) {

        int [] numbers = {9,10,15,18,20,22,30,60};
        //print true if array is sorted otherwise print false

        boolean isSorted = true;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]>numbers[i+1]) {
                isSorted=false;
                break;
            }
        }
        System.out.println("Is loop sorted "+isSorted);
    }
}
