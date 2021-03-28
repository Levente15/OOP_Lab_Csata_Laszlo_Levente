package TERMEK;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Termek termek1=new Termek(23,"alma",5);
        System.out.println(termek1);
        System.out.println(termek1.setArres(10));
        ArrayList<Termek> termeks=readfromfile("be.txt");
        for(Termek t : termeks){
            System.out.println(t);
        }
    }
    public static ArrayList<Termek> readfromfile(String filename){
        Scanner scanner=null;
        try {
            scanner=new Scanner(new File(filename));
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        ArrayList<Termek> termeks=new ArrayList<>();
        while (scanner.hasNextLine()){
            String[] item=scanner.nextLine().trim().split(" ");
            Termek ter=new Termek();
            ter.setAzonosito(Integer.parseInt(item[0]));
            ter.setElnevezes(item[1]);
            ter.setBeszerzesiar(Double.parseDouble(item[2]));
            termeks.add(ter);
        }
        return termeks;
    }
}
