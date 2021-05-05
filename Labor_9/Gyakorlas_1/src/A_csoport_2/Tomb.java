package A_csoport_2;

import java.util.Random;

public class Tomb {
    private int[] element;
    public int elemSzam;


    public Tomb(int elemSzam) {
        this.elemSzam = elemSzam;
        this.element = new int[this.elemSzam];
    }

    public void Randomfeltoltes() {
        Random random = new Random();
        int i;
        for (i = 0; i < element.length; i++) {
            element[i] = random.nextInt(10);
            //System.out.println(element[i] + " ");
        }
    }

    public void kiiras() {
        for (int i = 0; i < element.length; i++)
            System.out.println(element[i]);
    }

    public void paros() {
        int szam = 0;
        for (int i = 0; i < element.length; i++) {
            if (element[i] % 2 == 0) {
                szam += element[i] ;
            }
        }
        System.out.println(szam);
    }
}
