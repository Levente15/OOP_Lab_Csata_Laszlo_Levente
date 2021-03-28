package TERMEK;

public class Termek {
    private  int azonosito;
    private String elnevezes;
    private double beszerzesiar;
    private double fogyasztoiar;

    public Termek(int azonosito,String elnevezes, double beszerzesiar){
        this.azonosito=azonosito;
        this.elnevezes=elnevezes;
        this.beszerzesiar=beszerzesiar;
        this.fogyasztoiar=beszerzesiar;
    }
    public Termek(){

    }

    public int getAzonosito() {
        return azonosito;
    }

    public String getElnevezes() {
        return elnevezes;
    }

    public double getBeszerzesiar() {
        return beszerzesiar;
    }

    public double getFogyasztoiar() {
        return fogyasztoiar;
    }

    public void setAzonosito(int azonosito) {
        this.azonosito = azonosito;
    }

    public void setElnevezes(String elnevezes) {
        this.elnevezes = elnevezes;
    }

    public void setBeszerzesiar(double beszerzesiar) {
        this.beszerzesiar = beszerzesiar;
    }

    public void setFogyasztoiar(double fogyasztoiar) {
        this.fogyasztoiar = fogyasztoiar;
    }

    public double setArres(int szazalek){
        return beszerzesiar+(szazalek*beszerzesiar)/100;
    }

    @Override
    public String toString() {
        return "Termek{" +
                "azonosito=" + azonosito +
                ", elnevezes='" + elnevezes + '\'' +
                ", beszerzesiar=" + beszerzesiar +
                ", fogyasztoiar=" + fogyasztoiar +
                '}';
    }
}
