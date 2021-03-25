package Labor5_1;

import javax.print.DocFlavor;

public class BankAccount {
    public static final String PREFIX="OTP";
    public static final int ACCOUNT_NUMBER_LENGTH=10;
    private static int numAccounts = 0;
    private final String accountNumber;
    private double balance;

    public BankAccount() {
         numAccounts++;
        this.accountNumber = createAccountNumber();
    }
    private String createAccountNumber(){
      int prefixlength=PREFIX.length();
      int prefixnumberaccount=String.valueOf(numAccounts).length();
      int szam=ACCOUNT_NUMBER_LENGTH-prefixlength-prefixnumberaccount;
      String result=PREFIX;
      for(int i=0;i<szam;i++){
          result+="0";
      }
      result+=numAccounts;
      return result;
   }
   public double getBalance(){
        return this.balance;
   }
   public String getAccountNumber(){
        return this.accountNumber;
   }
   public void deposit(double amount){
        if(amount<0)
            return;
        this.balance+=amount;
   }
    boolean withdraw(double amount) {
        if(this.balance - amount < 0) {
            System.out.println("Error!");
            return false;
        }
        this.balance -= amount;
        return true;
    }

    @Override
    public String toString(){
        return this.accountNumber+" EURO: "+this.balance;
    }
}
