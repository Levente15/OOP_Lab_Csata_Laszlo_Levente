package AutB;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Halalsoiram", Kategoria.AKCIO, 123, false);
        Film film2 = new Film("Micimacko", Kategoria.ANIMACIO, 22, true);
        System.out.println(film1);
        System.out.println(film2);
        Mozi mozi1=new Mozi("Cinema","Miami");
        mozi1.refromcsvfile("mozi.csv");
        System.out.println();
        for(Film f : mozi1.films){
            System.out.println(f);
        }
        System.out.println(mozi1.tortenelmifilmekszam());
        mozi1.kiirkategoria(Kategoria.TORTENELMI);
        System.out.println("Meglehet nezni:"+(mozi1.megtekintes(32)? "Igen":"nem"));
        System.out.println("10 szinesznel kevesebb szereplik ennyi filmben: "+mozi1.szinesz());
        System.out.println(mozi1);
    }
}
