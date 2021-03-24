package lab4_2;

import java.util.ArrayList;


public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;

    public static final int MAX_ACCOUNTS = 10;


    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.accounts=new ArrayList<>();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void addAccount(BankAccount account){
          if(this.accounts.size()<MAX_ACCOUNTS){
              this.accounts.add(account);
          }
    }
    public int getNumAccount(){
        return this.accounts.size();
    }
    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : this.accounts)
            if (account.getAccountNumber().equals(accountNumber))
                return account;

        System.out.println("Account number \"" + accountNumber + "\" does not exist!");
        return null;
    }
    public void closeAccount(String accountNumber){
        for(BankAccount account : this.accounts){
            if(account!=null && account.getAccountNumber().equals(accountNumber)){
                this.accounts.remove(account);
                return;
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(firstName).append(' ').append(lastName).append(" accounts:\n");

        if (this.accounts.size() == 0)
            result.append("\tNone");
        else
            for (BankAccount account : this.accounts)
                if (account != null)
                    result.append("\t").append(account.toString()).append("\n");

        return result.toString();
    }
}
