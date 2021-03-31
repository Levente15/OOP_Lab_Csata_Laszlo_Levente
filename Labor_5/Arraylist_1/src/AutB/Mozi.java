package AutB;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mozi {
    private String neve;
    private String helyszin;
    public ArrayList<Film> films;
    private boolean nyitva;

    public Mozi(String neve, String helyszin) {
        this.neve = neve;
        this.helyszin = helyszin;
        this.nyitva = true;
        this.films = new ArrayList<>();
    }

    public String getNeve() {
        return neve;
    }

    public String getHelyszin() {
        return helyszin;
    }

    public boolean isNyitva() {
        return nyitva;
    }

    public void setNyitva() {
        this.nyitva = !this.nyitva;
    }

    public void hozzaad(Film film) {
        films.add(film);
    }

    public void kiirid(String id) {
        for (Film f : films)
            if (f.getId().equals(id)) ;
        System.out.println(films);
    }

    public void refromcsvfile(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(",");
            this.films.add(new Film(line[0], Kategoria.valueOf(line[1]), Double.parseDouble(line[2]), Boolean.parseBoolean(line[3])));
        }
    }

    public int tortenelmifilmekszam() {
        int szamlalo = 0;
        for (Film f : films)
            if (f.getKategoria() == Kategoria.TORTENELMI)
                szamlalo++;
        return szamlalo;
    }

    public void kiirkategoria(Kategoria kategoria) {
        FileWriter file = null;
        try {
            file = new FileWriter("kiir.txt");
            for (Film f : films)
                if (f.getKategoria() ==kategoria)
                    file.write(f.toString());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
    public boolean megtekintes(double ido){
        if(!nyitva)
            return false;
        double ossz=0;
        for (Film f : films)
            ossz+=f.getHossz();
        return ossz<=ido;
    }
    public int szinesz(){
        int szamlalo=0;
        for (Film f : films)
            if(f.getSzereplokszam()<10)
                szamlalo++;

        return szamlalo;
    }
    public String toString(){
        StringBuilder buffer=new StringBuilder();
        buffer.append(this.neve).append(" ").append(this.helyszin)
                .append(" ").append(this.nyitva).append("\n");
        for (Film f : films)
            buffer.append(f.getFilmcim()).append("\n");
        return buffer.toString();
    }
}
