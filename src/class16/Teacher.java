package class16;

/*
Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
 */

public class Teacher {

    String name;
    String subject;
    int hoursOfTeaching;

    void teach(){
        System.out.println("teaching......");
    }
    void joke(){
        System.out.println("hahha");
    }
}
class MathTeacher extends Teacher{

    void teachMath(){
        System.out.println("Teaching Math");
    }
}

class ChemistryTeacher extends Teacher{

    void teachChem(){
        System.out.println("HCL is Salt");
    }

}
class PianoTeacher extends Teacher {

    void teachPiano(){
        System.out.println("Teaching Piano");
    }
}
