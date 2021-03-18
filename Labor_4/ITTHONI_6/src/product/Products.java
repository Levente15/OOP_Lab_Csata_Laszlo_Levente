package product;

public class Products {
    private String nev;
    private int ar;
    private int afakulcs;

    public Products(){

    }

    public Products(String nev, int ar, int afakulcs){
        this.nev=nev;
        this.afakulcs=afakulcs;
        this.ar=ar;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public int getAfakulcs() {
        return afakulcs;
    }

    public void setAfakulcs(int afakulcs) {
        this.afakulcs = afakulcs;
    }
     public double getbruttoar(){
        return (double)(ar+(ar*(afakulcs/100)));
     }
     public int arnoveles(int arnoveles){
        return ar+arnoveles;
    }
    public int hasonlit(Products aru1){
        if(this.getbruttoar()>aru1.getbruttoar()) {
            return 1;
        }
        else if(this.getbruttoar()<aru1.getbruttoar()) {
            return 0;
        } else
            return -1;
    }
    @Override
    public String toString() {
        return "Products{" +
                "nev='" + nev + '\'' +
                ", ar=" + ar +
                ", afakulcs=" + afakulcs +" Bruttoar: "
                +getbruttoar()+" Arnoveles "+arnoveles(300)+
                ' ';
    }
}
