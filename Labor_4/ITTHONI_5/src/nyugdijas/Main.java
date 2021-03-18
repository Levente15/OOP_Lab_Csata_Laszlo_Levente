package nyugdijas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Alkalmazott alkalmazott1=new Alkalmazott("Peti",44,543);
        Alkalmazott alkalmazott2=new Alkalmazott("Matyas",60,645);
        System.out.println(alkalmazott1.toString());
        System.out.println(alkalmazott2.toString());

        Scanner input=new Scanner(System.in);
        System.out.println("Alkalmazottak szama: ");

        int alkalmazottszam=input.nextInt();

        Alkalmazott[] alkalmazotts=new Alkalmazott[alkalmazottszam];

        for(int i=0;i<alkalmazotts.length;i++){
            System.out.println((i+1)+" Alkalmazott: ");
            System.out.println("Nev; ");
            String nev=input.nextLine();
            System.out.println("Kor ");
            int kor=input.nextInt();
            System.out.println("Fizetes: ");
            double fizetes=input.nextDouble();
            input.nextLine();
            alkalmazotts[i]=new Alkalmazott(nev, kor, fizetes);
        }
        alkalmazott1.listaz(alkalmazotts);
        System.out.println("Nyugdijig tobb, mint 6 eve van: ");
        for(Alkalmazott alkalmazott: alkalmazotts){
            if(alkalmazott.nyugdijigmennyivan()<6){
                System.out.println(alkalmazott);
            }
        }

    }
}
