package irodalom;

public class Regeny extends Irodalom{

    private String cselekmeny;
    private int fejezetekSzama;

    public Regeny(int terjedelm, String szerzo, String cim, int publikalaseve, String cselekmeny, int fejezetekSzama) {

        super(terjedelm, szerzo, cim, publikalaseve);
        this.cselekmeny = cselekmeny;
        this.fejezetekSzama = fejezetekSzama;
    }

    public boolean igazTortenetE(){
        return true;
    }

    @Override
    public void leiras(){
        System.out.println("Ez egy regeny");
    }

    public String toString(){
        return "Regeny - "+super.toString()+" \nCselekmeny: "+this.cselekmeny+" \nFejezetek szama: "+this.fejezetekSzama;
    }

}
