package fel_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alakzatok {

    private final ArrayList<Sokszog> sokszogs;

    public Alakzatok() {
        this.sokszogs = new ArrayList<>();
    }

    public void readfromfile(String filename) {

        Scanner scanner;

        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(" ");
            Sokszog sokszog=new Sokszog(
                    Integer.parseInt(line[0]),
                    Double.parseDouble(line[1]),
                    Integer.parseInt(line[2]));
            this.sokszogs.add(sokszog);
        }

    }
    public void kiiras(){
        for(Sokszog s: sokszogs)
            System.out.println(s);
    }
    public void ujSokszog(Sokszog sokszog){
        this.sokszogs.add(sokszog);
    }

    public void torolSokszog(int id){
        for(Sokszog s: sokszogs)
            if(id==s.getId()){
                sokszogs.remove(s);
            }
    }
    public void listazKerulet(){
        for(Sokszog s: sokszogs)
            System.out.println(s.getKerulet());
    }

    public void listazTerulet(){
        for(Sokszog s: sokszogs)
            System.out.println(s.getTerulet());
    }

    public  void legnagyobbTerulet(){
        double max=0;
        //Sokszog tmp=new Sokszog(0,0,0);
        for(Sokszog s: sokszogs){
            if(s.getTerulet()==max) {
                max = s.getKerulet();

            }
        }
        System.out.println("A legnagyobb terulet "+max);
        System.out.println();
    }
    public void kiir() {
        FileWriter file = null;
        try {
            file = new FileWriter("kiir.txt");
            for (Sokszog s : sokszogs)
                if (s.getOldalakszama() == 4)
                    file.write(s.toString());

             file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
