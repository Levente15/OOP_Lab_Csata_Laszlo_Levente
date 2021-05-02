public class Employee implements Comparable<Employee>{
    private int ID;
    private String firtsName;
    private String lastName;
    private double salary;
    private MyDate birthday;
    private static int counter;


    public Employee(String firtsName, String lastName, double salary, MyDate birthDate){
        this.firtsName=firtsName;
        this.lastName=lastName;
        this.salary=salary;
        this.birthday=birthDate;
        counter++;
        this.ID+=counter;

    }

    public int getID(){
        return this.ID;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){

        StringBuilder buffer=new StringBuilder();

        buffer.append("ID: ").append(this.ID).append("\n");
        if(this instanceof Manager){
            buffer.append("MANAGER\n");
        }else{
            buffer.append("EMPLOYEE\n");
        }
                buffer.append("Firstname ").append(firtsName).append("\t\n")
                .append("Lastname ").append(lastName).append("\t\n")
                .append("Salary ").append(salary).append("\t\n")
                .append("Birthday ").append(birthday).append("\t\n");

        return buffer.toString();

    }

    @Override
    public int compareTo(Employee o) {
      return 0;
    }
}
