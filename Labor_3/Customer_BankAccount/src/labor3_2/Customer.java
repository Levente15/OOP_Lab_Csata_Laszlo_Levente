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
        for (BankAccount account : this.accounts)
            if (account.getAccountNumber().equals(accountNumber))
                return account;

        System.out.println("Account number does not exist:" + accountNumber);
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
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i].toString() + "\n");
        }
        return result.toString();
    }
}



