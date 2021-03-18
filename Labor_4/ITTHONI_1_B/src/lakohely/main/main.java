package lakohely.main;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class main {
    public static void main(String[] args) {
        lakohelyek Miami = new lakohelyek("Sarga", 123, 34);
        lakohelyek Dallas=new lakohelyek("Piros",346,43);


        System.out.printf(Miami.toString());
        System.out.printf(Dallas.toString());
    }
}
