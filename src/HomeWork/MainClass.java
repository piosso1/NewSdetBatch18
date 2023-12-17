package HomeWork;
/*
Create a method that will accept an array as parameters and will
return a sum of all elements from that array. Method
should be visibly only within same package and accessible by the creating
an instance/object of the class.
 */


    class hmw1 {


        // Method with default access modifier (package-private)
        int methodSum(int[] numbers) {
            int sum = 0;
            for (int i : numbers) {
                sum += i;
            }
            return sum;
        }
    }

    public class MainClass {

        public static void main(String[] args) {
            // Example usage within the same package
            hmw1 calc = new hmw1();
            int[] myNumbers = {5, 2, 8, 4,9};
            int sum = calc.methodSum(myNumbers);

            System.out.println("Sum of the array elements: " + sum);
        }
}
