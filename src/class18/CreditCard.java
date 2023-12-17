package class18;

/*
Create a class creditcard create an instance method that will calculate
interest based on the given balance. Create 2 subclass: visa and AX. in AX class
override method calculate interest. Call the method by creating object of each of the three classes.
 */

public class CreditCard {

    void calculateInterest(double amount){
        double interest = amount*0.05;
        System.out.println("interest on "+amount+" is "+interest );
    }
}

class visa extends CreditCard{

    @Override
    void calculateInterest(double amount) {
        double interest = amount*0.07;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}

class AX extends CreditCard{
    @Override
    void calculateInterest(double amount) {
        double interest = amount*0.09;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}

class CreditCardTester{
    public static void main(String[] args) {
        AX ax = new AX();
        ax.calculateInterest(100);
        visa v = new visa();
        v.calculateInterest(100);
    }
}
