package Arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> szam1=new ArrayList<>();
        szam1.add(1);
        szam1.add(2);
        szam1.add(3);
        for(Integer szam : szam1){
            System.out.println(szam);
        }
        System.out.println("\n");
        ArrayList<Integer> szamok=new ArrayList<>();
        for(Integer szam : szam1){
            szamok.add(szam);
        }
        for (Integer szam : szamok){
            System.out.println(szam);
        }

        Diak diak=new Diak();
        diak.setNev("Anna");
        diak.setKor(22);
        diak.setSzemszin("kek");
        System.out.println(diak);
        ArrayList<Diak> DIAKS=new ArrayList<>();
        DIAKS.add(diak);
        System.out.println(DIAKS);
        ArrayList<Diak> diaks=readfromcsvfile("tanulok.csv");
        int szamalo=0,ossz=0;
        for(Diak d: diaks){
            System.out.println(d.getNev()+" "+d.getKor()+" "+d.getSzemszin());
            szamalo++;
            ossz+=d.getKor();
        }
        System.out.println("**********************************");
        double atlag=(float)(ossz/szamalo);
        System.out.println("A tanulok szama:"+ szamalo+" az atlag eletkor " +(float)atlag);
        System.out.println("*************");
        for(Diak d: diaks){
            if(d.getKor()<50){
                System.out.println(d.getNev());
            }
        }
        int[] tomb=new int[4];
        Random random=new Random();
        for (int i=0;i<tomb.length;i++){
           tomb[i]= random.nextInt(23);
            System.out.println(tomb[i]);
        }
    }
    public  static ArrayList<Diak> readfromcsvfile(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (scanner == null) {
            return null;
        }
        ArrayList<Diak> diaks = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty())
                continue;

            String[] item = line.split(" ");
           String nev=item[0].trim();
           int kor=Integer.parseInt(item[1].trim());
           String szemszin=item[2].trim();
           diaks.add( new Diak(nev,kor, szemszin));
        }
        return diaks;
    }
}
