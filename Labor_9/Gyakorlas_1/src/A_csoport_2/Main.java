package A_csoport_2;

public class Main {
    public static void main(String[] args) {

        Tomb tomb = new Tomb(10);
        tomb.Randomfeltoltes();
        System.out.println("-------------");
        tomb.kiiras();
        System.out.println("--------");
        System.out.println("Paros szamok osszege");
        tomb.paros();

    }
}
