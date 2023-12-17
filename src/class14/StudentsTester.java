package class14;

public class StudentsTester {
    public static void main(String[] args) {

        Students schStudent = new Students();
        schStudent.Name="Ptrick";
        schStudent.ID=0556;
        Students.numberOfSt++;

        Students schStudent2 = new Students();
        schStudent2.Name="Best";
        schStudent2.ID=0776;
        Students.numberOfSt++;

        Students schStudent3 = new Students();
        schStudent3.Name="jane";
        schStudent3.ID=0336;
        Students.numberOfSt++;

        System.out.println("Number of Student: "+Students.numberOfSt);



    }
}
