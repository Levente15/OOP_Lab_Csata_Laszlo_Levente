package fel3;

public class Product implements Comparable<Product> {
    private int ID;
    private String name;
    private int amount;
    private int price;

    public Product(int ID, String name, int amount, int price) {
        this.ID = ID;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void increaseAmount(int newAmount) {
        this.amount += newAmount;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("ID ").append(this.ID).append("\n")
                .append("\t").append("Name ").append(name).append("\n")
                .append("\t").append("Amount: ").append(amount).append("\n")
                .append("\t").append("Price ").append(price);
        return b.toString();
    }

    @Override
    public int compareTo(Product o) {
        return this.ID - o.getID();
    }
}
