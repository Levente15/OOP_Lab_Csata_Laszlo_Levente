package Bank;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private final ArrayList<Customer> customers;

    public Bank(String name){
        this.name=name;
        this.customers=new ArrayList<>();
    }

    public Customer getCustomer(int custID){
            for(Customer c: customers)
                if(c.getId()==custID)
                    return c;

            return null;
    }

    public int numCustomers(){
        return this.customers.size();
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    private void printCustomer(PrintStream printStream){

        StringBuilder buffer=new StringBuilder();
        for(Customer c: this.customers){
            buffer.append(c.getLastName()).append(", ").
                    append(c.getFirstName()).append(", ").
                    append(c.getAccountNumber()).append(", ").
                    append(c.getId()).append("\n");
        }
    }

    public void printCustomertofile(String filename){
        try {
            this.printCustomer(new PrintStream(filename));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
