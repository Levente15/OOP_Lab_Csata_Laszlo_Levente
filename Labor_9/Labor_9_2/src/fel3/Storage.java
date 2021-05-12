package fel3;

import javax.swing.plaf.PanelUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Storage {
    private final ArrayList<Product> products;

    public Storage(String filename){
        this.products=new ArrayList<>();
        this.readfromfile(filename);
        this.sortByComparator(Product::compareTo);
    }

    private ArrayList<String> readFromFile(String filename){
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

    private void readfromfile(String filename){

        ArrayList<String> rows=this.readFromFile(filename);

        if(rows==null)
            return;

        for (String r : rows){
            String[] line = r.split(" ");

            this.products.add(new Product(
                    Integer.parseInt(line[0]),
                    line[1],
                    Integer.parseInt(line[2]),
                    Integer.parseInt(line[3])
                    ));
        }
    }
    public void update(String fileName) {
        int updateCounter = 0;

        ArrayList<String> rows = this.readFromFile(fileName);

//        if(rows == null)
//            return;

        for(String row : rows) {
            String[] line = row.split(" ");

            try {
                this.findProduct(Integer.parseInt(line[0])).increaseAmount(Integer.parseInt(line[2]));
                updateCounter++;
            } catch (NullPointerException ignored) {}
        }


        System.out.println("Updated " + updateCounter + " products");
        System.out.println();
    }


    public void printProduct(){
        for(Product p : products)
            System.out.println(p);
    }

    public Product findProduct(int ID) {
        for (Product p : products) {
            if (ID == p.getID()) {
                return p;
            }
        }
        return null;
    }

    private void sortByComparator(Comparator<Product> comparator) {
        this.products.sort(comparator);
    }
}
