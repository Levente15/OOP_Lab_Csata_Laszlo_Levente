package car;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
     Car Auto1=new Car("Skoda","Octavia",260000,
             5,2006,240,FuelType.PETROL,Color.BLACK);
        System.out.println(Auto1.getCarBrand());
        Auto1.setCarBrand("BMW");
        System.out.println(Auto1);
    }
}
