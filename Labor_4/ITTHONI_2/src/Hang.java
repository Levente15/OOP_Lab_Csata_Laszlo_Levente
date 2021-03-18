package hanglemez;
public class Hang {
    String eloado;
    String cim;
    int hossz;

    public Hang(String eloado, String cim, int hossz){
        this.eloado=eloado;
        this.cim=cim;
        this.hossz=hossz;
    }

    public int getHossz() {
        return hossz;
    }

    public int hosszvizsgalat(Hang felvetel){
       if(hossz==felvetel.hossz)
           return 0;
       if(hossz>felvetel.hossz)
           return 1;
        else
            return -1;
    }
    public boolean eloaddovizsgalo(String megadotteloado){
        return this.eloado.equals(megadotteloado);
    }
     public static int maximumfelvetel(Hang[] lemezek){
        int maximum=0;
        for(int i=0;i< lemezek.length;i++){
            if(lemezek[i].getHossz()>lemezek[maximum].getHossz()){
                maximum=i;
            }
        }
        return maximum;
     }
    @Override
    public String toString() {
        return "hang{" +
                "eloado='" + eloado + '\'' +
                ", cim='" + cim + '\'' +
                ", hossz=" + hossz +
                '}';
    }
}
