package lab3_1;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("JOHN", "BLACK");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1.toString());

        Customer customer2=new Customer("MARY","WHITE");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2.toString());

        customer1.getAccount().deposit(500);
        customer2.getAccount().withdraw(100);
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }
}
