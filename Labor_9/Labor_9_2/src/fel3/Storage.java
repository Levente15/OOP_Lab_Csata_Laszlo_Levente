package fel3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products;

    public Storage(){
        this.products=new ArrayList<>();
    }

    public ArrayList<String> readFromFile(String filename){
        Scanner scanner = null;

        try {
            scanner=new Scanner(new File(filename));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        ArrayList<String> line=new ArrayList<>();

        while (scanner.hasNextLine()){
            line.add(scanner.nextLine());
        }
        return line;
    }

}
