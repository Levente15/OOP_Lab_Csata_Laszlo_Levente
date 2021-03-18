package pro;

import java.util.PrimitiveIterator;

public class EXAMPLE {
    private int ev;
    private String nev;

    public EXAMPLE(int ev, String nev){
        this.ev=ev;
        this.nev=nev;
    }

    public String getNev() {
        return nev;
    }

    public int getEv() {
        return ev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    @Override
    public String toString() {
        return "EXAMPLE{" +
                "ev=" + ev +
                ", nev='" + nev + '\'' +
                '}';
    }
}
