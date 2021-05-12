package fel3;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product(1,"Alma", 223,21);
        System.out.println(p1);

        Storage storage=new Storage("product.txt");
        storage.printProduct();
        storage.update("product.txt");

    }
}
