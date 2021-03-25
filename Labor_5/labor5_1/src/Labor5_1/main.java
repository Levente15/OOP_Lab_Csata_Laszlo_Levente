package Labor5_1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Customer cust1=new Customer("Peter","Nagy");
        System.out.println(cust1);

        ArrayList<BankAccount>accounts=new ArrayList<>();
        for(int i=0;i<150;i++){
            accounts.add(new BankAccount());
        }
        for(BankAccount account: accounts){
            System.out.println(account);
        }
    }
}
