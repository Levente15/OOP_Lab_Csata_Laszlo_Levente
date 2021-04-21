package Bank;

public class SavingAccount extends BankAccount{

    public  double interestRate;

    public SavingAccount(double interestRate){

        super();
        this.interestRate=interestRate;

    }
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    public void addInterest(){
        this.balance+=this.balance+this.interestRate;
    }

    @Override
    public String toString(){
        return this.accountNumber+" "+"Balance: "+this.balance+
                "Interest: "+this.interestRate;
    }
}

