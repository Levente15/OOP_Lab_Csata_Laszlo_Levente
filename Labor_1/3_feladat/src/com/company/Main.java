package com.company;

public class Main {
    public static void main(String[] args) {
        // I Egyszeru main - 1Feladat
        System.out.println("Jozsi");

        // 2Feladat
        String nev = "Antal Jozsef";
        for (int i = 0; i < nev.length(); ++i) {
            System.out.println(nev.charAt(i));
        }

        System.out.printf("\n");

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

        System.out.printf("\n");

        // 4feladat

        String[] tomb;
        String nev2 = "Kerekes Bálint Ádám József";
        tomb = nev2.split(" ");

        for (int i=0; i < tomb.length; i++) {
            System.out.printf("%c",tomb[i].charAt(0));
        }

        System.out.printf("\n\n");

        // II Fugvenyenk - 1feladat

        double x[] ={7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));

    }
}