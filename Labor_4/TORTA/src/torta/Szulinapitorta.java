package torta;

public class Szulinapitorta extends Torta{
    private int gyergyaszam;

    public Szulinapitorta(String iz,int szelet,int gyergyaszam){
        super(iz,szelet);
        this.gyergyaszam=gyergyaszam;
    }
    public void info(){
        System.out.println("A torta ize "+getIz()+" a gyergyak szama "+gyergyaszam+" es a szeletek szama "+getSzelet());
    }

}
