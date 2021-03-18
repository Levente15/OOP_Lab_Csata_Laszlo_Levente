package hanglemez;

import hanglemez.Hang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hang lemez1=new Hang("Peter", "Sasaka",23);
        System.out.println(lemez1.toString());
        Scanner input=new Scanner(System.in);
        System.out.println("Add meg a lemezek szamat:");
        int lemezekszama=input.nextInt();
        input.nextLine();
        Hang[] lemezek=new Hang[lemezekszama];
        for(int i=0;i<lemezek.length;i++){
            System.out.println( (i+1) + ". : ");
            System.out.println("Eloado: ");
            String eloado= input.nextLine();
            System.out.println("Cim: ");
            String cim= input.nextLine();
            System.out.println("Hossz: ");
            int hossz= input.nextInt();
            input.nextLine();
            lemezek[i]=new Hang(eloado,cim,hossz);
        }
      //  System.out.println("A leghosszabb felvetel: "+lemezek[maximumfelvetel(lemezek)]);
    }
}
