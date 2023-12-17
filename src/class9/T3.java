package class9;

public class T3 {
    public static void main(String[] args) {

        //create a 2d array (shorter way)in which first array will consist of 4 names
// and second array will contain grades.
// then your program should print name of the student that has a and b grade

        String [][] students= {
                {"Muhayyo", "Azam", "Abdulloh", "Maryam"},
                {"A", "B", "A", "D"}};

        // Printing names of students with grades 'A' and 'B'
        for(int i=0; i<students[0].length;i++){
            if(students[1][i].equals("A")||students[1][i].equals("B"))
                System.out.println(students[0][i]+" "+students[1][i]);
            }
        }
    }

