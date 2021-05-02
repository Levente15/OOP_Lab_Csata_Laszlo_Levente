public class Main {
    public static void main(String[] args) {

        Company comp1=new Company("SRL");
        comp1.hireall("be.csv");

        comp1.printall(System.out);
        System.out.println("-----------------");
        comp1.printManagars(System.out);
    }
}
