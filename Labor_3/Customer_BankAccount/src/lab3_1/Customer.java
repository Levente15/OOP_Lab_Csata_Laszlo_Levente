package lab3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void setAccount(BankAccount account) {
        if(this.account==null)
        this.account = account;
    }

    public void setLastName(String lastName) {
        if(lastName.length()>0)
        this.lastName = lastName;
    }
    //getters
    public BankAccount getAccount(){
        return this.account;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public  String getLastName(){
        return this.lastName;
    }
    public void closeAccount(){
       // if(this.account!=null)
        this.account=null;
    }
    @Override
    public String toString(){
       if (this.account==null){
            return this.firstName+" "+this.lastName+"(not acc)";
        }else{
            return this.firstName+"\n"+this.account.getAccountNumber()+" "+this.account.getBalance();
        }

    }

}
