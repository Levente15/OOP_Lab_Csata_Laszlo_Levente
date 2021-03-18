package szervezet;

public class Elelmiszertermek {
     double suly;
    String tipus;
    double ar;
    int adagokszama;

    public void megjelenit(){
        System.out.print(suly);
        System.out.print(" kg ");
        System.out.print(tipus);
        System.out.print(", ");
        System.out.print(ar);
        System.out.print("lej,");
        System.out.print(adagokszama);
        System.out.print("darab");
        System.out.println();
    }
}
