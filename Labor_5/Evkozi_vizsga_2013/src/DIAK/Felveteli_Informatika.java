package DIAK;

import java.util.ArrayList;

public class Felveteli_Informatika {
    public  ArrayList<Felveteli_Diak>felvetelizo;

    public Felveteli_Informatika(){
        this.felvetelizo=new ArrayList<>();
    }
    public void ujBeiratkozo(Felveteli_Diak Diak){
        this.felvetelizo.add(Diak);
    }
    public int felvetelizokSzama(){
        return this.felvetelizo.size();
    }
    public double felvetelizokAtlaga(){
        if(felvetelizokSzama()==0){
            return 0;
        }
        double sum=0;
        for(Felveteli_Diak d: felvetelizo){
            sum+=d.atlag();
        }
        return sum/felvetelizo.size();
    }
    public void listasOsszes(){
        for(Felveteli_Diak d: felvetelizo){
            System.out.println(d.toString());
        }
    }
    public void listazAtlag(double atlagunk){
        for(Felveteli_Diak d: felvetelizo){
            if(d.atlag()>atlagunk){
                System.out.println(d.toString());
            }
        }
    }
}
