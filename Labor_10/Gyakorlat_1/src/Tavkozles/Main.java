package Tavkozles;

public class Main {
    public static void main(String[] args) {
        Varos varos=new Varos("Magyarorszag",1234,342.432,"Deak");
        Varos varos1=new Varos("Magyarorszag",1234,342.432,"Deak");
        System.out.println(varos);
        System.out.println(varos1);
        Orszag orszag=new Orszag("Romania","Gdaoh");
        System.out.println("**********");

        System.out.println(orszag);
        System.out.println("***************");
        orszag.readfromfile("orszag.txt");
        System.out.println();
        System.out.println(orszag.aznevezetesseg(3));
        System.out.println(orszag.getFovaros());
        orszag.terulet();

    }
}
