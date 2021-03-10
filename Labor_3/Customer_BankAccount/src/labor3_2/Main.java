package labor3_2;

public class Main {
    public static void main(String[] args) {
        Customer customer1=new Customer("John","BLACK");
        Customer customer2=new Customer("Emma","HARTH");

        for(int i=0;i<5;i++){
            customer1.addAccount(new BankAccount("OTP000001"+i));
            customer1.getAccounts("OTP000001"+i).deposit(i*500);

        }
        for(int i=0;i<10;i++){
            customer2.addAccount(new BankAccount("OTP000002"+i));
            customer2.getAccounts("OTP000002"+i).deposit(i*100);

        }
        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccounts("OTP0000010");
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
