package A_csoport;

public class Dolgozat {
    private int sorsz;
    private double oldsz;
    private String vezetekNev;
    private String keresztNev;
    private double osztalyzat;

    public Dolgozat(int sorsz, double oldsz, String vezetekNev, String keresztNev, double osztalyzat) {
        this.sorsz = sorsz;
        this.oldsz = oldsz;
        this.vezetekNev = vezetekNev;
        this.keresztNev = keresztNev;
        this.osztalyzat = osztalyzat;
    }

    public Dolgozat() {
        this.sorsz = 0;
        this.oldsz = 0;
        this.vezetekNev = "";
        this.keresztNev = "";
        this.osztalyzat = 0;
    }

    public void setSorsz(int sorsz) {
        this.sorsz = sorsz;
    }

    public void setOldsz(double oldsz) {
        this.oldsz = oldsz;
    }

    public void setVezetekNev(String vezetekNev) {
        this.vezetekNev = vezetekNev;
    }

    public void setKeresztNev(String keresztNev) {
        this.keresztNev = keresztNev;
    }

    public void setOsztalyzat(double osztalyzat) {
        this.osztalyzat = osztalyzat;
    }

    public int getSorsz() {
        return sorsz;
    }

    public double getOldsz() {
        return oldsz;
    }

    public String getVezetekNev() {
        return vezetekNev;
    }

    public String getKeresztNev() {
        return keresztNev;
    }

    public double getOsztalyzat() {
        return osztalyzat;
    }

    @Override
    public String toString() {
        return this.keresztNev + " " + this.vezetekNev + ", oldalszam: " + this.oldsz + ", sorszam " +
                this.sorsz + ", Jegye: " + this.osztalyzat;
    }
}
