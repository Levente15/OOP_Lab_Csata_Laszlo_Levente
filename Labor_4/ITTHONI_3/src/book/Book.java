package book;

public class Book {
   private String author;
   private String title;
    private int yearofpublication;
    private double price;

    public double getPrice() {
        return price;
    }

    public int getYearofpublication() {
        return yearofpublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearofpublication(int yearofpublication) {
        this.yearofpublication = yearofpublication;
    }


    public void increasePrice(double amount){
        price+=amount;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearofpublication=" + yearofpublication +
                ", price=" + price +
                '}';
    }
}
