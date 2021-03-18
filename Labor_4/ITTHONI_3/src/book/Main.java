package book;

public class Main {

    public static void main(String[] args) {
	Book book1=new Book();
	book1.setAuthor("Pal");
	book1.setTitle("Vuk");
	book1.setPrice(23);
	book1.setYearofpublication(2020);
        System.out.println(book1.toString());
        book1.increasePrice(23);
		System.out.println(book1.toString());
    }
}
