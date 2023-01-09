package InheritanceExercise;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;

public class Bank {

    public static HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
    

    public static void main(String[] args) {

        Bank newBankObj = new Bank();
        int choice;
        
            try (Scanner sc = new Scanner(System.in)) {

                do {

                    System.out.println("Welcome to the bank! \n Please enter an option you would like to choose \n 0.Exit \n 1. View Accounts"
                    + " \n 2. Open an Account \n 3. Search for a specified Account \n 4. Deposit to a specified Account \n 5. Withdraw from a specified Account"
                    + " \n Enter your option here: ");
                    
                    choice =sc.nextInt();

                    switch(choice){

                        case 1:
                        checkForAccounts();
                        break; 

                        case 2:
                        createAccount(newBankObj.accounts);
                        break;


                       

 
                    }

                } while (choice != 0);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

   static void createAccount(HashMap<Integer, Account> accounts){

    int accnum;
    double bal;

        try (Scanner accountMaker = new Scanner(System.in)) {

            System.out.println("Please state which type of Account you wish to create!"
            + " \n The current options at this bank are Current Account or Savings Account" 
            + "**NOTE** you must enter your choice exactly as it appears on screen! ");

            String scannerInput = accountMaker.nextLine();

            if (scannerInput.equals("Savings Account")){
                SavingsAccount newSavingsAccount = new SavingsAccount();
                System.out.println("Please enter a new account number: ");
                accnum = accountMaker.nextInt();
                System.out.println("Please enter your intial balance you would like to deposit into your account: ");
                bal = accountMaker.nextDouble();
               accounts.put(accnum, newSavingsAccount);
               System.out.println(accounts.toString());

            }else if (scannerInput.equals("Current Account")){
                CurrentAccount newCurrentAccount = new CurrentAccount();
                System.out.println("Please enter your account number:");
                accnum = accountMaker.nextInt();
                System.out.println("please enter your intial balance you would like to deposit into your account");
                bal = accountMaker.nextDouble();
                accounts.put(accnum, newCurrentAccount);
                System.out.println(accounts.toString());
            }else{
                System.err.println("Sorry it appears your input was incorrect please try again");
            }
                            
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
    }

    static void checkForAccounts(){

        if (accounts.isEmpty()){
            System.err.println("Sorry there appears to be no accounts listed");
        }else{
            Set<Entry<Integer, Account>> entries = accounts.entrySet();

            for (Entry<Integer, Account> entry : entries){

                System.out.println(entry.getKey() + " " + entry.getValue());

            }
        }

    }
    
}
