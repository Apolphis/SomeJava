package InheritanceExercise;

public class Account implements Comparable<Account>{
    private double bal;
    private int accnum;
    private String accountType;

    public Account(int a, double bal, int accnum, String accountType){

        bal = 0.0;
        accnum = a;

    }

    public Account(){

    }

    public void deposit(double sum){
        if (sum > 0){
            bal += sum;
        }else{
            System.err.println("Account.deposit(...): " + "cannot deposit nagtive amount.");
        }
    }

    public void withdraw(double sum){
        if (sum > 0){
            bal -= sum;
        }else{
            System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
        }
    }

    public double getBalance(){
        return bal;
    }

    public double getAccountNumber(){
        return accnum;
    }

    public String getAccountType(){
        return accountType;
    }

    @Override
    public String toString(){
        return "Account: " + accnum + " | " + "Balance: " + bal + " | " + "Account type: " + accountType;
    }

    @Override
    public int compareTo(Account o){
        if (this.getAccountNumber() < o.getAccountNumber()){
            return -1;
        }else if(getAccountNumber() == o.getAccountNumber()){
            return 0;
        }else{
            return 1;
        }
    }
}