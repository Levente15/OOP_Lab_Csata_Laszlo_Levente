package DIAK;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Felveteli_Informatika diak1 = new Felveteli_Informatika();

        Felveteli_Diak diakok1 = new Felveteli_Diak();
        diakok1.setVnev("Mezei");
        diakok1.setKnev("Maria");
        diakok1.setErettsegi(7.56);
        diakok1.setMatemaktika(8.78);
        System.out.println(diakok1);

        Felveteli_Diak diakok2 = new Felveteli_Diak();
        diakok2.setVnev("Asztalos");
        diakok2.setKnev("Imre");
        diakok2.setErettsegi(8.45);
        diakok2.setMatemaktika(7.25);
        System.out.println(diakok2);
        System.out.println("*****************************");
        double ossz1= diakok1.atlag();
        double ossz2= diakok2.atlag();
       ArrayList<Felveteli_Diak> diaks=readFromFile("be.txt");
       int szamlalo=2;
       double ossz=0;
       ossz+=ossz1;
       ossz+=ossz2;
       for(Felveteli_Diak d : diaks){
          diak1.ujBeiratkozo(d);
          szamlalo++;
          ossz+=d.atlag();
       }
        System.out.println(ossz);
       double atlag=ossz/szamlalo;

       diak1.listasOsszes();
        System.out.println("***************************");
        System.out.println("A felvetelisok szama:"+szamlalo+" atlag: "+ atlag);
    }



    public static ArrayList<Felveteli_Diak> readFromFile(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        ArrayList<Felveteli_Diak> diaks = new ArrayList<>();
        while (scanner.hasNextLine()) {

            String[] item = scanner.nextLine().trim().split(" ");
            Felveteli_Diak diak = new Felveteli_Diak();
            diak.setVnev(item[0]);
            diak.setVnev(item[1]);
            diak.setErettsegi(Double.parseDouble(item[2]));
            diak.setMatemaktika(Double.parseDouble(item[3]));
            diaks.add(diak);
        }
        return diaks;
    }
}