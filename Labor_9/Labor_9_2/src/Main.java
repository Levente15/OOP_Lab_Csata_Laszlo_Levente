import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Company comp1 = new Company("SRL");
        comp1.hireall("be.csv");

        comp1.printall(System.out);
        System.out.println("-----------------");
        comp1.printManagars(System.out);
        System.out.println("------------");
        comp1.defaultSort();
        comp1.printall(System.out);
        System.out.println("------------");

        Comparator<Employee> bysalary=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary()>o2.getSalary()) {
                    return -1;
                }
                if(o1.getSalary()<o2.getSalary()){
                    return 1;
            }
            return -o1.compareTo(o2);
        }
    };
        comp1.sortByComparator(bysalary);

        comp1.printall(System.out);

        comp1.sortByComparator(Employee.byBirthDay);

        comp1.printall(System.out);

        comp1.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.compareTo(o1);
            }
        });

    }
}
