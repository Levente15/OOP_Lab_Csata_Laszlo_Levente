package AutA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Szinesz sz1=new Szinesz("Pityu","Almas",Nem.MALE,1965);
        Szinesz sz2=new Szinesz("Pityuka","Almas",Nem.MALE,1965);
        Szinesz sz3=new Szinesz("MATYAS","Almas",Nem.MALE,1965);
        sz2.setDijakszam();
        sz3.setDijakszam();
        sz3.setDijakszam();
        System.out.println(sz1);
        System.out.println(sz2);
        System.out.println(sz3);
        System.out.println();

        Film film1=new Film("Umbrella","Geroge", 2100);
        film1.readfromfile("szinesz.txt");
        film1.kiiras();
        System.out.println();

        System.out.println(film1.aktualisev());
        System.out.println(film1.legidosebb());
        System.out.println(film1);
    }

}
