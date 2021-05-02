import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees=new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void hire(Employee employee) {
        this.employees.add(employee);
    }

    public void hireall(String filename){
        Scanner scanner=null;
        try{
            scanner=new Scanner(new File(filename));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        if(scanner==null){
            System.out.println("Errorunk van");
            return;
        }


        ArrayList<Employee> employees=new ArrayList<>();

        while(scanner.hasNextLine()){
            String line=scanner.nextLine();

            String[] field=line.trim().split(", ");

            Employee employee=null;
            boolean manager=false;

            try{
                if(field[6]!=null)
                    manager=true;

            }catch (IndexOutOfBoundsException e){

            }

            if(manager){
                employee=new Manager(field[0],field[1],Double.parseDouble(field[2]),
                        new MyDate(Integer.parseInt(field[3]),Integer.parseInt(field[4]),Integer.parseInt(field[5]))
                        ,field[6]);
            }else{
                employee=new Employee(field[0],field[1],Double.parseDouble(field[2]),
                        new MyDate(Integer.parseInt(field[3]),Integer.parseInt(field[4]),Integer.parseInt(field[5])));
            }
            hire(employee);
        }

    }

    public void fire(Employee employee){
        this.employees.remove(employee);

    }

    public void printall(PrintStream e){
        for(Employee emp : this.employees) {
            e.println(emp);
        }
    }

    public void printManagars(PrintStream p){

        for(Employee e: employees)
            if(e instanceof Manager)
                p.println(e);
    }
}
