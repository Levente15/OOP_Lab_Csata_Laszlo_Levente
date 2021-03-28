package DIAK;

public class Felveteli_Diak {
    private String vnev;
    private String knev;
    private double erettsegi;
    private double matemaktika;

    public Felveteli_Diak(String vnev,String knev, double erettsegi, double matemaktika){
        this.vnev=vnev;
        this.knev=knev;
        this.erettsegi=erettsegi;
        this.matemaktika=matemaktika;
    }
    public Felveteli_Diak(){
        this.vnev="";
        this.knev="";
        this.erettsegi=0;
        this.matemaktika=0;
    }

    public String getVnev() {
        return vnev;
    }

    public String getKnev() {
        return knev;
    }

    public double getErettsegi() {
        return erettsegi;
    }

    public double getMatemaktika() {
        return matemaktika;
    }

    public void setVnev(String vnev) {
        this.vnev = vnev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }

    public void setErettsegi(double erettsegi) {
        this.erettsegi = erettsegi;
    }

    public void setMatemaktika(double matemaktika) {
        this.matemaktika = matemaktika;
    }
    public double atlag(){
        return (this.matemaktika+this.erettsegi)/2;
    }

    @Override
    public String toString() {
        return vnev + knev + erettsegi +
                matemaktika +" atlag "+this.atlag();
    }
}
