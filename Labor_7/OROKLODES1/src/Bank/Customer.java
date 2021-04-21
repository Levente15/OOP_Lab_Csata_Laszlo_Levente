package Bank;

import java.util.ArrayList;

public class Customer {

    private static int nuCustomer = 0;

    private int id;
    private final String firstName;
    private String lastName;
    private final ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        Customer.nuCustomer++;
        this.id = Customer.nuCustomer + 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();

    }

    //Setter
    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public void setLastName(String name) {
        if (lastName.length() > 0)
            this.lastName = name;
    }
    //Getter

    public int getId() {
        return this.id;
    }

    public int getNumAccount() {
        return this.accounts.size();
    }

    public ArrayList<String> getAccountNumber() {
        ArrayList<String> accountnumbers = new ArrayList<>();

        for (BankAccount account : this.accounts)
            accountnumbers.add(account.getAccountNumber());

        return accountnumbers;
    }

    public BankAccount getAccountNumber(String accountnumber) {
        for (BankAccount account : accounts)
            if (account.equals(accountnumber))
                return account;
        System.out.println("Account number does not exist");
        return null;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void closeAccount(String accountnumber) {
        for (BankAccount b : this.accounts) {
            if (b != null && b.getAccountNumber().equals(accountnumber)) {
                this.accounts.remove(accountnumber);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(firstName).append(" ").append(lastName)
                .append(", account: ");

        if (this.accounts.size() == 0)
            s.append("No-no:((");
        else
            for (BankAccount a : accounts)
                if (a != null)
                    s.append(" ").append(a.toString());

        return s.toString();

    }
}

