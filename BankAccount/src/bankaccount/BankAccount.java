package bankaccount;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber)
    {
        this.balance=0;
        this.accountNumber=accountNumber;
    }
    //Getters
    public double getBalance()
    {
         return this.balance;
    }
    public String getAccountNumber()
    {
        return this.accountNumber;
    }
    public void deposit(double amount)
    {
        if(amount<0)
        {
            return;
        }
        this.balance+=amount;
    }
    public boolean withdraw(double amount)
    {
        if(this.balance-amount<0) {
            System.out.println("Error");
            return false;
        }
        this.balance-=amount;
        return true;
    }
    @Override
    public String toString(){
        return this.accountNumber+" : "+" euro "+this.balance;
    }


}
