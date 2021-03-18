package szervezet;

public class main {
    //GYAKORLAS!!!
    public static void main(String[] args) {
        Szervezet alma= new Szervezet("BUNDA",true,122);
        Szervezet alma1= new Szervezet("UNICEF",false,100);
        Elelmiszertermek egyes=new Elelmiszertermek();
        egyes.suly=12;
        egyes.adagokszama=4;
        egyes.ar=43;
        egyes.tipus="szeleteltbarack";
        egyes.megjelenit();
        alma.megjelnit();
        alma1.megjelnit();
    }
}
