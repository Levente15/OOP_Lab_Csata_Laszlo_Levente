package torta;

public class Torta {
    private String iz;
    private int szelet;

    public Torta(String iz, int szelet){
        this.iz=iz;
        this.szelet=szelet;
    }
    public Torta(){

    }

    public int getSzelet() {
        return szelet;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }

    public void setSzelet(int szelet) {
        this.szelet = szelet;
    }

    @Override
    public String toString() {
        return "Torta{" +
                "iz='" + iz + '\'' +
                ", szelet=" + szelet +
                '}';
    }
}
