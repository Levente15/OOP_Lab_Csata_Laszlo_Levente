package Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(3,3);
        a.fillRandom(1,20);
        System.out.println("***************");
        System.out.println("a rows: " + a.getRows()+", cols: " + a.getColumns());
        System.out.println("a: ");
        a.printMatrix();
        System.out.println();

        Matrix b = new Matrix(2,3);
        b.fillRandom(1,2);
        System.out.println("b: ");
        b.printMatrix();
        System.out.println();

    }
}
