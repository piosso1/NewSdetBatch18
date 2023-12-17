package class9;

public class T4 {
    public static void main(String[] args) {

//create 2D array of cars american, german, Korean,Italian,
//Then retrieve all value from that array. using two difference loops

        // Creating a 2D array of cars
        String[][] carsArray = {
                {"Chevrolet", "Ford", "Dodge"},
                {"Volkswagen", "BMW", "Mercedes"},
                {"Hyundai", "Kia", "Genesis"},
                {"Fiat", "Ferrari", "Lamborghini"}
        };

        for(int i=0;i<carsArray.length;i++){
            for (int j = 0; j < carsArray[i].length; j++) {
                System.out.print(carsArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Using Enhanced For Loop:");
        System.out.println();

        for (String[] arr : carsArray) {
            for (String car : arr) {
                System.out.print(car+" ");
            }
            System.out.println();
        }
    }
}
