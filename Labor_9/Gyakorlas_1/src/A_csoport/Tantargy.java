package A_csoport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tantargy {
    private int ID;
    private String nev;
    private ArrayList<Dolgozat> dolgozats;

    public Tantargy(int ID, String nev) {
        this.ID = ID;
        this.nev = nev;
        this.dolgozats = new ArrayList<>();
    }

    public void ujDolgozat(Dolgozat dolgozat) {
        this.dolgozats.add(dolgozat);
    }

    public void keresDolgozat(int sorszam) {
        for(Dolgozat d: dolgozats)
            if (d.getSorsz() == sorszam)
                System.out.println(d);


            System.out.println("Nincs ilyen sorszamu dolgozat");
        }

    public void listazDolgozatok() {
        for (Dolgozat d : dolgozats) {
            System.out.println(d);
        }
    }

    public void legJobbDolgozat() {
        double maximum = 0;
        String nev = null;
        String nevv = null;
        for (Dolgozat d : dolgozats) {
            if (d.getOsztalyzat() > maximum) {
                maximum = d.getOsztalyzat();
                nev = d.getKeresztNev();
                nevv = d.getVezetekNev();
            }
        }
        System.out.println("A legnagyobb: " + maximum + " Neve: " + nev + " " + nevv);
    }

    public void readFromFile(String filename) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(" ");
            Dolgozat dolgozat = new Dolgozat(Integer.parseInt(line[0]),
                    Integer.parseInt(line[1]), line[2], line[3],
                    Double.parseDouble(line[4]));
            this.dolgozats.add(dolgozat);
        }
    }

    public void kiiras() {
        for (Dolgozat t : this.dolgozats) {
            System.out.println(t);
        }
    }
}
