package AutA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Film {
    private String neve;
    private String rendezo;
    private int kiadasiev;
    private ArrayList<Szinesz> szineszeink;

    public Film(String neve, String rendezo, int kiadasiev) {
        this.neve = neve;
        this.rendezo = rendezo;
        this.kiadasiev = kiadasiev;
        this.szineszeink = new ArrayList<>();
    }

    public String getNeve() {
        return neve;
    }

    public String getRendezo() {
        return rendezo;
    }

    public int getKiadasiev() {
        return kiadasiev;
    }

    public ArrayList<Szinesz> getSzineszeink() {
        return szineszeink;
    }

    public void ujszinesz(Szinesz szinesz) {
        this.szineszeink.add(szinesz);
    }

    public void torles(String id) {
        for (Szinesz sz : szineszeink) {
            if (id.equals(sz.getId())) {
                szineszeink.remove(sz);
            }
        }
    }

    public void kiiras() {
        for (Szinesz sz : this.szineszeink) {
            System.out.println(sz);
        }
    }

    public void readfromfile(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(", ");
            Szinesz szinesz = new Szinesz(line[0], line[1], Nem.valueOf(line[2]), Integer.parseInt(line[3]));

            for (int i = 0; i < Integer.parseInt(line[4]); i++) {
                szinesz.setDijakszam();
            }
            this.szineszeink.add(szinesz);
        }
    }
    public int nokszam(){
        int szamlalo=0;
        for(Szinesz sz :szineszeink) {
            if (sz.getNem() == Nem.FEMALE)
                szamlalo++;
        }
        return szamlalo;
    }
    public String aktualisev(){
        StringBuilder buffer=new StringBuilder();
        buffer.append(this.neve).append(" ");
        if(Calendar.getInstance().get(Calendar.YEAR)>this.kiadasiev)
            buffer.append("Megjelent: ").append(this.kiadasiev);
        else
            buffer.append("Meg nincs megjelenve: ").append(this.kiadasiev);
        return buffer.toString();
    }
    public Szinesz legidosebb(){
        Szinesz idosebb=this.szineszeink.get(0);
        for(Szinesz sz: szineszeink){
            if(sz.getSzuletesiev()<idosebb.getSzuletesiev()){
                idosebb=sz;
            }
        }
        return idosebb;
    }
    public int szineszekszama(){
        int szamlalo=0;
        for(Szinesz sz: szineszeink){
            if(sz.getDijakszam()==0){
                szamlalo++;
            }
        }
        return szamlalo;
    }
    @Override
    public String toString(){
        StringBuilder buffer=new StringBuilder();
        buffer.append(this.neve).append(" ").append(this.rendezo).append(" ")
                .append(this.kiadasiev).append(" \n");
        for(Szinesz sz: szineszeink) {
        buffer.append(sz.getVnev()).append(" ").append(sz.getKnev()).append("\n");
        }
        return buffer.toString();
    }
}
