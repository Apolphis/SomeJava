package InheritanceExercise;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;

public class Bank {

    private static HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
    static Scanner reusableInput = new Scanner(System.in);
   
    public static void main(String[] args) {
        int choice;
        
            try  {

                do {

                    System.out.println("Welcome to the bank! \n Please enter an option you would like to choose \n 0.Exit \n 1. View Accounts"
                    + " \n 2. Open an Account \n 3. Search for a specified Account \n 4. Deposit to a specified Account \n 5. Withdraw from a specified Account"
                    + " \n Enter your option here: ");
                    
                    choice = reusableInput.nextInt();

                    switch(choice){

                        case 1:
                        checkForAccounts();
                        break; 

                        case 2:
                        createAccount(accounts);
                        break;


                       

 
                    }

                } while (choice != 0);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

   static void createAccount(HashMap<Integer, Account> accounts){

        try {

            System.out.println("Please state which type of Account you wish to create!"
            + " \n The current options at this bank are Current Account or Savings Account" 
            + "**NOTE** you must enter your choice exactly as it appears on screen! ");

            String scannerInput = reusableInput.nextLine();

            if (scannerInput.equals("Savings Account")){
                SavingsAccount newSavingsAccount = new SavingsAccount();
                buildAccounts(newSavingsAccount);

            }else if (scannerInput.equals("Current Account")){
                CurrentAccount newCurrentAccount = new CurrentAccount();
                buildAccounts(newCurrentAccount);
               
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

    static void buildAccounts(Account account){
        System.out.println("Please enter a new account number: ");
        int accnum = reusableInput.nextInt();
        System.out.println("Please enter your intial balance you would like to deposit into your account: ");
        double bal = reusableInput.nextDouble();
        accounts.put(accnum, account);
        System.out.println(accounts.toString());
        
    }   
}
