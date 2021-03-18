package tanulo.java;

public class Tanulo {
    String name;
    int azonosito;
    double atlag;
    Szak szak;

    public Tanulo(){
    }

    @Override
    public String toString() {
        return "Tanulo{" +
                "name='" + name + '\'' +
                ", azonosito=" + azonosito +
                ", atlag=" + atlag +
                ", szak=" + szak +
                '}';
    }
}
