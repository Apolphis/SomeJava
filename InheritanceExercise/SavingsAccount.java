package InheritanceExercise;

public class SavingsAccount extends Account {

    double bal;
    int accnum;
    double interest = 1000;
    String accountType = "Savings Account";

    public SavingsAccount(int a, double bal, int accnum, double interest, String accountType){

        this.bal = bal;
        this.accnum = accnum;
        this.interest = interest;
        this.accountType = accountType;

    }
    

    public SavingsAccount(){

    }


    @Override
public String toString(){
    return this.accnum + " | " + this.bal + " | " + this.accountType + " | " + this.interest;
}


}
