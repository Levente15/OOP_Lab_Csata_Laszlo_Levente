package termek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Raktar {
        private HashMap<Termek,Integer>raktar;
        private ArrayList<Termek>termekek;

        public Raktar(){
            this.termekek=new ArrayList<>();
            this.raktar=new HashMap<>();
        }
        public void beolvastermekek(String fajlnev){
            Scanner scanner=null;
            try {
                scanner=new Scanner(new File(fajlnev));
            }catch (FileNotFoundException e){
                e.printStackTrace();
                return;
            }
            String sor;
            while (scanner.hasNextLine()){
                sor=scanner.nextLine();

                String[] adatok=sor.split(" ");
                int azonosito=Integer.parseInt(adatok[0].trim());
                String elnevezes=adatok[1];
                double beszerzesiar=Double.parseDouble(adatok[2].trim());
                double arres=Double.parseDouble(adatok[3].trim());

                Termek t1=new Termek(azonosito,elnevezes,beszerzesiar);
                t1.setArres(arres);
                this.termekek.add(t1);
            }
        }
}
