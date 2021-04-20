package irodalom;

import Stack.StackAggretation;
import Stack.Stackinheritance;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       Regeny regeny1=new Regeny(11,"Harper Lee", "Ne bántsátok a feketerigót",1990,"Lee kerülte a reflektorfényt",34);
       Regeny regeny2 = new Regeny(283,"Rejto Jeno", "Piszkos Fred, a kapitany", 1940, "bűnügy", 24);
       Regeny regeny3 = new Regeny(3200,"Sui Ishida", "Tokyo Ghoul", 2020, "Mikor nem az ember all a taplaleklanc tetejen, hanem valami sokkal gyorsabb es erosebb - egy ghoul. Fohosunk, Kaneki egy lesz kozuluk.", 256 );

       Vers vers1 = new Vers(6,"Mihai Eminescu","Luceafarul",1882,"paros","Mihai Eminescu",98);
       Vers vers2 = new Vers(1, "Petofi","Szeptember vegen", 1847, "olelkezo", "van", 3);
       Vers vers3 = new Vers(10, "Arany János", "Mátyás Anyja", 1854, "Félrím","van",4);


       // System.out.println(regeny1);

        ArrayList<Irodalom> alkotasok=new ArrayList<>();
        alkotasok.add(vers1);
        alkotasok.add(vers2);
        alkotasok.add(vers3);
        alkotasok.add(regeny1);
        alkotasok.add(regeny2);
        alkotasok.add(regeny3);

        for(Irodalom i : alkotasok){
            i.leiras();
            if(i instanceof Regeny) {
                //System.out.println(((Regeny) i).igazTortenetE());// igy is mukodik
                Regeny r = (Regeny) i;
                System.out.println("Igaz tortenet: "+r.igazTortenetE());
            }
            System.out.println(i);
        }
        System.out.println("Inharitage\n");
        Stackinheritance stackinheritance=new Stackinheritance();

        for(int i=0;i<10;i++){
            stackinheritance.push(i+1);
        }
        while (!stackinheritance.isEmpty())
            System.out.println(stackinheritance.pop());

    }
}
