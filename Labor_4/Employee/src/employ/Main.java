package employ;

public class Main {

    public static void main(String[] args) {
	Employee employee=new Employee();
	employee.setSalary(2345);
	employee.setName("Pista");
        System.out.println(employee);
        employee.increaseSalary(3);
        System.out.println(employee);
        System.out.println(employee.isInSalaryRange(4,6));
        System.out.println(employee.getTax());
        Employee[] employees=new Employee[4];
        for(int i=0;i<employees.length;i++){
            employees[i]=new Employee();
            employees[i].setSalary((i+1)*100);
            employees[i].setName("Worker "+(i+1));
        }
        for(int i=0;i<employees.length;i++){
            System.out.println(" "+employees[i]);
        }
        System.out.println(" "+employees[employee.MaxSalary(employees)].getName());
        System.out.println(" "+employee.AvgSalary(employees));
    }
}
