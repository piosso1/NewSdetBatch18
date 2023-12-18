package class19;

public class Student {

    void read(){
        System.out.println("Read java books");
    }
    void learn(){
        System.out.println("learning java");
    }
    void game(){
        System.out.println("go for games");
    }
}

class SynthaxStudent extends Student{
void lecture(){
        System.out.println("Attend java lectures");
    }
}
class CollegeStudent extends Student{
void game(){
        System.out.println("play football");
    }
}
class SchoolStudent extends Student{
void read(){
        System.out.println("Read java books");
    }
}
