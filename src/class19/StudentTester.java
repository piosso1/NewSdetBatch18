package class19;

/*
Create a class Student that will have 3 subclasses as SyntaxStudent,CollageStudent,
SchoolStudent,Define 3 common behaviour within parent class and override some of the
method in child classes
Define some methods specific to child classes
Write example os achieving run time polymorphism
 */


public class StudentTester {
    public static void main(String[] args) {
        Student[] str = {new Student(), new SynthaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(Student student : str){
            student.read();
            student.learn();
            student.game();
            if (student instanceof SynthaxStudent){
                SynthaxStudent s = (SynthaxStudent)student;
                s.lecture();
            }
        }
    }
}
