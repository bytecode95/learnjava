
//using abstract class
public class AbstractionOOP {
    public static void main(String[] args){

    }
    
}

abstract class BankAccount{
    String type;
    private int accountNumber;
    private double accountBalance;
    
    //Constructor
    public BankAccount(String type, int accountNumber, int accountBalance){
        this.type =  type;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public BankAccount(int accountNumber2, double accountBalance2) {
    }

    // Abstract method for withdrawing money
    public abstract void widthdraw(double amount);

    // Abstract method for depositing money
    public abstract void deposite(double amount);

    //concreate method
    public void applyLoan(){
        //logic here
        System.out.println("Your loan is approved");
    }
    

    //getter methods
    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

}

class SavingAccount extends BankAccount{
    // Constructor
    public SavingAccount(int accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    @Override
    public void widthdraw(double amount){
        // Implement withdrawal logic for savings account
        if (getAccountBalance() - amount >= 0) {
            setBalance(getAccountBalance() - amount);
            System.out.println("Withdrawal successful. Remaining balance: $" + getAccountBalance());
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    private void setBalance(double d) {
    }

    @Override
    public void deposite(double amount) {
        //logic of deposite
        System.out.println("This is logic of deposite methdo");
    }
}