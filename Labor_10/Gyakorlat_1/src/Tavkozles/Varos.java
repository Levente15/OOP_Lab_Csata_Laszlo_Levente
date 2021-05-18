package Tavkozles;

public class Varos {
    private static int azonositoszam=0;
    private  int azonosito;
    private  String nev;
    private int nepesseg;
    private  double terulet;
    private String egynevezetesseg;
    private double nepsuruseg;

    public Varos(String nev, int nepesseg, double terulet, String nevezetesseg) {
        this.nev = nev;
        this.nepesseg = nepesseg;
        this.terulet = terulet;
        this.egynevezetesseg = nevezetesseg;
        this.azonosito = azonositoszam++;
        this.nepsuruseg = this.nepesseg / this.terulet;
    }
    public int getAzonosito() {
        return azonosito;
    }

    public String getNev() {
        return nev;
    }

    public int getNepesseg() {
        return nepesseg;
    }

    public double getTerulet() {
        return terulet;
    }

    public String getEgynevezetesseg() {
        return egynevezetesseg;
    }

    public double getNepsuruseg() {
        return nepsuruseg;
    }


    public void setNepesseg(int nepesseg) {
        this.nepesseg = nepesseg;
    }

    public void setNepsuruseg(double nepsuruseg) {
        this.nepsuruseg = nepsuruseg;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id: ").append(azonosito).append("\n")
                .append("Nev ").append(nev).append("\n")
                .append("Terulet: ").append(terulet).append("\n")
                .append("Nevezetesseg: ").append(egynevezetesseg).append("\n")
                .append("Nepsuruseg: ").append(nepsuruseg).append("\n");
        return str.toString();
    }
}
