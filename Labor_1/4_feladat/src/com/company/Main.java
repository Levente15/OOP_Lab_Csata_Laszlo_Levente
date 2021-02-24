package com.company;

/**
 * Ügyes! Na ehhez hasonlóan lett volna jó az első monogramos feladatot is.
 * Próbáld ki az enhanced for szintexisát is. Megbeszéljük laboron, de valószínű az IntelliJ is
 * ajánlja a cserét.
 */
public class Main {

    public static void main(String[] args) {

        String[] monogram;
        String nev2 = "Kerekes Bálint Ádám József";
        monogram = nev2.split(" ");

        for (int i=0; i < monogram.length; i++) {
            System.out.printf("%c ",monogram[i].charAt(0));
        }

    }
}
