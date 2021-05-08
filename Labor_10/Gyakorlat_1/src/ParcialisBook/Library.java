package ParcialisBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private String filter;
    private ArrayList<Book> books;

    public Library(String filter,String filename) {
        this.filter = filter;
        this.books = new ArrayList<>();


        this.readBooksFromFile(filename);
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public void readfromfile(String filename) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            assert scanner != null;
            if (!scanner.hasNextLine()) break;
            String[] line = scanner.nextLine().trim().split(", ");
            Book book = new Book(
                    line[0],
                    line[1],
                    line[2],
                    Integer.parseInt(line[3]),
                    Integer.parseInt(line[4]));
            this.books.add(book);

        }
    }

    public void kiir() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public Book findByIsbn(String isbn) {
        for (Book b : books)
            if (isbn.equals(b.getIsbn()))
                return b;

            return null;
    }

    private ArrayList<String> readFromFile(String fileName) {
        Scanner scanner;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        ArrayList<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        return lines;
    }
    private void readBooksFromFile(String fileName) {

        ArrayList<String> rows = this.readFromFile(fileName);

        if(rows == null)
            return;

        for(String row : rows) {
            String[] fields = row.split(", ");

            this.books.add(new Book(
                    fields[0],
                    fields[1],
                    fields[2],
                    Integer.parseInt(fields[3]),
                    Integer.parseInt(fields[4])));
        }
    }

}
