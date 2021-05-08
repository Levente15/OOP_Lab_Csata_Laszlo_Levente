package fel_1;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Sokszog {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    private int id;
    private double oldal;
    private int oldalakszama;
    private double kerulet;
    private double terulet;

    public Sokszog(int id, double oldal, int oldalakszama) {
        this.id = id;
        this.oldal = oldal;
        this.oldalakszama = oldalakszama;

    }

    public Sokszog(int i, double v, int parseInt, double parseDouble, double aDouble) {
        this.id = 0;
        this.oldal = 0;
        this.oldalakszama = 0;
    }

    public void setOldal(double oldal){
        this.oldal=oldal;
    }

    public double getOldal(){
        return this.oldal;
    }
    public int getId(){
        return this.id;
    }

    public void setOldalakszam(int oldalakszama){
        this.oldalakszama=oldalakszama;
    }

    public int getOldalakszama(){
        return this.oldalakszama;
    }
    public double getKerulet(){
        return oldalakszama*oldalakszama;
    }

    public double getTerulet(){
         return (float)1/4*oldalakszama*oldal*oldal*(Math.toRadians(Math.cos(Math.PI/oldalakszama))/Math.toRadians(Math.sin(Math.PI/oldalakszama)));
    }

    public String toString(){
        StringBuffer b=new StringBuffer();
        b.append("ID ").append(id).append("\n")
                .append("\t").append("Oldal: ").append(oldal).append("\n")
                .append("\t").append("Oldalakszam: ").append(oldalakszama).append("\n");
                b.append("\t").append("Kerulet: ").append(this.getKerulet()).append("\n")
                .append("\t").append("Terulet: ").append(df2.format(getTerulet())).append("\n");

        return b.toString();

    }

}
