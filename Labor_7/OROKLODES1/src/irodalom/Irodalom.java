package irodalom;

import java.net.PortUnreachableException;

public class Irodalom {
    private int terjedelm;
    private String szerzo;
    private String cim;
    private int publikalaseve;

    public Irodalom(int terjedelm, String szerzo, String cim, int publikalaseve) {
        this.terjedelm = terjedelm;
        this.szerzo = szerzo;
        this.cim = cim;
        this.publikalaseve = publikalaseve;
    }

    public void leiras(){
        System.out.println("Egyszeru irodalmi mu");
    }

    @Override
    public String toString(){
        return this.cim+", szerzo "+this.szerzo+", terjedelm  "+this.terjedelm+" es a publikalas eve: "+this.publikalaseve;
    }
}
