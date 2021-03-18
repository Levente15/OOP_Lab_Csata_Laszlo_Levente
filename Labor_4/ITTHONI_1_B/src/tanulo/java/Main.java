package tanulo.java;

public class Main {
    public static void main(String[] args) {
        Tanulo tanulo1=new Tanulo();
        tanulo1.atlag=3;
        tanulo1.azonosito=124;
        tanulo1.szak=Szak.INFORMATIKA;
        System.out.println(tanulo1.toString());
    }
}
