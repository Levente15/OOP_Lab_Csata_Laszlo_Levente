package labor3_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
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
        for (int i = 0; i < 5; i++){

            if (customer1.getAccounts("OTP0001" + i) == null){
                System.out.println("NO.");
            }
            else{
                customer1.getAccounts("OTP0001" + i).withdraw(random.nextDouble()*customer1.getAccounts("OTP0001" + i).getBalance());
            }
        }
        for (int j = 0; j < 9; j++){
            if (customer2.getAccounts("OTP0010" + j) == null){
                System.out.println("NO.");
            }
            else{
                customer2.getAccounts("OTP0010" + j).withdraw(random.nextDouble()*customer2.getAccounts("OTP0010" + j).getBalance());
            }

        }
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

        customer1.closeAccounts("OTP0000010");
        customer2.closeAccounts("OTP000105");

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
