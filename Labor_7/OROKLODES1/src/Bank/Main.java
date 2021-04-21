package Bank;

public class Main {
    public static void main(String[] args) {

        Customer c1=new Customer("Peter","Nagy");
        Customer c2=new Customer("Beni","Nagy2");

        c1.addAccount(new BankAccount());
        System.out.println(c1);

        c1.addAccount(new CheckingAccount(2345));
        System.out.println(c1);
        c1.addAccount(new SavingAccount(4555.4));
        System.out.println(c1);
       // c1.getAccountNumber("OTP0000002").deposit(100);
        System.out.println(c1);

    }
}
