package parcialis1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Olimpiaijatekok {
    private String helyszin;
    private int evszama;
    public ArrayList<Sportolo> sportolos;

    public Olimpiaijatekok(String helyszin, int evszama) {
        this.helyszin = helyszin;
        this.evszama = evszama;
        this.sportolos=new ArrayList<>();
    }

    public String getHelyszin() {
        return helyszin;
    }

    public int getEvszama() {
        return evszama;
    }

    public ArrayList<Sportolo> getSportolos() {
        return sportolos;
    }
    public int getResztvevoszam(){
       return  this.sportolos.size();
    }
    public void jelentkezes(Sportolo sportolo){
        if(sportolo.getLegutolsojateknap()<this.evszama)
            sportolo.setLegutolsojateknap(this.evszama);
        this.sportolos.add(sportolo);
    }
    public void kiirid(String id){
        for(Sportolo s: sportolos){
            if(id.equals(s.getId()))
                System.out.println(s);
        }
    }
    public void readfromcscfile(String filename){
        Scanner scanner=null;
        try {
            scanner=new Scanner(new File(filename));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        while (scanner.hasNextLine()){
            String[] line=scanner.nextLine().trim().split(", ");
            this.sportolos.add(new Sportolo(line[0],line[1],Kategoria.valueOf(line[2])
                    ,Boolean.parseBoolean(line[3]),
                    Double.parseDouble(line[4]),Integer.parseInt(line[5]),Integer.parseInt(line[6])));
        }
    }
    public int adottsportag(Kategoria kategoria){
        int szamlalo=0;
        for(Sportolo s : sportolos)
            if(s.getKategorial().equals(kategoria))
                szamlalo++;

        return szamlalo;
    }
    public void novagyferfi(){
        int szamlalono=0;
        int szamlaloferfi=0;
        for(Sportolo s : sportolos)
            if(s.getNem())
                szamlaloferfi++;
            else
                szamlalono++;

        if(szamlaloferfi>szamlalono)
        System.out.println("Ferfi Uralom");
        else if(szamlaloferfi==szamlalono)
            System.out.println("Egyforman vannak");
        else
            System.out.println("Noi Uralom");
    }
    public Sportolo legtobberem(){
        Sportolo max;
        max=sportolos.get(0);
        for(Sportolo s : sportolos)
            if(s.getErmekszama()<max.getErmekszama())
                max=s;

        return max;
    }
    public String toString(){
        StringBuilder buffer=new StringBuilder();
        buffer.append(this.helyszin).append(" ").append(this.evszama).append("\n");
        for(Sportolo s : sportolos){
            buffer.append(s).append("\n");
        }
        return buffer.toString();
    }
}
