package com.company;

/**
 * A monogramot a megadott név alapján kellett meghatározni, nem úgy hogy Te beírod a konkrét monogramot.
 * De gondolom ez próbálkozás volt.
 * Ha egyszerűen csak egy String-et kell kiírni, akkor nem muszáj printf, elégséges az egyszerű print.
 */
public class Main {

    public static void main(String[] args) {
        String nevem="Csata Levente";
	    String mono=" Cs. L.";
	    nevem+=mono;
	    System.out.printf(nevem);
    }
}
