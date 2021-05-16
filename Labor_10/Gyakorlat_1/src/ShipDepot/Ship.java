package ShipDepot;

public class Ship {
    private String shipId;
    private String manufacturer;
    private String type;
    private int yearOfProduction;
    private int price;
    private double weight;

    public Ship(String shipId, String manufacturer, String type, int yearOfProduction, int price, double weight) {
        this.shipId = shipId;
        this.manufacturer = manufacturer;
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("ShipId:").append(shipId).append("\n")
                .append("\t").append("Manufacturer: ").append(manufacturer).append("\n")
                .append("\t").append("Type: ").append(type).append("\n")
                .append("\t").append("Year: ").append(yearOfProduction).append("\n")
                .append("\t").append("Price: ").append(price).append("\n")
                .append("\t").append("Weight: ").append(weight).append("\n");
        return str.toString();
    }
}
