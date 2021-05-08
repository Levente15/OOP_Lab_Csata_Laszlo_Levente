package ParcialisBook;

public class Book {
    private  String isbn;
    private String authot;
    private String title;
    private int year;
    private int pages;

    public Book(String isbn, String authot, String title, int year, int pages) {
        this.isbn = isbn;
        this.authot = authot;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthot() {
        return authot;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthot(String authot) {
        this.authot = authot;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
      StringBuilder b=new StringBuilder();

      b.append("ISBN:").append(isbn).append("\n")
              .append("\t").append("Author ").append(authot).append("\n")
              .append("\t").append("Title ").append(title).append("\n")
              .append("\t").append("Year ").append(year).append("\n")
              .append("\t").append("Pages ").append(pages).append("\n");
      return b.toString();
    }
}
