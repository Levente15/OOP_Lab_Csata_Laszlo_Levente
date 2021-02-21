package com.company;

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
