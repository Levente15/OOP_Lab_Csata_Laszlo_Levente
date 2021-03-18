package lakohely.main;

public class lakohelyek {
    String cim;
    int szobaszam;
    double alapterulet;

    public lakohelyek(String cim, int szobaszam, double alapterulet) {
        this.cim = cim;
        this.szobaszam = szobaszam;
        this.alapterulet = alapterulet;
    }

    public void setSzobaszam(int szobaszam) {
        this.szobaszam = szobaszam;
    }

    public void setAlapterulet(double alapterulet) {
        this.alapterulet = alapterulet;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    @Override
    public String toString() {
        return "lakohelyek{" +
                "cim='" + cim + '\'' +
                ", szobaszam=" + szobaszam +
                ", alapterulet=" + alapterulet +
                '}';
    }
}




