package termek;

public class Termek {
     private int azonosito;
    private String elnevezes;
    private double beszerzesiar;
    private double fogyasztoiar;

    public Termek(int azonosito, String elnevezes, double beszerzesiar){
        this.azonosito=azonosito;
        this.fogyasztoiar=beszerzesiar;
        this.elnevezes=elnevezes;
        this.beszerzesiar=beszerzesiar;
    }

    public double getBeszerzesiar() {
        return this.beszerzesiar;
    }

    public double getFogyasztoiar() {
        return this.fogyasztoiar;
    }

    public int getAzonosito() {
        return this.azonosito;
    }

    public String getElnevezes() {
        return this.elnevezes;
    }
    public void setArres(int szazalek){
        this.fogyasztoiar=beszerzesiar+(szazalek*(beszerzesiar/100));
    }

    @Override
    public String toString() {
        return "Termek{" +
                "azonosito=" + azonosito +
                ", elnevezes='" + elnevezes + '\'' +
                ", fogyasztoiar=" + fogyasztoiar +" beszerzesi ar "+beszerzesiar+
                '}';
    }
}
