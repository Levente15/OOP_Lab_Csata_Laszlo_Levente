package com.company;

/**
 * Nem szükséges minden apró feladatot külön class-be, illetve külön projektbe megoldani.
 * Minden mehetett volna ebbe a Main class-be, külön függvényekbe.
 */
public class Main {

    public static void main(String[] args) {
	System.out.println("Csata Levente");

	System.out.println("\n");

	String nev="Csata Levente";
	for(int i=0;i<nev.length();i++)
        {
            System.out.println(nev.charAt(i));
        }
    }
}
