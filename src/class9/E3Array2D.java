package class9;

public class E3Array2D {
    public static void main(String[] args) {

        int [][] matrix = {
                {10,20,50},
                {25,35,33},
                {80,90,78,45},
                {45,55,66}
        };

        int [] row = matrix[2];
        System.out.println(row[2]);
        for (int i=0; i<row.length; i++) {
            System.out.print(row[i]+" ");
        }
    }
}
