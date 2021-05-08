package fel_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sokszog sokszog = new Sokszog(1, 4, 6);
        Sokszog sokszog1 = new Sokszog(2, 4, 6);
        Sokszog sokszog2 = new Sokszog(3, 4, 6);

        ArrayList<Sokszog> alakzatoks = new ArrayList<>();
        alakzatoks.add(sokszog);
        alakzatoks.add(sokszog1);
        alakzatoks.add(sokszog2);

        for (Sokszog s : alakzatoks)
            System.out.println(s);

        System.out.println("\n");

        Alakzatok alakzatok = new Alakzatok();
        alakzatok.readfromfile("be.txt");
        alakzatok.kiiras();

        alakzatok.listazKerulet();

        alakzatok.legnagyobbTerulet();

       // alakzatok.torolSokszog(61);

        alakzatok.kiir();
    }
}
