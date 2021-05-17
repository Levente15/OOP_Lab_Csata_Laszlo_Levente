package Tavkozles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Orszag {
    private String neve;
    private String elnok;
    private String fovaros;

    private ArrayList<Varos> varosok;

    public Orszag(String neve, String elnok) {
        this.neve = neve;
        this.elnok = elnok;
        this.varosok = new ArrayList<>();
    }

    public String getNeve() {
        return neve;
    }

    public String getElnok() {
        return elnok;
    }

    public String getFovaros() {
        return fovaros;
    }

    public void ujvaros(Varos varos) {
        varosok.add(varos);
    }

    public void readfromfile(String filename) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            assert scanner != null;
            if (!scanner.hasNextLine()) break;
            String[] line = scanner.nextLine().trim().split(", ");
            Varos varos = new Varos(
                    line[0], Integer.parseInt(line[1]),
                    Double.parseDouble(line[2]), line[3]);
            this.varosok.add(varos);
        }
    }
    public void kiir(){
        for(Varos v : varosok)
            System.out.println(v);
    }

   @Override
    public String toString(){
       StringBuffer buffer = new StringBuffer();

       buffer.append(this.neve).append("\n")
               .append("\tAz orszag elnoke ").append(this.elnok).append("\n")
               .append("\tFovaros ").append(this.fovaros).append("\n")
               .append("\tTovabbi varosok ").append("\n");
       for (Varos v: varosok)
           buffer.append("\t\t").append(v.getNev()).append("\n");

       return buffer.toString();
   }

}
