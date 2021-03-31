package AutB;

import java.lang.ref.PhantomReference;
import java.util.Random;
public class Film {
    public static int filmszam=0;
    private String id;
    private String filmcim;
    private int szereplokszam;
    private double hossz;
    private boolean valose;
    private Kategoria kategoria;

    public Film(String filmcim, Kategoria kategoria,double filmhossz, boolean valose) {
        Film.filmszam++;
        this.filmcim = filmcim;
        this.kategoria=kategoria;
        this.hossz = filmhossz;
        this.valose = valose;

        this.id=this.filmcim.substring(0,1)+"_"+kategoria.toString().substring(0,1)+"_"+Film.filmszam;
        this.szereplokszam=(new Random()).nextInt(31)+1;
    }

    public static int getFilmszam() {
        return filmszam;
    }

    public String getId() {
        return id;
    }

    public String getFilmcim() {
        return filmcim;
    }

    public int getSzereplokszam() {
        return szereplokszam;
    }

    public double getHossz() {
        return hossz;
    }

    public boolean isValose() {
        return valose;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }
    public String toString(){
        return "Az id: "+this.id+" "+this.filmcim+" "+this.kategoria+" szereploszam: "+
                this.szereplokszam+" , hossza: "+this.hossz+" valos-e: "+(this.valose ? "Igen":"Nem");
    }
}
