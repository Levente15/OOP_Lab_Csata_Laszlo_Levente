package Arraylist;

import java.io.DataInput;

public class Diak {
    private String nev;
    private int kor;
    private String szemszin;

    public Diak(String nev, int kor, String szemszin){
        this.nev=nev;
        this.kor=kor;
        this.szemszin=szemszin;
    }
    public Diak(){

    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getSzemszin() {
        return szemszin;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setSzemszin(String szemszin) {
        this.szemszin = szemszin;
    }

    public String toString(){
        return this.nev+" "+this.kor+" es a szeme szine "+this.szemszin;
    }
}
