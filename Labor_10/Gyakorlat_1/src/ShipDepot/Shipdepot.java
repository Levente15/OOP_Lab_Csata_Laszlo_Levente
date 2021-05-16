package ShipDepot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Shipdepot {
    private ArrayList<Ship> ships;

    public Shipdepot() {
        this.ships = new ArrayList<>();
    }

    public void readfromfile(String filename) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(" ");
            Ship ship = new Ship(line[0], line[1], line[2],
                    Integer.parseInt(line[3]), Integer.parseInt(line[4]),
                    Double.parseDouble(line[5]));
            this.ships.add(ship);
        }
    }

    public void printShip(){
        for(Ship s : ships)
            System.out.println(s);
    }

    public void newShip(Ship ship){
        this.ships.add(ship);
    }

    public void removeShip(String shipId){
        this.ships.remove(shipId);
    }

    public Ship printinterval(){
        for(Ship s : ships)
            if (s.getYearOfProduction()>=1940 && s.getYearOfProduction()<=2005)
              return s;

        return null;
    }

    public Ship printprice(){
        for(Ship s : ships)
            if(s.getPrice()>10000000)
                return s;

            return null;
    }

    public Ship contains(){
        for(Ship s : ships)
            if(s.getManufacturer().contains("I") || s.getManufacturer().contains("i"))
                return s;

            return null;
    }
}

