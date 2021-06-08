package com.company;

/**
 * van egy ciklus üresbe úgymond. i=0, j=0 értékekre nem történik semmi. Lehetne egyből i=1 től kezdeni
 * vagy megfogalmazni másképp a megállási feltételt.
 * Egyébként rendben van, de laboron megnézünk egy másik megoldást, ami még elegánsabb.
 */
public class Main {
    public static void main(String[] args) {

        // 3Feladat
        String szo = "ALMAFA";

        int l;
        l = szo.length();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%c", szo.charAt(j));
            }
            System.out.printf("%c\n", szo.charAt(i));
        }



    }
}