package HomeWork;

public class tksArray4 {
    public static void main(String[] args) {

        /*
        Create an array of animals and store 5 elements into it.
        Using 2 different loops print all elements from the array
         */


        String [] animals1 = {"Goat","Lion","Sheep","Cat","Pig"};


        for (int i=0; i<animals1.length; i++) {
            System.out.print(animals1[i]+" ");
        }

        String [] animals2 = {"Goat","Lion","Sheep","Cat","Pig"};

        int j = 0;
        while (j <animals2 .length) {
            System.out.println(animals2[j]+" ");
            j++;
        }
    }
}
