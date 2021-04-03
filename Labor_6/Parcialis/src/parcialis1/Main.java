package parcialis1;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Sportolo sportolo1=new Sportolo("Levente","Csata",Kategoria.BOX,true,2,2001,178);
        Sportolo sportolo2=new Sportolo("Peter","Nagy",Kategoria.FUTAS,true,5,2000,180);
        Sportolo sportolo3=new Sportolo("Anna","Eros",Kategoria.SIZES,false,56,1990,165);
        System.out.println(sportolo1);

        sportolo2.setErmekszama(2);
        System.out.println(sportolo2);

        sportolo3.setErmekszama(3);
        System.out.println(sportolo3);
        System.out.println();
        Olimpiaijatekok ol1=new Olimpiaijatekok("Miami",2000);
        Random random=new Random();
        Sportolo sportolo4=new Sportolo("Otto","Horvath",Kategoria.SIZES,true,
                123,54,1999);
        System.out.println();
        sportolo4.setErmekszama(random.nextInt(6));
        System.out.println(sportolo4);
        System.out.println();
        ol1.readfromcscfile("sporolok.csv");
        for(Sportolo s: ol1.sportolos){
            System.out.println(s);
        }
        System.out.println(ol1.adottsportag(Kategoria.FUTAS));
        ol1.novagyferfi();
        System.out.println();
        System.out.println("Legtobb erme van: ");
        System.out.println(ol1.legtobberem());
        System.out.println();
        System.out.println(ol1);
    }
}
