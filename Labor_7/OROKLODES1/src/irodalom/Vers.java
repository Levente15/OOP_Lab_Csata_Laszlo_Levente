package irodalom;

public class Vers extends Irodalom{

    private String rim;
    private String liraiEn;
    private int szakaszokSzama;

    public Vers(int terjedelm, String szerzo, String cim, int publikalaseve, String rim, String liraiEn, int szakaszokSzama) {
        super(terjedelm, szerzo, cim, publikalaseve);
        this.rim = rim;
        this.liraiEn = liraiEn;
        this.szakaszokSzama = szakaszokSzama;
    }

    @Override
    public void leiras(){
        System.out.println("Ez egy vers");
    }

    @Override
    public String toString(){
        return "Vers - "+super.toString()+" \nRim "+this.rim+" \nLirai en "+this.liraiEn+" \nszakaszok szama "+this.szakaszokSzama;
    }
}
