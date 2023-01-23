package InheritanceExercise;

public class CurrentAccount extends Account{
     double bal;
     int accnum;
     String accountType = "Current Account";
     double overdraft = 2000;
    
    public CurrentAccount(int a, double bal, int accnum, String accountType, double overdraft){
        this.bal = bal;
        this.accnum = accnum;
        this.accountType = accountType;
        this.overdraft = overdraft;
        
    }

    public CurrentAccount(){

    }

@Override
public String toString(){

    return  this.accnum + " | " + this.bal + " | " + this.accountType + " | " + this.overdraft;

}
}






