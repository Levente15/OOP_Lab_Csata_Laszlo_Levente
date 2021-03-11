package labor3_2;

public class Customer {

    public static int MAX_ACCOUNT = 10;

    private final String firstName;
    private String lastName;
    private int numAccounts;
    private final BankAccount[] accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new BankAccount[MAX_ACCOUNT];
        this.numAccounts = 0;
    }

    public void addAccount(BankAccount account) {
        if (this.numAccounts < MAX_ACCOUNT) {
            this.accounts[numAccounts] = account;
            this.numAccounts++;
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getters
    public int getNumAccounts() {
        return this.numAccounts;
    }

    public BankAccount getAccounts(String accountNumber) {
        for (int i=0;i<numAccounts;i++) {
            if (this.accounts[i]!=null && this.accounts[i].getAccountNumber().equals(accountNumber)) {
                return this.accounts[i];
            }
        }

        return null;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void closeAccounts(String accountNumber) {
        for (int i = 0; i < this.numAccounts; i++) {
            if (this.accounts[i].getAccountNumber().equals(accountNumber)) {
                this.accounts[i] = null;
                this.numAccounts--;

                for(int j=i;j<numAccounts-1;j++){
                    accounts[j]=accounts[j+1];                }
            }
            this.accounts[this.numAccounts-1]=null;
            return;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            if(this.accounts[i]!=null)
            result.append("\t" + accounts[i].toString() + "\n");
        }
        return result.toString();
    }
}



