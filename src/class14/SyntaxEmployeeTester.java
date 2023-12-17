package class14;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        SyntaxEmployee dign = new SyntaxEmployee();
        dign.empID =0226;
        dign.salary=10000;
        SyntaxEmployee dign2 = new SyntaxEmployee();
        dign2.empID=0334;
        dign2.salary=15000;
        System.out.println(dign.salary);
        System.out.println(dign.empID);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(dign2.salary);
        System.out.println(dign2.empID);
        System.out.println(SyntaxEmployee.CEO);

    }
}
