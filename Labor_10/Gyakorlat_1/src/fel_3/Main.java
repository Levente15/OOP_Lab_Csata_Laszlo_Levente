package fel_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputStream = null;
        try {
            File file = new File("students.csv");
            inputStream = new Scanner( file);

            // use the inputStream to read a file

            while (inputStream.hasNextLine()){
                String line=inputStream.nextLine();
               // System.out.println(line);
                try {
                    String[] items = line.trim().split(", ");
                    String neprunKod = items[0];
                    String firstName = items[1];
                    String lastName = items[2];
                    int kreditekszam = Integer.parseInt(items[3]);
                    int ev = Integer.parseInt(items[4]);
                    int honap = Integer.parseInt(items[5]);
                    int nap = Integer.parseInt(items[6]);
                    MyDate date=new MyDate(ev,honap,nap);
                }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                    System.out.println("INCOMPLIT LINE! "+line);
                }catch (NumberFormatException numberFormatException){
                    System.out.println("NUMBER FORMAT EXCEPTION! "+line);
                }catch (DateUtil.InvalidDateException invalidDateException){
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (inputStream !=  null) {
                    inputStream.close();
            }
        }

    }
}
