package Labor5_1;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;

    private final int id;
    private static  int numCustomer=0;

    public Customer(String lastName, String firstName){
        this.firstName=firstName;
        this.lastName=lastName;
        accounts = new ArrayList<>();
        numCustomer++;
        this.id=numCustomer;
    }
   //  public Customer(){
   //     numCustomer++;
   //      this.id=numCustomer;
   // }
    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public BankAccount getAccount(String accountNumber){
        for(int i=0;i<accounts.size();i++){
            if(accountNumber.equals(accounts.get(i).getAccountNumber())){
                return accounts.get(i);
            }
        }
        return null;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return  this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
    public  void  closeAccount(String accountNumber){

        for(BankAccount a:this.accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                this.accounts.remove(a);
                break;
            }
        }
    }
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(lastName + ' ' + firstName+  "accounts:\n");
        for(BankAccount a:accounts){
            result.append( "\t" + a.toString() +"\n");
        }
        return result.toString();
    }
}
