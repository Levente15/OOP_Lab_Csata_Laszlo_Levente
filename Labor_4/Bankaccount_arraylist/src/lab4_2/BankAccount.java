package lab4_2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0;
    }

    public double getBalance(){
        return this.balance;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public double deposit(double amount){

        return this.balance+=amount;
    }
    boolean withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Error!");
            return false;
        }
        this.balance-=amount;
        return true;
    }

    @Override
    public String toString() {
        return this.accountNumber + ": euro " + this.balance;
    }
}