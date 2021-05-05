package A_csoport;

public class Main {
    public static void main(String[] args) {
        Dolgozat d1 = new Dolgozat(1, 2, "Peter", "Zsolt", 7.32);
        Dolgozat d2 = new Dolgozat(2, 4, "Sandor", "Peter", 6.32);
        Dolgozat d3 = new Dolgozat(3, 6, "Kiss", "Matyas", 9.32);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println();
        Tantargy tantargy = new Tantargy(12, "Angol");
        tantargy.readFromFile("be.txt");
        tantargy.kiiras();
        System.out.println("Legjobb dolgozat:");
        tantargy.legJobbDolgozat();
        System.out.println("A 2 szamu dolgozat:");
        tantargy.keresDolgozat(2);

    }
}
