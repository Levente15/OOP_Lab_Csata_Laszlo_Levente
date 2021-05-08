package ParcialisBook;

public class Main {
    public static void main(String[] args) {

        Book book=new Book("wr12","Peter","Bosszu",23,12);
        System.out.println(book);

        //Library library=new Library("a");
        //library.readfromfile("book.txt");
        //library.kiir();
        //System.out.println("Adott ISBN altal keresett konyv:");
        //System.out.println(library.findByIsbn("9-7819-2899-4558"));

        Library library1=new Library("q","book.txt");
        library1.kiir();
        library1.findByIsbn("9-7819-2899-4558");
    }
}
