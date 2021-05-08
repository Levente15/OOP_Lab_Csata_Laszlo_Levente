package fel_2;

import java.util.Random;

public class Matrix {
    private int elements[][];
    private int rows;

    public Matrix(int rows) {
        this.rows = rows;
        this.elements = new int[this.rows][this.rows];
    }

    public void randomdfeltoltes() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                this.elements[i][j] = random.nextInt(10);
            }
        }
    }

    public void kiir() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void foatlo() {
        int db = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if ( i==j && elements[i][j] % 2 != 0) {
                    db++;
                }
            }
        }
        if (db == 0) {
            System.out.println("Mindenki paros");
        } else {
            System.out.println(":(( Nem csak paros szam van");
        }
    }

    public void sorvizsgalo(){

        int db=0;
        int paros=0;
        int paratlan=0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (elements[i][j] % 2 == 0) {
                    paros++;
                } else {
                    paratlan++;
                }
            }
                if (paros > paratlan) {
                    db++;
                }
                paratlan=0;
                paros=0;

        }
        System.out.println("Ennyi sorban tobb a paros szamok: "+ db);
    }

}
