package com.company;

public class Main {

    public static void main(String[] args)
    {
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
    }
}

