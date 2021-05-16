package ShipDepot;

public class Main {
    public static void main(String[] args) {
        Ship ship=new Ship("f123456789", "Spain","caravel", 1920, 10000000, 5);
        Ship ship2=new Ship("f1234569", "Spain","caravel", 2920, 5006666, 54);
        System.out.println(ship);

        Shipdepot shipdepot=new Shipdepot();
        shipdepot.readfromfile("ship.txt");
        shipdepot.printShip();
        System.out.println("********Add**********");
        shipdepot.newShip(ship2);
        shipdepot.printShip();
        System.out.println("**********Remove********");
        shipdepot.removeShip("f123456789");
        shipdepot.printShip();
        System.out.println("**********Interval********");
        System.out.println(shipdepot.printinterval());
        System.out.println("**********10000000********");
        System.out.println(shipdepot.printprice());
        System.out.println("**********Contain********");
        System.out.println(shipdepot.contains());
    }
}
