package parcialis1;

public class Sportolo {
    public static int szam=0;
    private String id;
    private String knev;
    private String csnev;
    private Kategoria kategoria;
    private boolean nem;
    private int ermekszama;
    private int legutolsojateknap;
    double magassag;
    private int szuletesiev;


    public Sportolo( String knev, String csnev, Kategoria kategoria,boolean nem,double magassag , int legutolsojateknap,int szuletesiev) {
        this.knev = knev;
        this.csnev = csnev;
        this.kategoria = kategoria;
        this.nem = nem;
        this.magassag=magassag;
        this.ermekszama=ermekszama; //plusz,ez a random kimaradasa miatt kellett alkalmani
        this.legutolsojateknap = legutolsojateknap;
        this.szuletesiev=szuletesiev;
        this.ermekszama=0;
        szam++;
        this.id=this.csnev.substring(0,1)+this.knev.substring(0,1)+"-"+this.szuletesiev+"-"+Sportolo.szam;
    }
    //Getter
    public static int getSzam() {
        return szam;
    }

    public String getId() {
        return id;
    }

    public String getKnev() {
        return knev;
    }

    public String getCsnev() {
        return csnev;
    }

    public Kategoria getKategorial() {
        return kategoria;
    }

    public boolean getNem(){
        return nem;
    }

    public boolean isNem() {
        return nem;
    }

    public int getErmekszama() {
        return ermekszama;
    }

    public int getLegutolsojateknap() {
        return legutolsojateknap;
    }

    public double getMagassag() {
        return magassag;
    }

    public int getSzuletesiev() {
        return szuletesiev;
    }
    //Setter
    public void setLegutolsojateknap(int legutolsojateknap){
        this.legutolsojateknap=legutolsojateknap;
    }
    public void setErmekszama(int ermekszama){
        this.ermekszama=ermekszama;
    }
    public String toString(){
        StringBuilder buffer=new StringBuilder();

        buffer.append( "Az id: ").append(this.id).append(" ").append(this.knev).append(" ").append(this.csnev)
                .append(" ,ebben jatszik ").append(this.kategoria).append(" ");
        if(this.nem)
            buffer.append("Ferfi");
        else
            buffer.append("No");
            buffer.append(" ermeinek a szama: ").append(this.ermekszama).append("  legutobb ekkor jatszott ").append(
            this.legutolsojateknap).append(" a magassaga: ").append(+this.magassag);

        return buffer.toString();
    }
}
