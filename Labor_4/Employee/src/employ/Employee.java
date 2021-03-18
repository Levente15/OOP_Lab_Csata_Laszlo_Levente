package employ;

public class Employee {
   private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double money){
        salary+=money;
    }
    public boolean isInSalaryRange(int a, int b){
        if(this.salary<a && this.salary>b)
            return true;
            else
                return false;
    }
    public double getTax(){
        return Math.round(this.salary*0.16);
    }
    public boolean HigherSalary(Employee employee){
        if(this.salary>employee.salary)
            return true;
        else
            return false;
    }
    public int MaxSalary(Employee[] employees){
       int maximum=0;
       for(int i=0;i<employees.length;i++){
           if(employees[i].HigherSalary(employees[maximum])) {
               maximum = i;
           }
       }
        return maximum;
    }
    public double AvgSalary(Employee[] employees){
        double avg=0;
        for(Employee employee : employees){
            avg+=employee.getSalary();
        }
        avg/=employees.length;
        return Math.round(avg);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
