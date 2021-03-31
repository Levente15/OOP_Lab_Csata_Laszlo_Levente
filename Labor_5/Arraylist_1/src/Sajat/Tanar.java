package Sajat;
public class Tanar {
   private String neve;
   private int kora;
   private String szakos;
   private double fizetes;

    public Tanar(String nev, int kor, String szakos,double fizetes) {
        this.neve = nev;
        this.kora = kor;
        this.szakos = szakos;
        this.fizetes=fizetes;
    }

    public String getNev() {
        return neve;
    }

    public int getKor() {
        return kora;
    }

    public String getSzakos() {
        return szakos;
    }
    public double getFizetes(){
        return fizetes;
    }

    public void setNev(String nev) {
        this.neve = nev;
    }

    public void setKor(int kor) {
        this.kora = kor;
    }

    public void setSzakos(String szakos) {
        this.szakos = szakos;
    }
    public void setFizetes(double fizetes){
        this.fizetes=fizetes;
    }
    public String toString(){
        return this.neve+" "+this.kora+" "+this.szakos+" es a fizetes "+this.fizetes;
    }
}
