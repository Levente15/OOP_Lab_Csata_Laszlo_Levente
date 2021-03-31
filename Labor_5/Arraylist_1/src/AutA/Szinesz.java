package AutA;

public class Szinesz {
    private static int szineszekszam=0;
    private String id;
    private String knev;
    private String vnev;
    private Nem nem;
    private int szuletesiev;
    private int dijakszam;

    public Szinesz(String knev, String vnev,Nem nem, int szuletesiev) {
        this.knev = knev;
        this.vnev = vnev;
        this.nem=nem;
        this.szuletesiev = szuletesiev;
        szineszekszam++;
        this.id=vnev.substring(0,1)+knev.substring(0,1)+szineszekszam;
    }

    public Nem getNem() {
        return nem;
    }

    public String getId() {
        return id;
    }

    public String getKnev() {
        return knev;
    }

    public String getVnev() {
        return vnev;
    }

    public int getSzuletesiev() {
        return szuletesiev;
    }

    public void setDijakszam() {
        this.dijakszam++;
    }

    public int getDijakszam() {
        return dijakszam;
    }
   @Override
    public String toString(){
        return "AZ id: "+id+" neve "+this.vnev+" "+this.knev+" "+this.szuletesiev+" "+nem+" "+dijakszam;
    }
}
