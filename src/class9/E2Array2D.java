package class9;

public class E2Array2D {
    public static void main(String[] args) {


        int [][] matrix = {
                {10,20,50},
                {25,35,33},
                {80,90,78,45},
                {45,55,66}
        };
        System.out.println(matrix[1][1]); // colum ---> row
        System.out.println(matrix[0][2]); //// colum ---> row
        //System.out.println(matrix[0][3]); //Error
// gives number of row (length means length of row
        System.out.println(matrix.length); //4
        System.out.println(matrix[0].length); //3
        System.out.println(matrix[2].length); //4
    }
}
