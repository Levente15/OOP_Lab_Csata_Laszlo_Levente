package Sajat;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Diak d1=new Diak("Marta",33,10,"Infromatika");
        System.out.println(d1);
        d1.setlakas(1);
        System.out.println(d1);

        ArrayList<Diak> diaks=readfromfile("be1.txt");
        for(Diak d: diaks){
            System.out.println(d);
        }
        System.out.println();
        Tanar tan=new Tanar("Sandor",44,"Infos",342);
        System.out.println(tan);
        System.out.println();
        System.out.println("A tanarok nevsora:");
    ArrayList<Tanar>tanars=readfromcsvfile("tanar1.csv");
    for(Tanar t: tanars) {
        System.out.println(t);
      }
    }

    public static ArrayList<Diak> readfromfile(String filename){
        Scanner scanner=null;
        try{
            scanner=new Scanner(new File(filename));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        ArrayList<Diak> diaks=new ArrayList<>();
        while (scanner.hasNextLine()){
            String[] item=scanner.nextLine().trim().split(" ");
            Diak diakok=new Diak();
            diakok.setKeresztnev(item[0]);
            diakok.setKor(Integer.parseInt(item[1]));
            diakok.setJegy(Double.parseDouble(item[2]));
            diakok.setSzak(item[3]);
            diaks.add(diakok);
        }
        return diaks;
    }
    public static ArrayList<Tanar> readfromcsvfile(String filename){
        Scanner scanner=null;
        try{
            scanner=new Scanner(new File(filename));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        ArrayList<Tanar> tanars=new ArrayList<>();
        while (scanner.hasNextLine()){
            String line=scanner.nextLine();
            if(line.isEmpty())
                continue;
            String[] item=line.split(" ");
            String neve=item[0].trim();
            int kora=Integer.parseInt(item[1].trim());
            String szakos=item[2];
            double fizetes=Double.parseDouble(item[3]);
            tanars.add(new Tanar(neve,kora,szakos,fizetes));
            }
        return tanars;
        }
    }

