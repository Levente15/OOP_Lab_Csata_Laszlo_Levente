package nyugdijas;

import java.net.PortUnreachableException;

public class Alkalmazott {
    private String nev;
    private int kor;
    private double fizetes;
    private final static int nyugdijkorhatar=65;

    public Alkalmazott(String nev, int kor, double fizetes){
        this.fizetes=fizetes;
        this.kor=kor;
        this.nev=nev;
    }
    public  Alkalmazott(String nev, int kor){
        this(nev,kor,kor*100);
    }
    public String getNev() {
        return nev;
    }

    public double getFizetes() {
        return fizetes;
    }

    public int getKor() {
        return kor;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setFizetes(double fizetes) {
        this.fizetes = fizetes;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }
    public int nyugdijigmennyivan(){
        return (-1)*this.kor-nyugdijkorhatar;
    }
    public Alkalmazott kinekvantobb(Alkalmazott alkalmazott1, Alkalmazott alkalmazott2){
        if(alkalmazott1.nyugdijigmennyivan()>alkalmazott2.nyugdijigmennyivan())
            return alkalmazott1;
        else
            return alkalmazott2;
    }
       public  void listaz(Alkalmazott[] alkalmazotts) {
           for (Alkalmazott alkalmazottunk : alkalmazotts) {
               System.out.println(alkalmazottunk);
           }
       }
    @Override
    public String toString() {
        return "Alkalmazott{" +
                "nev='" + nev + '\'' +
                ", kor=" + kor +
                ", fizetes=" + fizetes +" "+"Nyugdijik hatralevo ido: "+nyugdijigmennyivan()+
                '}';
    }


}
