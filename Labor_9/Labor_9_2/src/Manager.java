public class Manager extends Employee {

    private String department;

    public Manager(String firstName,String lastName,double salary, MyDate birthday,String department){
        super(firstName,lastName,salary,birthday);
        this.department=department;
    }

     public String getDepartment(){
        return this.department;
     }

     public void setDeopartment(String department){

        this.department=department;

     }

}
