package HMWK2;

/*
Banking System Task: Design a BankAccount class with subclasses SavingsAccount,
CheckingAccount, and FixedDepositAccount. Common attributes might include accountNumber,
balance, and accountHolderName. Override methods like withdraw and
deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
Create objects of each type, store them in a list, and perform
operations like depositing and withdrawing funds.
 */

public class BankAccount {

    private long accountNumber;
        private double balance;
    private String accountHolderName;

    public BankAccount(long accountNumber, double balance, String accountHolderName ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account Name: "+accountHolderName+" , Account Number: "+accountNumber+" , Balance: "+balance);
    }
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposite " + amount);
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

}
class SavingsAccount extends BankAccount {
    private double interestRate;
    private boolean ApplyInterest = true;

    public SavingsAccount(long accountNumber, double balance, String accountHolderName, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Apply Interest: " +interestRate);
    }
    public void ApplyInterest() {
        if (ApplyInterest) {
            setBalance(getBalance() + (getBalance() * interestRate));
            ApplyInterest = true;
        }
    }
}
    class CheckingAccount extends BankAccount {


        public CheckingAccount(long accountNumber, double balance, String accountHolderName) {
            super(accountNumber, balance, accountHolderName);
        }
    }
class FixedDepositAccount extends BankAccount{

    private double fixedInterestRate;
    private boolean applyFixedInterest = false;

    public FixedDepositAccount (long accountNumber, double balance, String accountHolderName, double fixedInterestRate){
        super(accountNumber, balance, accountHolderName);
        this.fixedInterestRate = fixedInterestRate;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Fixed Interest Rate: "+fixedInterestRate);
    }
    public void applyFixedInterest() {
        if (!applyFixedInterest) {
            setBalance(getBalance() + (getBalance() * fixedInterestRate));
            applyFixedInterest = true;
        }
    }
}
class BankAccountTester {
    public static void main(String[] args) {


        SavingsAccount sa = new SavingsAccount(1987654321, 10000, "Patrick Udo", 0.1);
        CheckingAccount ca = new CheckingAccount(1987654322, 3000, "Patrick Udo");
        FixedDepositAccount fa = new FixedDepositAccount(1987654323, 12000, "Patrick Udo", 0.3);
        BankAccount ba = new BankAccount(1987654324, 5000, "Patrick Udo");

        BankAccount[] arr = {sa, ca, fa, ba};

        for (BankAccount account : arr) {
            account.displayAccountInfo();
            account.deposit(20000);
            account.withdraw(1000);

                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).ApplyInterest();
                } else if (account instanceof FixedDepositAccount) {
                    ((FixedDepositAccount) account).applyFixedInterest();
                }
            account.displayAccountInfo();
            System.out.println("------------------------------");
            }

        }
    }