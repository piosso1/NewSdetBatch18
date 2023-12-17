package class18;

/*
Create a class Degree having a method getPrerequisite that print
"To get a degree you need high school diploma"
Class Degree has 2 subclasses namely Bachelors and Masters. In Masters
class override method getPrerequisite. Call the method by creating an
object of each of the three classes
 */

public class Degree {

    public void getPrerequisite() {

        System.out.println("To get a degree you need high school diploma");
    }
}
    class Masters extends Degree{
        public void getPrerequisite() {
            System.out.println("To get a Masters degree we need to have Bachelors Degree ");
        }
    }

    class Bachelor extends Degree{
    }

    class DegreeTester{
        public static void main(String[] args) {
            Masters m = new Masters();
            m.getPrerequisite();
            Bachelor b = new Bachelor();
            b.getPrerequisite();
        }
    }
